package com.fridofirman.UAS_Frido.ui.favorite

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import com.fridofirman.UAS_Frido.R
import com.fridofirman.UAS_Frido.adapter.FavoriteMovieAdapter
import com.fridofirman.UAS_Frido.databinding.FragmentFavoriteMovieBinding
import com.fridofirman.UAS_Frido.viewmodel.ViewModelFactory


class FavoriteMovieFragment : Fragment() {

    private lateinit var fragmentMovieBinding: FragmentFavoriteMovieBinding
    private lateinit var movieAdapter : FavoriteMovieAdapter
    private lateinit var viewModel: FavoriteViewModel


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        fragmentMovieBinding = FragmentFavoriteMovieBinding.inflate(layoutInflater, container, false)
        return fragmentMovieBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        itemTouchHelper.attachToRecyclerView(fragmentMovieBinding.rvFavMovie)
        if (activity != null) {
            val factory = ViewModelFactory.getInstance(requireActivity())
            viewModel = ViewModelProvider(this, factory)[FavoriteViewModel::class.java]

            movieAdapter = FavoriteMovieAdapter()
            fragmentMovieBinding.progressBar.visibility = View.VISIBLE
            viewModel.getFavoriteMovies().observe(viewLifecycleOwner, {movies ->
                fragmentMovieBinding.progressBar.visibility = View.GONE
                movieAdapter.submitList(movies)
                movieAdapter.notifyDataSetChanged()
            })


            with(fragmentMovieBinding.rvFavMovie) {
                this.layoutManager = LinearLayoutManager(context)
                this.setHasFixedSize(true)
                this.adapter = movieAdapter
            }
        }
    }

    private val itemTouchHelper = ItemTouchHelper(object : ItemTouchHelper.Callback() {
        override fun getMovementFlags(recyclerView: RecyclerView, viewHolder: RecyclerView.ViewHolder): Int =
                makeMovementFlags(0, ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT)
        override fun onMove(recyclerView: RecyclerView, viewHolder: RecyclerView.ViewHolder, target: RecyclerView.ViewHolder): Boolean = true
        override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
            if (view != null) {
                val swipedPosition = viewHolder.adapterPosition
                val movieEntity = movieAdapter.getSwipedData(swipedPosition)
                movieEntity?.let { viewModel.setFavoriteMovie(it) }
                val snackbar = Snackbar.make(view as View, R.string.message_undo, Snackbar.LENGTH_LONG)
                snackbar.setAction(R.string.message_ok) { v ->
                    movieEntity?.let { viewModel.setFavoriteMovie(it) }
                }
                snackbar.show()
            }
        }
    })
}