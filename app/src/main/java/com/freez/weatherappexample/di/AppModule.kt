package com.freez.weatherappexample.di

import com.freez.weatherappexample.api.ApiService
import com.freez.weatherappexample.utils.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun provideBaseUrl() = Constants.BASE_URL

    @Provides
    @Singleton
    fun provideRetrofitInstance(BASE_URL: String) : ApiService =
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .build()
            .create(ApiService::class.java)
}