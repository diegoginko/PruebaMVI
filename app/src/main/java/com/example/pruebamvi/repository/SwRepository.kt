package com.example.pruebamvi.repository

import com.example.pruebamvi.api.SwApi

class SwRepository(private val swApi: SwApi) {

    suspend fun getFilms() = swApi.getFilms()

}