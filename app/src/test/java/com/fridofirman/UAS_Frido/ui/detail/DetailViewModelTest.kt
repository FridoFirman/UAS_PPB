package com.fridofirman.UAS_Frido.ui.detail

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.fridofirman.UAS_Frido.data.source.local.entity.MovieEntity
import com.fridofirman.UAS_Frido.data.source.local.entity.TvShowEntity
import com.fridofirman.UAS_Frido.data.source.MovieRepository
import com.fridofirman.UAS_Frido.ui.detail.DetailViewModel
import com.fridofirman.UAS_Frido.utils.DataDummy
import com.fridofirman.UAS_Frido.vo.Resource
import com.nhaarman.mockitokotlin2.verifyNoMoreInteractions
import org.junit.Before
import org.junit.Test

import org.junit.Rule
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.Mockito.verify
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class DetailViewModelTest {

    private lateinit var viewModel: DetailViewModel
    private lateinit var viewModel2: DetailViewModel
    private val dummyMovie = DataDummy.generateDummyDetailMovie()
    private val dummyMovieId = dummyMovie.id
    private val dummyTvShow = DataDummy.generateDummyDetailTvShow()
    private val dummyTvShowId = dummyTvShow.id
    private val movieId = dummyMovie.id
    private val tvShowId = dummyTvShow.id

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var movieRepository: MovieRepository


    @Mock
    private lateinit var movieObserver: Observer<Resource<MovieEntity>>

    @Mock
    private lateinit var tvShowObserver: Observer<Resource<TvShowEntity>>

    @Before
    fun setUp() {
        viewModel = DetailViewModel(movieRepository)
        viewModel2 = DetailViewModel(movieRepository)
        viewModel.setSelectedMovie(movieId)
        viewModel2.setSelectedMovie(tvShowId)
    }

    @Test
    fun getMovieDetail() {
        val dummyDetailMovie = Resource.success(DataDummy.generateDummyDetailMovie())
        val movie = MutableLiveData<Resource<MovieEntity>>()
        movie.value = dummyDetailMovie

        `when`(movieRepository.getMovieById(dummyMovieId)).thenReturn(movie)

        viewModel.setSelectedMovie(dummyMovieId)
        viewModel.getMovie().observeForever(movieObserver)
        verify(movieObserver).onChanged(dummyDetailMovie)
    }

    @Test
    fun getTvShowDetail() {
        val dummyDetailTvShow = Resource.success(DataDummy.generateDummyDetailTvShow())
        val tvShow = MutableLiveData<Resource<TvShowEntity>>()
        tvShow.value = dummyDetailTvShow

        `when`(movieRepository.getTvShowById(dummyTvShowId)).thenReturn(tvShow)

        viewModel.setSelectedMovie(dummyTvShowId)
        viewModel.getTvShow().observeForever(tvShowObserver)
        verify(tvShowObserver).onChanged(dummyDetailTvShow)
    }

    @Test
    fun setMovieFavorite(){
        val dummyMovie = Resource.success(DataDummy.generateDummyDetailMovie())
        val movie = MutableLiveData<Resource<MovieEntity>>()
        movie.value = dummyMovie
        viewModel.setSelectedMovie(dummyMovieId)
        viewModel.setMovieResource(movie.value!!.data!!)
        viewModel.setFavoriteMovie()
        verifyNoMoreInteractions(movieObserver)
    }

    @Test
    fun setTvShowFavorite(){
        val dummyDetailTvShow = Resource.success(DataDummy.generateDummyDetailTvShow())
        val tvShow = MutableLiveData<Resource<TvShowEntity>>()
        tvShow.value = dummyDetailTvShow
        viewModel.setSelectedMovie(dummyTvShowId)
        viewModel.setTvShowResource(tvShow.value!!.data!!)
        viewModel.setFavoriteTvShow()
        verifyNoMoreInteractions(tvShowObserver)
    }

}