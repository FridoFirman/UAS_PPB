package com.fridofirman.UAS_Frido.ui.movie

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.paging.PagedList
import com.fridofirman.UAS_Frido.data.source.local.entity.MovieEntity
import com.fridofirman.UAS_Frido.data.source.MovieRepository
import com.fridofirman.UAS_Frido.vo.Resource

class MovieViewModel(private val movieRepository: MovieRepository) : ViewModel() {
    fun getMovies(): LiveData<Resource<PagedList<MovieEntity>>> = movieRepository.getAllMovies()
}