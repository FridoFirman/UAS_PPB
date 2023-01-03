package com.fridofirman.UAS_Frido.data.source

import androidx.lifecycle.LiveData
import androidx.paging.PagedList
import com.fridofirman.UAS_Frido.data.source.local.entity.MovieEntity
import com.fridofirman.UAS_Frido.data.source.local.entity.TvShowEntity
import com.fridofirman.UAS_Frido.vo.Resource

interface MovieDataSource {
    fun getAllMovies(): LiveData<Resource<PagedList<MovieEntity>>>
    fun getAllTvShows(): LiveData<Resource<PagedList<TvShowEntity>>>
    fun getFavoriteMovie(): LiveData<PagedList<MovieEntity>>
    fun getFavoriteTvShow(): LiveData<PagedList<TvShowEntity>>
    fun getMovieById(id: String): LiveData<Resource<MovieEntity>>
    fun getTvShowById(id: String): LiveData<Resource<TvShowEntity>>
    fun setMovieFavorite(movie: MovieEntity, state: Boolean)
    fun setTvShowFavorite(tvShow: TvShowEntity, state: Boolean)
}