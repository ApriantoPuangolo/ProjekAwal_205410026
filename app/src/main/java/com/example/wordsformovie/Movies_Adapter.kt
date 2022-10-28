package com.example.wordsformovie

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class Movies_Adapter(private val context: Context, val Movies: List<Movies>, val listener: (Movies) -> Unit)
    : RecyclerView.Adapter<Movies_Adapter.MoviesViewHolder>(){

    class MoviesViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgMovies = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameMovies = view.findViewById<TextView>(R.id.tv_item_name)
        val descMovies = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(movies: Movies, listener: (Movies) -> Unit){
            imgMovies.setImageResource(movies.imgMovies)
            nameMovies.text = movies.nameMovies
            descMovies.text = movies.descMovies
            itemView.setOnClickListener{
                listener(movies)
            }

    }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        return MoviesViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_movie, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        holder.bindView(Movies[position], listener)
    }

    override fun getItemCount(): Int = Movies.size
    }