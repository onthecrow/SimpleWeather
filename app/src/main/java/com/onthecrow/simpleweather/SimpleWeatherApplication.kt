package com.onthecrow.simpleweather

import com.onthecrow.simpleweather.di.DaggerApplicationComponent
import dagger.android.*
import dagger.android.AndroidInjector

class SimpleWeatherApplication : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerApplicationComponent.builder().create(this)
    }
}