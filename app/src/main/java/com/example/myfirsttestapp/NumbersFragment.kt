package com.example.myfirsttestapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class NumbersFragment : Fragment() {

    //private lateinit var backButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_numbers, container, false)
/*
        backButton = view.findViewById(R.id.back_button)

        val menuFragment = MenuFragment()
        backButton.setOnClickListener {
            activity?.supportFragmentManager
                ?.beginTransaction()
                ?.replace(R.id.fragment_container, menuFragment)
                ?.commit()
        }
*/

            val numberList: List<Int> =
                listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)


            val numbersRecyclerView: RecyclerView = view.findViewById(R.id.number_recycler_view)
            numbersRecyclerView.layoutManager =
                GridLayoutManager(context, 3,  GridLayoutManager.VERTICAL, false)

            numbersRecyclerView.adapter = NumbersAdapter(numberList)


            return view
        }



    }



/*class ActivityNumbers : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_numbers)

        val numberList: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)


        val numbersRecyclerView: RecyclerView = findViewById(R.id.number_recycler_view)
        numbersRecyclerView.layoutManager =
            GridLayoutManager(this, 3, GridLayoutManager.VERTICAL, false)

        numbersRecyclerView.adapter = NumbersAdapter(numberList)
    }
}
*/
