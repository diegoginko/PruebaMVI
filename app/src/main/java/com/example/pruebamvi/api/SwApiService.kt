package com.example.pruebamvi.api

import retrofit2.http.GET

interface SwApiService {

    @GET("films")
    suspend fun listFilms(): List<*>
}