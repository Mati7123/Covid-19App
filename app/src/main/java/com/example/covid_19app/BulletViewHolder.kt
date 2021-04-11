package com.example.covid_19app

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class  BulletViewHolder(view: View) : RecyclerView.ViewHolder(view){
    private val textView = itemView.findViewById<TextView>(R.id.item_text)

    fun setText(text: String){
        textView.text = text
    }
}