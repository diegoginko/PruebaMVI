package com.example.pruebamvi.api

import com.example.pruebamvi.model.Film

class SwApiImpl(private val swApiService: SwApiService) : SwApi {
    override suspend fun getFilms(): List<Film> {
        var returnList = listOf<Film>()

        swApiService.listFilms().results?.let {
            returnList = it
        }

        return returnList
    }
}