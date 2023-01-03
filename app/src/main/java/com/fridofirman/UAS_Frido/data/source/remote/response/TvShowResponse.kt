package com.fridofirman.UAS_Frido.data.source.remote.response

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class TvShowResponse (
        var id: String,
        var title: String,
        var description: String,
        var category: String,
        var releaseDate: String,
        var score: Double,
        var poster: String,
        var type: String,
        var favorite: Boolean = false
): Parcelable