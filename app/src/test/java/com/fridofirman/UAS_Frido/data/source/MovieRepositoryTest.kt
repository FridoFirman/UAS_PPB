package com.fridofirman.UAS_Frido.data.source

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.paging.DataSource
import com.fridofirman.UAS_Frido.data.source.local.LocalDataSource
import com.fridofirman.UAS_Frido.data.source.local.entity.MovieEntity
import com.fridofirman.UAS_Frido.data.source.local.entity.TvShowEntity
import com.fridofirman.UAS_Frido.data.source.remote.RemoteDataSource
import com.fridofirman.UAS_Frido.utils.AppExecutors
import com.fridofirman.UAS_Frido.utils.DataDummy
import com.fridofirman.UAS_Frido.utils.PagedListUtil
import com.fridofirman.UAS_Frido.vo.Resource
import com.nhaarman.mockitokotlin2.doCallRealMethod
import com.nhaarman.mockitokotlin2.verify
import org.junit.Test

import org.junit.Assert.*
import org.junit.Rule
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock

class MovieRepositoryTest {

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    private val remote = mock(RemoteDataSource::class.java)
    private val local = mock(LocalDataSource::class.java)
    private val appExecutors = mock(AppExecutors::class.java)

    private val movieRepository = FakeMovieRepository(remote, local, appExecutors)
    private val movieReponses = DataDummy.generateRemoteDummyMovies()
    private val tvShowReponses = DataDummy.generateRemoteDummyTvShow()



    @Test
    fun getAllMovies() {
        val dataSourceFactory = mock(DataSource.Factory::class.java) as DataSource.Factory<Int, MovieEntity>
        `when`(local.getAllMovies()).thenReturn(dataSourceFactory)
        movieRepository.getAllMovies()
        val movieEntities = Resource.success(PagedListUtil.mockPagedList(DataDummy.generateDummyMovies()))
        verify(local).getAllMovies()
        assertNotNull(movieEntities.data)
        assertEquals(movieReponses.size.toLong(), movieEntities.data?.size?.toLong())
    }

    @Test
    fun getAllTvShows() {
        val dataSourceFactory = mock(DataSource.Factory::class.java) as DataSource.Factory<Int, TvShowEntity>
        `when`(local.getAllTvShows()).thenReturn(dataSourceFactory)
        movieRepository.getAllTvShows()
        val tvShowEntities = Resource.success(PagedListUtil.mockPagedList(DataDummy.generateDummyTvShow()))
        verify(local).getAllTvShows()
        assertNotNull(tvShowEntities.data)
        assertEquals(tvShowReponses.size.toLong(), tvShowEntities.data?.size?.toLong())
    }

    @Test
    fun setMovieFavorite() {
        doCallRealMethod().`when`(local).setMovieFavorite(DataDummy.generateDummyDetailMovie(), false)
        local.setMovieFavorite(DataDummy.generateDummyDetailMovie(), true)
        verify(local).setMovieFavorite(DataDummy.generateDummyDetailMovie(), true)
    }

    @Test
    fun unSetMovieFavorite(){
        doCallRealMethod().`when`(local).setMovieFavorite(DataDummy.generateDummyDetailMovie(), true)
        local.setMovieFavorite(DataDummy.generateDummyDetailMovie(), false)
        verify(local).setMovieFavorite(DataDummy.generateDummyDetailMovie(), false)
    }

    @Test
    fun setTvShowFavorite(){
        doCallRealMethod().`when`(local).setTvShowFavorite(DataDummy.generateDummyDetailTvShow(), false)
        local.setTvShowFavorite(DataDummy.generateDummyDetailTvShow(), true)
        verify(local).setTvShowFavorite(DataDummy.generateDummyDetailTvShow(), true)
    }

    @Test
    fun unSetTvShowFavorite(){
        doCallRealMethod().`when`(local).setTvShowFavorite(DataDummy.generateDummyDetailTvShow(), true)
        local.setTvShowFavorite(DataDummy.generateDummyDetailTvShow(), false)
        verify(local).setTvShowFavorite(DataDummy.generateDummyDetailTvShow(), false)
    }
}