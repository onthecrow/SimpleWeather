package com.onthecrow.simpleweather.di

import com.onthecrow.simpleweather.domain.GetWeatherUseCase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class UseCaseModule {

    @Provides
    @Singleton
    fun provideGetWeatherUseCase(): GetWeatherUseCase = GetWeatherUseCase()
}