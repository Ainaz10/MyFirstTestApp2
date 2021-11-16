package com.example.myfirsttestapp

import android.view.View

import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView


class LettersViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(symbol: String) {

        val symbolTextView: TextView = itemView.findViewById(R.id.letter_text_view_1)

        symbolTextView.text = symbol
    }
}
