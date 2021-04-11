package com.example.covid_19app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.covid_19app.databinding.ActivityMainBinding
import com.example.covid_19app.features.AppFeature

class MainActivity : AppCompatActivity() {
    private  val appFeature: AppFeature by lazy {AppFeatureImpl() }
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        var recycler = binding.recycler
        val stepsList = resources.getStringArray(R.array.steps).toList()
        recycler.apply {
            adapter = BulletAdapter(stepsList)
            layoutManager = LinearLayoutManager(this@MainActivity)
         }

        setupAppFeature()
    }

    private fun setupAppFeature() {
        if (appFeature.isAvailable){
            appFeature.inflateFeature(this, binding.featureContainer)
        }
    }
}