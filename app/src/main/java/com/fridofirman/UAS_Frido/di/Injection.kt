package com.fridofirman.UAS_Frido.di

import android.content.Context
import com.fridofirman.UAS_Frido.data.source.MovieRepository
import com.fridofirman.UAS_Frido.data.source.local.LocalDataSource
import com.fridofirman.UAS_Frido.data.source.local.room.MovieDatabase
import com.fridofirman.UAS_Frido.data.source.remote.RemoteDataSource
import com.fridofirman.UAS_Frido.utils.AppExecutors
import com.fridofirman.UAS_Frido.utils.JsonHelper

object Injection {
    fun provideRepository(context: Context): MovieRepository {

        val database = MovieDatabase.getInstance(context)

        val remoteDataSource = RemoteDataSource.getInstance(JsonHelper(context))
        val localDataSource = LocalDataSource.getInstance(database.movieDao())
        val appExecutors = AppExecutors()
        return MovieRepository.getInstance(remoteDataSource, localDataSource, appExecutors)
    }
}