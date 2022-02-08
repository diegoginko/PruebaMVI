package com.example.pruebamvi.api

import com.example.pruebamvi.model.ApiResponse
import retrofit2.http.GET

interface SwApiService {

    @GET("films")
    suspend fun listFilms(): ApiResponse
}