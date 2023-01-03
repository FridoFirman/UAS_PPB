package com.fridofirman.UAS_Frido.ui.detail

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.google.android.material.snackbar.Snackbar
import com.fridofirman.UAS_Frido.R
import com.fridofirman.UAS_Frido.data.source.local.entity.MovieEntity
import com.fridofirman.UAS_Frido.data.source.local.entity.TvShowEntity
import com.fridofirman.UAS_Frido.databinding.ActivityDetailBinding
import com.fridofirman.UAS_Frido.databinding.ContentDetailBinding
import com.fridofirman.UAS_Frido.viewmodel.ViewModelFactory
import com.fridofirman.UAS_Frido.vo.Resource
import com.fridofirman.UAS_Frido.vo.Status

class DetailActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var detailContentBinding: ContentDetailBinding
    private lateinit var activityDetailBinding: ActivityDetailBinding


    private lateinit var viewModel: DetailViewModel

    companion object {
        const val EXTRA_MOVIE = "extra_movie"
        const val EXTRA_MOVIE_TYPE = "extra_movie_type"
        private var statusFavorite = false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activityDetailBinding = ActivityDetailBinding.inflate(layoutInflater)
        detailContentBinding = activityDetailBinding.detailContent

        setContentView(activityDetailBinding.root)
        setSupportActionBar(activityDetailBinding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val factory = ViewModelFactory.getInstance(this)
        viewModel = ViewModelProvider(this, factory)[DetailViewModel::class.java]


        val extras = intent.extras
        if (extras != null) {
            val extraId = extras.getString(EXTRA_MOVIE)
            if (extraId != null) {

                viewModel.setSelectedMovie(extraId)

                if (extras.getString(EXTRA_MOVIE_TYPE) == "movie") {
                    viewModel.getMovie().observe(this, { movie ->
                        if (movie != null) {
                            when (movie.status) {
                                Status.LOADING -> activityDetailBinding.progressBar.visibility =
                                    View.VISIBLE
                                Status.SUCCESS -> {
                                    if (movie.data != null) {
                                        viewModel.setMovieResource(movie.data!!)
                                        activityDetailBinding.progressBar.visibility = View.GONE
                                        val state = movie.data!!.favorite
                                        statusFavorite = state
                                        setStatusFavorite(state)
                                        populateMovie(movie)
                                    }
                                }
                                Status.ERROR -> {
                                    activityDetailBinding.progressBar.visibility = View.GONE
                                    Toast.makeText(
                                        applicationContext,
                                        "Terjadi kesalahan",
                                        Toast.LENGTH_SHORT
                                    ).show()
                                }
                            }
                        }
                    })

                } else {
                    viewModel.getTvShow().observe(this, { tvShow ->
                        if (tvShow != null) {
                            when (tvShow.status) {
                                Status.LOADING -> activityDetailBinding.progressBar.visibility =
                                    View.VISIBLE
                                Status.SUCCESS -> {
                                    if (tvShow.data != null){
                                        viewModel.setTvShowResource(tvShow.data!!)
                                        activityDetailBinding.progressBar.visibility = View.GONE
                                        val state = tvShow.data!!.favorite
                                        statusFavorite = state
                                        setStatusFavorite(state)
                                        populateTvShow(tvShow)
                                    }
                                }
                                Status.ERROR -> {
                                    activityDetailBinding.progressBar.visibility = View.GONE
                                    Toast.makeText(
                                        applicationContext,
                                        "Terjadi kesalahan",
                                        Toast.LENGTH_SHORT
                                    ).show()
                                }
                            }
                        }
                    })
                }
            }
        }

        activityDetailBinding.fab.setOnClickListener(this)
        setStatusFavorite(statusFavorite)
    }

    private fun setStatusFavorite(statusFavorite: Boolean){
        if(statusFavorite){
            activityDetailBinding.fab.setImageResource(R.drawable.ic_favorite)
        }else{
            activityDetailBinding.fab.setImageResource(R.drawable.ic_favorite_empty)
        }
    }


    private fun populateTvShow(tvShow: Resource<TvShowEntity>) {
        detailContentBinding.tvDetailScore.text =
            String.format(getString(R.string.score_value), tvShow.data?.score)
        detailContentBinding.tvDetailTitle.text = tvShow.data?.title
        detailContentBinding.tvDetailDescription.text = tvShow.data?.description
        detailContentBinding.tvDetailCategories.text = tvShow.data?.category
        detailContentBinding.tvDetailRelease.text = tvShow.data?.releaseDate
        Glide.with(this)
            .load(tvShow.data?.poster)
            .transform(RoundedCorners(20))
            .apply(
                RequestOptions.placeholderOf(R.drawable.ic_loading)
                    .error(R.drawable.ic_error)
            )
            .into(detailContentBinding.imgDetailPoster)

    }

    private fun populateMovie(movie: Resource<MovieEntity>) {
        detailContentBinding.tvDetailTitle.text = movie.data?.title
        detailContentBinding.tvDetailDescription.text = movie.data?.description
        detailContentBinding.tvDetailCategories.text = movie.data?.category
        detailContentBinding.tvDetailScore.text =
            String.format(getString(R.string.score_value), movie.data?.score)
        detailContentBinding.tvDetailRelease.text = movie.data?.releaseDate
        Glide.with(this)
            .load(movie.data?.poster)
            .transform(RoundedCorners(20))
            .apply(
                RequestOptions.placeholderOf(R.drawable.ic_loading)
                    .error(R.drawable.ic_error)
            )
            .into(detailContentBinding.imgDetailPoster)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.fab -> {
                statusFavorite = !statusFavorite
                if(statusFavorite){
                    Snackbar.make(activityDetailBinding.root, "Berhasil ditambahkan ke daftar favorit", Snackbar.LENGTH_SHORT).show()
                }else{
                    Snackbar.make(activityDetailBinding.root, "Berhasil dihapus dari daftar favorit", Snackbar.LENGTH_SHORT).show()
                }
                viewModel.setFavoriteMovie()
                viewModel.setFavoriteTvShow()
                setStatusFavorite(statusFavorite)
            }
        }
    }
}


