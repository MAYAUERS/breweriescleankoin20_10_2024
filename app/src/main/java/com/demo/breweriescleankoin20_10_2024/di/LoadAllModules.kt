package com.demo.breweriescleankoin20_10_2024.di

import org.koin.core.context.loadKoinModules

object LoadAllModules {

    fun init() = loadKoinModules(listOf(NetworkModule, domainModule, ViewModelModule, dataModule))
}