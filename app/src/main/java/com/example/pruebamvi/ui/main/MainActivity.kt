package com.example.pruebamvi.ui.main

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pruebamvi.R
import com.example.pruebamvi.api.RetrofitBuilder
import com.example.pruebamvi.api.SwApiImpl
import com.example.pruebamvi.model.Film
import com.example.pruebamvi.ui.main.state.MainState
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var filmsAdapter = FilmsAdapter(listOf())
    private val mainActivityViewModel: MainViewModel by viewModels { MainViewModelFactory(
        SwApiImpl(RetrofitBuilder.apiService)
    )}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupUI()
        setupObserveViewModel()

    }

    private fun setupUI(){
        rv_films.layoutManager = LinearLayoutManager(this)
        rv_films.run {
            adapter = filmsAdapter
        }
    }

    private fun setupActions(){

    }

    private fun setupObserveViewModel(){
        mainActivityViewModel.viewState.observe(this, Observer {
            when(it){
                is MainState.Idle ->{
                    tvIdle.visibility = View.VISIBLE
                    rv_films.visibility = View.GONE
                }
                is MainState.Loading ->{

                }
                is MainState.LoadFilms ->{
                    tvIdle.visibility = View.GONE
                    rv_films.visibility = View.VISIBLE
                    renderList(it.films)
                }
                is MainState.Error ->{

                }
                else -> {

                }
            }
        })
    }

    private fun renderList(filmsList : List<Film>){
        filmsAdapter.setFilms(filmsList)
        filmsAdapter.notifyDataSetChanged()
    }
}