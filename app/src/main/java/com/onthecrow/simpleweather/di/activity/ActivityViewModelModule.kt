package com.onthecrow.simpleweather.di.activity

import android.arch.lifecycle.ViewModelProviders
import com.onthecrow.simpleweather.di.ViewModelFactory
import com.onthecrow.simpleweather.presentation.ForecastViewModel
import com.onthecrow.simpleweather.view.ForecastActivity
import dagger.Module
import dagger.Provides

@Module
class ActivityViewModelModule {

    @Provides
    fun provideForecastViewModel(viewModelFactory: ViewModelFactory, forecastActivity: ForecastActivity): ForecastViewModel =
            ViewModelProviders.of(forecastActivity, viewModelFactory).get(ForecastViewModel::class.java)
}