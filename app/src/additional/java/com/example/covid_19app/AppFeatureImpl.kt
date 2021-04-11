package com.example.covid_19app

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.covid_19app.databinding.ButtonWashHandsBinding
import com.example.covid_19app.features.AppFeature

class AppFeatureImpl : AppFeature {
    override val isAvailable: Boolean = true


    override fun inflateFeature(context: Context, parent: ViewGroup) {
        ButtonWashHandsBinding.inflate(LayoutInflater.from(context), parent, true).apply {
            root.setOnClickListener{
                Intent(context, HandsWashActivity::class.java).let(
                    context::startActivity
                )
            }
        }
    }
}