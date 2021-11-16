package com.og.recyclerviewapplication

import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.myfirsttestapp.R

class LettersViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(symbol: String) {

        val symbolTextView: TextView = itemView.findViewById(R.id.letter_text_view_1)

        symbolTextView.text = symbol
    }
}
