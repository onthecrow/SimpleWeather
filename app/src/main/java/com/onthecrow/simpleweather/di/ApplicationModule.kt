package com.onthecrow.simpleweather.di

import android.app.Application
import android.content.Context
import com.onthecrow.simpleweather.di.activity.ActivityBindingModule
import com.onthecrow.simpleweather.di.fragment.FragmentBindingModule
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [ActivityBindingModule::class, FragmentBindingModule::class])
class ApplicationModule {

    @Provides
    @Singleton
    fun provideContext(application: Application): Context = application.applicationContext
}