package com.onthecrow.simpleweather.di.activity

import com.onthecrow.simpleweather.view.ForecastActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
@Suppress("unused")
abstract class ActivityBindingModule {

    @ContributesAndroidInjector(modules = [ActivityViewModelModule::class])
    abstract fun bindForecastActivity(): ForecastActivity
}