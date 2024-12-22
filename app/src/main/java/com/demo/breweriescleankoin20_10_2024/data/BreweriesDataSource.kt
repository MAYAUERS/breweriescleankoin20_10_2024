package com.demo.breweriescleankoin20_10_2024.data

import com.demo.breweriescleankoin20_10_2024.domain.model.Breweries
import retrofit2.Response

interface BreweriesDataSource {

    suspend fun getBreweries() :Response<List<Breweries>>
}