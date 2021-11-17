package com.example.myfirsttestapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

private const val LAST_SELECTED_ITEM = "item"

class MainActivity : AppCompatActivity() {

    private lateinit var bottomMenu: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // окно букв
/*        val buttonAlfabet: Button = findViewById(R.id.button_alfabet)

        val intentAlfabet = Intent(this, ActivityAlfabet::class.java)

        buttonAlfabet.setOnClickListener{
            startActivity(intentAlfabet)
        }
        // окно чисел
        val buttonNumb: Button = findViewById(R.id.button_numb)

        val intentNumb = Intent(this, ActivityNumbers::class.java)

        buttonNumb.setOnClickListener{
            startActivity(intentNumb)
        }

 */
        bottomMenu = findViewById(R.id.bottom_menu)

        bottomMenu.setOnItemSelectedListener { item ->
            when (item.itemId) {

                R.id.bottom_menu -> {
                    val menuFragment = MenuFragment()
                    replaceFragment(menuFragment)
                }

                R.id.letter_bottom -> {
                    val alfabetFragment = AlfabetFragment()
                    replaceFragment(alfabetFragment)
                }

                R.id.number_bottom -> {
                    val numbersFragment = NumbersFragment()
                    replaceFragment(numbersFragment)
                }

                R.id.about_bottom -> {
                    val aboutFragment = AboutFragment()
                    replaceFragment(aboutFragment)
                }

            }
            true
        }

        bottomMenu.selectedItemId = savedInstanceState?.getInt(LAST_SELECTED_ITEM) ?: R.id.bottom_menu
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt(LAST_SELECTED_ITEM, bottomMenu.selectedItemId)
        super.onSaveInstanceState(outState)
    }


    }
