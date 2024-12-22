package com.demo.breweriescleankoin20_10_2024.di

import com.demo.breweriescleankoin20_10_2024.network.ApiService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

var NetworkModule = module {

    single { provideRetrofit(okHttpClient = get()) }
    factory { provideOkHttpClient(httpLoggingInterceptor = get()) }
    factory { getApiService(retrofit = get()) }
    factory { HttpLoggingInterceptor() }
}

fun provideRetrofit(okHttpClient: OkHttpClient):Retrofit =
    Retrofit.Builder().baseUrl("https://api.openbrewerydb.org/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(okHttpClient)
                    .build()

fun provideOkHttpClient(httpLoggingInterceptor: HttpLoggingInterceptor)
:OkHttpClient = OkHttpClient().newBuilder()
    .addInterceptor(httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY))
    .build()

fun getApiService(retrofit: Retrofit):ApiService = retrofit.create(ApiService::class.java)