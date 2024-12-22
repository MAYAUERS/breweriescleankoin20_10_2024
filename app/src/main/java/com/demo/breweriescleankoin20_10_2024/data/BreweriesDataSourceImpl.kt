package com.demo.breweriescleankoin20_10_2024.data

import com.demo.breweriescleankoin20_10_2024.domain.model.Breweries
import com.demo.breweriescleankoin20_10_2024.network.ApiService
import retrofit2.Response

class BreweriesDataSourceImpl(private var apiService: ApiService):BreweriesDataSource {
    override suspend fun getBreweries(): Response<List<Breweries>> = apiService.getBreweries()

}