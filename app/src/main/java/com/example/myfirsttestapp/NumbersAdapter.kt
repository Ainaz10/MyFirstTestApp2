package com.example.myfirsttestapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class NumbersAdapter(private val numberList: List<Int>) : RecyclerView.Adapter<NumbersViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumbersViewHolder {
        val numberListItemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.numbers_list_item, parent, false)

        return NumbersViewHolder(numberListItemView)
    }

    override fun onBindViewHolder(holder: NumbersViewHolder, position: Int) {
        val number = numberList[position]
        holder.bind(number)
    }

    override fun getItemCount(): Int {
        return numberList.size
    }



}