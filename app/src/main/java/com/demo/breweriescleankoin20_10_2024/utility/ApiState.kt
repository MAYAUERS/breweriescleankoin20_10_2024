package com.demo.breweriescleankoin20_10_2024.utility

import com.demo.breweriescleankoin20_10_2024.domain.model.Breweries

sealed class ApiState {

    class Success(var data:List<Breweries>):ApiState()
    class Failure(var msg:Throwable):ApiState()
    object Loading:ApiState()

}