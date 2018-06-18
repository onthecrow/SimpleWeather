package com.onthecrow.simpleweather.view

import android.os.Bundle
import com.onthecrow.simpleweather.R
import com.onthecrow.simpleweather.base.BaseActivity
import com.onthecrow.simpleweather.presentation.ForecastViewModel
import javax.inject.Inject

class ForecastActivity : BaseActivity() {

    @Inject
    lateinit var forecastViewModel: ForecastViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forecast)
    }
}
