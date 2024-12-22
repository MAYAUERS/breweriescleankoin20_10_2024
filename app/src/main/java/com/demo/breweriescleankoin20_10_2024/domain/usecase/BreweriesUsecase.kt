package com.demo.breweriescleankoin20_10_2024.domain.usecase

import com.demo.breweriescleankoin20_10_2024.domain.model.Breweries
import com.demo.breweriescleankoin20_10_2024.domain.repository.BreweriesRepository
import retrofit2.Response

class BreweriesUsecase(private var breweriesRepository: BreweriesRepository) {

    suspend operator fun invoke():Response<List<Breweries>> = breweriesRepository.getBreweries()
}