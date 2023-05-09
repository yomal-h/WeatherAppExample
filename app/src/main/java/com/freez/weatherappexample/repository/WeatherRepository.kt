package com.freez.weatherappexample.repository

import com.freez.weatherappexample.api.ApiService
import javax.inject.Inject

class WeatherRepository
@Inject
constructor(private val apiService: ApiService) {

    suspend fun getWeather() = apiService.getWeather()
}