package com.fridofirman.UAS_Frido.ui.favorite

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fridofirman.UAS_Frido.R
import com.fridofirman.UAS_Frido.adapter.SectionsPagerAdapter
import com.fridofirman.UAS_Frido.databinding.FragmentFavoriteBinding

class FavoriteFragment : Fragment() {

    private lateinit var fragmentFavoriteBinding: FragmentFavoriteBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        fragmentFavoriteBinding = FragmentFavoriteBinding.inflate(layoutInflater, container, false)
        val sectionsPagerAdapter = SectionsPagerAdapter(requireActivity(), childFragmentManager)
        fragmentFavoriteBinding.viewPager.adapter = sectionsPagerAdapter
        fragmentFavoriteBinding.tabs.setupWithViewPager(fragmentFavoriteBinding.viewPager)
        return fragmentFavoriteBinding.root
    }

}