package com.fridofirman.UAS_Frido.ui.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.fridofirman.UAS_Frido.data.source.local.entity.MovieEntity
import com.fridofirman.UAS_Frido.data.source.local.entity.TvShowEntity
import com.fridofirman.UAS_Frido.data.source.MovieRepository
import com.fridofirman.UAS_Frido.vo.Resource

class DetailViewModel(private val movieRepository: MovieRepository): ViewModel() {
    val detailId = MutableLiveData<String>()
    val movieEntity = MutableLiveData<MovieEntity>()
    val tvShowEntity = MutableLiveData<TvShowEntity>()

    fun setSelectedMovie(detailId: String){
        this.detailId.value = detailId
    }

    fun getMovie(): LiveData<Resource<MovieEntity>> = Transformations.switchMap(detailId) { detail ->
        movieRepository.getMovieById(detail)
    }

    fun getTvShow(): LiveData<Resource<TvShowEntity>> = Transformations.switchMap(detailId) { detail ->
        movieRepository.getTvShowById(detail)
    }

    fun setMovieResource(movieEntity: MovieEntity){
        this.movieEntity.value = movieEntity
    }

    fun setTvShowResource(tvShowEntity: TvShowEntity){
        this.tvShowEntity.value = tvShowEntity
    }

    fun setFavoriteMovie(){
        val resource = movieEntity.value
        if (resource != null){
            val newState = !resource.favorite
            movieRepository.setMovieFavorite(resource, newState)
        }
    }

    fun setFavoriteTvShow(){
        val resource = tvShowEntity.value
        if (resource != null){
            val newState = !resource.favorite
            movieRepository.setTvShowFavorite(resource, newState)
        }
    }


}