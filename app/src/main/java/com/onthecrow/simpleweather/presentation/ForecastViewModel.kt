package com.onthecrow.simpleweather.presentation

import com.onthecrow.simpleweather.base.BaseViewModel
import com.onthecrow.simpleweather.domain.GetWeatherUseCase
import javax.inject.Inject

class ForecastViewModel
    @Inject
    constructor(
            private val getWeatherUseCase: GetWeatherUseCase
    ): BaseViewModel() {
}