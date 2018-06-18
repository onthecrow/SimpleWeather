package com.onthecrow.simpleweather.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.onthecrow.simpleweather.R
import com.onthecrow.simpleweather.base.BaseFragment
import javax.inject.Inject
import com.onthecrow.simpleweather.presentation.ForecastViewModel

class ForecastFragment : BaseFragment() {

    @Inject
    lateinit var forecastViewModel: ForecastViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_forecast, container, false)
    }
}
