package com.onthecrow.simpleweather.di

import com.onthecrow.simpleweather.SimpleWeatherApplication
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidSupportInjectionModule::class, ApplicationModule::class,
                      RetrofitCreatorModule::class, RetrofitModule::class, RepositoryModule::class,
                      UseCaseModule::class, ViewModelModule::class])
interface ApplicationComponent : AndroidInjector<SimpleWeatherApplication> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<SimpleWeatherApplication>()
}