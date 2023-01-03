package com.fridofirman.UAS_Frido.utils

import android.content.Context
import com.fridofirman.UAS_Frido.R
import com.fridofirman.UAS_Frido.data.source.remote.response.MovieResponse
import com.fridofirman.UAS_Frido.data.source.remote.response.TvShowResponse
import org.json.JSONException
import org.json.JSONObject
import java.io.IOException

class JsonHelper(private val context: Context)
{
    private fun parsingFileToString(fileName: String): String? {
        return try {
            val `is` = context.assets.open(fileName)
            val buffer = ByteArray(`is`.available())
            `is`.read(buffer)
            `is`.close()
            String(buffer)

        } catch (ex: IOException) {
            ex.printStackTrace()
            null
        }
    }

    fun loadMovies(): List<MovieResponse> {
        val list = ArrayList<MovieResponse>()

        try{

            val responseObject = JSONObject(parsingFileToString("MovieResponses.json").toString())
            val listArray = responseObject.getJSONArray("results")
            for (i in 0 until listArray.length()) {
                val movie = listArray.getJSONObject(i)

                val id = movie.getString("id")
                val title = movie.getString("title")
                val description = movie.getString("overview")
                val category = movie.getString("genres")
                val releaseDate = movie.getString("release_date")
                val score = movie.getDouble("vote_average")
                val poster = context.getString(R.string.url_tmdb) + movie.getString("poster_path")
                val type = movie.getString("media_type")
                val movieResponse = MovieResponse(id, title, description, category, releaseDate, score, poster, type)
                list.add(movieResponse)
            }
        }catch (e: JSONException){
            e.printStackTrace()
        }
        return list

    }

    fun loadTvShows(): List<TvShowResponse> {
        val list = ArrayList<TvShowResponse>()

        try{

            val responseObject = JSONObject(parsingFileToString("TvShowResponses.json").toString())
            val listArray = responseObject.getJSONArray("results")
            for (i in 0 until listArray.length()) {
                val movie = listArray.getJSONObject(i)

                val id = movie.getString("id")
                val title = movie.getString("name")
                val description = movie.getString("overview")
                val category = movie.getString("genres")
                val releaseDate = movie.getString("first_air_date")
                val score = movie.getDouble("vote_average")
                val poster = context.getString(R.string.url_tmdb) + movie.getString("poster_path")
                val type = movie.getString("media_type")
                val tvShowResponse = TvShowResponse(id, title, description, category, releaseDate, score, poster, type)
                list.add(tvShowResponse)
            }
        }catch (e: JSONException){
            e.printStackTrace()
        }
        return list
    }
}