package com.example.covid_19app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var recycler = findViewById<RecyclerView>(R.id.recycler)
        val stepsList = resources.getStringArray(R.array.steps).toList()
        recycler.apply {
            adapter = BulletAdapter(stepsList)
            layoutManager = LinearLayoutManager(this@MainActivity)
         }
    }
}