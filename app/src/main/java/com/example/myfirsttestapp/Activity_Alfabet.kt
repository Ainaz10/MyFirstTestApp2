package com.example.myfirsttestapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Activity_Alfabet : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alfabet)


        val symbolList: List<String> = listOf("А", "Б", "В", "Г", "Д", "Е", "Ё", "Ж", "З", "И", "Й", "К", "Л", "М", "Н", "О", "П", "Р", "С", "Т", "У", "Ф", "Х", "Ц", "Ч", "Ш", "Щ", "Ъ", "Ы", "Ь", "Э", "Ю", "Я" )//А, Б, В, Г, Д, Е, Ё, Ж, З, И, Й, К, Л, М, Н, О, П, Р, С, Т, У, Ф, Х, Ц, Ч, Ш, Щ, Ъ, Ы, Ь, Э, Ю, Я.


        val symbolsRecyclerView: RecyclerView = findViewById(R.id.symbol_recycler_view)
        symbolsRecyclerView.layoutManager =
            GridLayoutManager(this, 3, GridLayoutManager.VERTICAL, false)

        symbolsRecyclerView.adapter = LettersAdapter(symbolList)
    }
}