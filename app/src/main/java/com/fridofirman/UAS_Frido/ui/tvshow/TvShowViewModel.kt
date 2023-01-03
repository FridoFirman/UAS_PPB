package com.fridofirman.UAS_Frido.ui.tvshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.paging.PagedList
import com.fridofirman.UAS_Frido.data.source.local.entity.TvShowEntity
import com.fridofirman.UAS_Frido.data.source.MovieRepository
import com.fridofirman.UAS_Frido.vo.Resource

class TvShowViewModel(private val movieRepository: MovieRepository): ViewModel() {
    fun getTvShows(): LiveData<Resource<PagedList<TvShowEntity>>> = movieRepository.getAllTvShows()
}