package com.demo.breweriescleankoin20_10_2024.di

import com.demo.breweriescleankoin20_10_2024.data.BreweriesDataSource
import com.demo.breweriescleankoin20_10_2024.data.BreweriesDataSourceImpl
import com.demo.breweriescleankoin20_10_2024.data.BreweriesRepositoryImpl
import com.demo.breweriescleankoin20_10_2024.domain.repository.BreweriesRepository
import com.demo.breweriescleankoin20_10_2024.domain.usecase.BreweriesUsecase
import com.demo.breweriescleankoin20_10_2024.viewmodel.BrewriesViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


var dataModule = module {
        single<BreweriesDataSource> { BreweriesDataSourceImpl(apiService = get()) }
        single<BreweriesRepository> { BreweriesRepositoryImpl(breweriesDataSource = get()) }
}

var domainModule = module {
        factory { BreweriesUsecase(breweriesRepository = get()) }
}

var ViewModelModule = module {
        viewModel { BrewriesViewModel(breweriesUsecase = get()) }
}