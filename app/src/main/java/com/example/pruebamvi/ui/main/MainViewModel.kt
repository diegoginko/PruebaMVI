package com.example.pruebamvi.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.pruebamvi.repository.SwRepository
import com.example.pruebamvi.ui.main.state.MainState

class MainViewModel(
    private val respository: SwRepository
) : ViewModel() {


    private val _viewState: MutableLiveData<MainState> = MutableLiveData<MainState>(MainState.Idle)
    val viewState: LiveData<MainState>
        get() = _viewState


}