package com.example.weather_api.models

import java.io.Serializable

data class Wind(
    val speed: Double,
    val deg: Int,
    val gust: Double
) : Serializable
