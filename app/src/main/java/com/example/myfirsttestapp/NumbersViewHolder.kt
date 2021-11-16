package com.example.myfirsttestapp

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NumbersViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(number: Int) {

        val numberTextView: TextView = itemView.findViewById(R.id.number_text_view)

        numberTextView.text = number.toString()
    }
}
