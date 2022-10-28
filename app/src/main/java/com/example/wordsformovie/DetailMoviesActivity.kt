package com.example.wordsformovie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailMoviesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_movies)

        val movies = intent.getParcelableExtra<Movies>(MainActivity.INTENT_PARCELABLE)

        val imgMovies = findViewById<ImageView>(R.id.img_item_photo)
        val nameMovies = findViewById<TextView>(R.id.tv_item_name)
        val descMovies = findViewById<TextView>(R.id.tv_item_description)

        imgMovies.setImageResource(movies?.imgMovies!!)
        nameMovies.text = movies.nameMovies
        descMovies.text = movies.descMovies


    }
}