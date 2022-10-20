package com.example.weather_api.models

import java.io.Serializable

data class Sys (
    val sunset: Int,
    val sunrise: Int,
    val country: String,
    val message: Double,
    val type: Int
        ): Serializable