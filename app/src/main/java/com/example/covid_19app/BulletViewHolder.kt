package com.example.covid_19app

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.covid_19app.databinding.ItemBulletBinding

class  BulletViewHolder(private val viewBiding: ItemBulletBinding) : RecyclerView.ViewHolder(viewBiding.root){

    fun setText(text: String){
        viewBiding.itemText.text = text
    }
}