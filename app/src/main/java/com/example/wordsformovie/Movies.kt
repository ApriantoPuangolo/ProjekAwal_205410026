package com.example.wordsformovie

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movies(
    val imgMovies: Int,
    val nameMovies: String,
    val descMovies: String
) : Parcelable