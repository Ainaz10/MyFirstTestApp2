package com.example.myfirsttestapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class MenuFragment : Fragment() {

    private lateinit var button_alfabet: Button
    private lateinit var button_numb: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_menu, container, false)


        button_alfabet = view.findViewById(R.id.button_alfabet)
        val alfabetFragment =  AlfabetFragment()

        button_alfabet.setOnClickListener {
            activity?.supportFragmentManager
                ?.beginTransaction()
                ?.replace(R.id.fragment_container, alfabetFragment)
                ?.commit()}

        button_numb = view.findViewById(R.id.button_numb)
        val numbersFragment =  NumbersFragment()
        button_numb.setOnClickListener {
            activity?.supportFragmentManager
                ?.beginTransaction()
                ?.replace(R.id.fragment_container, numbersFragment)
                ?.commit()
        }

        return view
    }


}