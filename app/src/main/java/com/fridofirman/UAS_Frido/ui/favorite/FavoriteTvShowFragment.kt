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
import com.fridofirman.UAS_Frido.adapter.FavoriteTvShowAdapter
import com.fridofirman.UAS_Frido.databinding.FragmentFavoriteTvShowBinding
import com.fridofirman.UAS_Frido.viewmodel.ViewModelFactory


class FavoriteTvShowFragment : Fragment() {

    private lateinit var fragmentTvShowBinding: FragmentFavoriteTvShowBinding
    private lateinit var tvShowAdapter: FavoriteTvShowAdapter
    private lateinit var viewModel: FavoriteViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        fragmentTvShowBinding = FragmentFavoriteTvShowBinding.inflate(layoutInflater, container, false)
        return fragmentTvShowBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        itemTouchHelper.attachToRecyclerView(fragmentTvShowBinding.rvFavTvShow)
        if (activity != null) {
            val factory = ViewModelFactory.getInstance(requireActivity())
            viewModel = ViewModelProvider(this, factory)[FavoriteViewModel::class.java]

            tvShowAdapter = FavoriteTvShowAdapter()
            fragmentTvShowBinding.progressBar.visibility = View.VISIBLE
            viewModel.getFavoriteTvShows().observe(viewLifecycleOwner, {tvShows ->
                fragmentTvShowBinding.progressBar.visibility = View.GONE
                tvShowAdapter.submitList(tvShows)
                tvShowAdapter.notifyDataSetChanged()
            })


            with(fragmentTvShowBinding.rvFavTvShow) {
                this.layoutManager = LinearLayoutManager(context)
                this.setHasFixedSize(true)
                this.adapter = tvShowAdapter
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
                val tvShowEntity = tvShowAdapter.getSwipedData(swipedPosition)
                tvShowEntity?.let { viewModel.setFavoriteTvShow(it) }
                val snackbar = Snackbar.make(view as View, R.string.message_undo, Snackbar.LENGTH_LONG)
                snackbar.setAction(R.string.message_ok) { v ->
                    tvShowEntity?.let { viewModel.setFavoriteTvShow(it) }
                }
                snackbar.show()
            }
        }
    })
}