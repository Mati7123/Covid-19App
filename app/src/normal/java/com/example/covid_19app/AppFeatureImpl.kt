package com.example.covid_19app

import android.content.Context
import android.view.ViewGroup
import com.example.covid_19app.features.AppFeature

class AppFeatureImpl : AppFeature {
    override val isAvailable: Boolean = false

    override fun inflateFeature(context: Context, parent: ViewGroup) {

    }
}