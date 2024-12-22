package com.demo.breweriescleankoin20_10_2024.domain.repository

import com.demo.breweriescleankoin20_10_2024.domain.model.Breweries
import retrofit2.Response

interface BreweriesRepository {

    suspend fun getBreweries():Response<List<Breweries>>
}