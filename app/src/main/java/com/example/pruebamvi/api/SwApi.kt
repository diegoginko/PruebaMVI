package com.example.pruebamvi.api

import com.example.pruebamvi.model.Film

interface SwApi {

    suspend fun getFilms() : List<Film>

}