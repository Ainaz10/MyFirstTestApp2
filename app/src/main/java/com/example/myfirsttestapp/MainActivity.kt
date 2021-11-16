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



    }
}