package com.fridofirman.UAS_Frido.ui.favorite

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.paging.PagedList
import com.fridofirman.UAS_Frido.data.source.MovieRepository
import com.fridofirman.UAS_Frido.ui.favorite.FavoriteViewModel
import com.fridofirman.UAS_Frido.data.source.local.entity.MovieEntity
import com.fridofirman.UAS_Frido.data.source.local.entity.TvShowEntity
import com.fridofirman.UAS_Frido.utils.DataDummy
import com.nhaarman.mockitokotlin2.verifyNoMoreInteractions
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*
import org.junit.Rule
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.Mockito.verify
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class FavoriteViewModelTest {

    private lateinit var viewModel: FavoriteViewModel

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var movieRepository: MovieRepository

    @Mock
    private lateinit var movieObserver: Observer<PagedList<MovieEntity>>

    @Mock
    private lateinit var tvShowObserver: Observer<PagedList<TvShowEntity>>

    @Mock
    private lateinit var moviePagedList: PagedList<MovieEntity>

    @Mock
    private lateinit var tvShowPagedList: PagedList<TvShowEntity>



    @Before
    fun setUp() {
        viewModel = FavoriteViewModel(movieRepository)
    }

    @Test
    fun getFavoriteMovies() {
        val dummyMovies = moviePagedList
        `when`(dummyMovies.size).thenReturn(10)
        val movies = MutableLiveData<PagedList<MovieEntity>>()
        movies.value = dummyMovies

        `when`(movieRepository.getFavoriteMovie()).thenReturn(movies)
        val movieEntities = viewModel.getFavoriteMovies().value
        assertNotNull(movieEntities)
        assertEquals(10, movieEntities?.size)

        viewModel.getFavoriteMovies().observeForever(movieObserver)
        verify(movieObserver).onChanged(dummyMovies)
    }

    @Test
    fun getFavoriteTvShows() {
        val dummyTvShows = tvShowPagedList
        `when`(dummyTvShows.size).thenReturn(10)
        val tvShows = MutableLiveData<PagedList<TvShowEntity>>()
        tvShows.value = dummyTvShows
        `when`(movieRepository.getFavoriteTvShow()).thenReturn(tvShows)
        val tvShowEntities = viewModel.getFavoriteTvShows().value
        assertNotNull(tvShowEntities)
        assertEquals(10, tvShowEntities?.size)

        viewModel.getFavoriteTvShows().observeForever(tvShowObserver)
        verify(tvShowObserver).onChanged(dummyTvShows)
    }

    @Test
    fun setFavoriteMovie(){
        viewModel.setFavoriteMovie(DataDummy.generateDummyDetailMovie())
        verify(movieRepository).setMovieFavorite(DataDummy.generateDummyDetailMovie(), true)
        verifyNoMoreInteractions(movieRepository)
    }

    @Test
    fun setFavoriteTvShow(){
        viewModel.setFavoriteTvShow(DataDummy.generateDummyDetailTvShow())
        verify(movieRepository).setTvShowFavorite(DataDummy.generateDummyDetailTvShow(), true)
        verifyNoMoreInteractions(movieRepository)
    }


}