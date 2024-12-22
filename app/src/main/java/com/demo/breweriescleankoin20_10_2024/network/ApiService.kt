package com.demo.breweriescleankoin20_10_2024.network

import com.demo.breweriescleankoin20_10_2024.domain.model.Breweries
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    //https://api.openbrewerydb.org/breweries
    @GET("breweries")
    suspend fun getBreweries():Response<List<Breweries>>
}