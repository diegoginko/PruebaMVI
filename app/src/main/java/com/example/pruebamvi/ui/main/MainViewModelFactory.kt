package com.example.pruebamvi.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.pruebamvi.api.SwApi
import com.example.pruebamvi.repository.SwRepository
import java.lang.IllegalArgumentException

class MainViewModelFactory(private val swApi: SwApi) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(MainViewModel::class.java)){
            return MainViewModel(SwRepository(swApi)) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }
}