package com.demo.breweriescleankoin20_10_2024.data

import com.demo.breweriescleankoin20_10_2024.domain.model.Breweries
import com.demo.breweriescleankoin20_10_2024.domain.repository.BreweriesRepository
import retrofit2.Response

class BreweriesRepositoryImpl(private var breweriesDataSource: BreweriesDataSource)
    :BreweriesRepository{
    override suspend fun getBreweries(): Response<List<Breweries>> = breweriesDataSource.getBreweries()
}