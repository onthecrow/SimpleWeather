package com.onthecrow.simpleweather.di.fragment

import android.arch.lifecycle.ViewModelProviders
import com.onthecrow.simpleweather.di.ViewModelFactory
import com.onthecrow.simpleweather.presentation.ForecastViewModel
import com.onthecrow.simpleweather.view.ForecastFragment
import dagger.Module
import dagger.Provides

@Module
class FragmentViewModelModule {

    @Provides
    fun provideForecastViewModel(viewModelFactory: ViewModelFactory, forecastFragment: ForecastFragment): ForecastViewModel =
            ViewModelProviders.of(forecastFragment, viewModelFactory).get(ForecastViewModel::class.java)
}