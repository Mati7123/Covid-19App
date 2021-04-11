package com.example.covid_19app.features

import android.content.Context
import android.view.ViewGroup

interface AppFeature {
    val isAvailable: Boolean
    fun inflateFeature(context: Context, parent: ViewGroup)
}