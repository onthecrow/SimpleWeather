package com.onthecrow.simpleweather.di.fragment

import com.onthecrow.simpleweather.view.ForecastFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
@Suppress("unused")
abstract class FragmentBindingModule {

    @ContributesAndroidInjector(modules = [FragmentViewModelModule::class])
    abstract fun bindForecastFragment(): ForecastFragment
}