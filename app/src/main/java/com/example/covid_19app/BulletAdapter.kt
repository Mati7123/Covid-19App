package com.example.covid_19app

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.covid_19app.databinding.ItemBulletBinding

class BulletAdapter(val list: List<String>): RecyclerView.Adapter<BulletViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BulletViewHolder {
        val view = ItemBulletBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return  BulletViewHolder(view);
    }

    override fun onBindViewHolder(holder: BulletViewHolder, position: Int) {
        holder.setText(list[position])
    }

    override fun getItemCount(): Int = list.size

}