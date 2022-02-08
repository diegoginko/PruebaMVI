package com.example.pruebamvi.ui.main

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pruebamvi.model.Film

class FilmsAdapter(
    private var filmsList: List<Film>
): RecyclerView.Adapter<FilmsAdapter.FilmsAdapterRecyclerViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): FilmsAdapterRecyclerViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: FilmsAdapterRecyclerViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return filmsList.size
    }

    fun setFilms(newFilmsList : List<Film>){
        filmsList = newFilmsList
    }

    class FilmsAdapterRecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(film : Film){

        }
    }
}