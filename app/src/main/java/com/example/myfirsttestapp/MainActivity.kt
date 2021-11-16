package com.example.myfirsttestapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // окно букв
        val buttonAlfabet: Button = findViewById(R.id.button_alfabet)

        val intentAlfabet = Intent(this, Activity_Alfabet::class.java)

        buttonAlfabet.setOnClickListener{
            startActivity(intentAlfabet)
        }
        // окно чисел
        val buttonNumb: Button = findViewById(R.id.button_numb)

        val intentNumb = Intent(this, Activity_Numbers::class.java)

        buttonNumb.setOnClickListener{
            startActivity(intentNumb)
        }

        val symbolList: List<String> = listOf("А", "Б", "В", "Г", "Д", "Е", "Ё", "Ж", "З", "И", "Й", "К", "Л", "М", "Н", "О", "П", "Р", "С", "Т", "У", "Ф", "Х", "Ц", "Ч", "Ш", "Щ", "Ъ", "Ы", "Ь", "Э", "Ю", "Я" )//А, Б, В, Г, Д, Е, Ё, Ж, З, И, Й, К, Л, М, Н, О, П, Р, С, Т, У, Ф, Х, Ц, Ч, Ш, Щ, Ъ, Ы, Ь, Э, Ю, Я.


        val symbolsRecyclerView: RecyclerView = findViewById(R.id.symbol_recycler_view)
        symbolsRecyclerView.layoutManager =
            GridLayoutManager(this, 3, GridLayoutManager.VERTICAL, false)

        symbolsRecyclerView.adapter = LettersAdapter(symbolList)


    }
}