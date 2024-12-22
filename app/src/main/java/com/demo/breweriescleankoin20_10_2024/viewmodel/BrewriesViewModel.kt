package com.demo.breweriescleankoin20_10_2024.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.demo.breweriescleankoin20_10_2024.domain.model.Breweries
import com.demo.breweriescleankoin20_10_2024.domain.usecase.BreweriesUsecase
import kotlinx.coroutines.launch

class BrewriesViewModel(private var breweriesUsecase: BreweriesUsecase):ViewModel() {

    val breweries:LiveData<List<Breweries>> get() = _breweries
    private var _breweries = MutableLiveData<List<Breweries>>()

    private val breweriesError:LiveData<String> get() = _breweriesError
    private var _breweriesError = MutableLiveData<String>()

    fun getBreweries(){
        viewModelScope.launch{
            val response = breweriesUsecase.invoke()
            if (response.isSuccessful){
                _breweries.value = response.body()
            }else{
              _breweriesError.value = response.errorBody().toString()
            }
        }
    }
}