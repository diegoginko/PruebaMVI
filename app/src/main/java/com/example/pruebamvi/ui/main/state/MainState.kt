package com.example.pruebamvi.ui.main.state

import com.example.pruebamvi.model.Film

sealed class MainState{

    object Idle: MainState()
    object Loading: MainState()
    data class LoadFilms(val films: List<Film>): MainState()
    data class Error(val error: String?) : MainState()
}
