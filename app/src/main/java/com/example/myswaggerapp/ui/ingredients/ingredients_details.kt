package com.example.myswaggerapp.ui.ingredients

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myswaggerapp.R

class ingredients_details : Fragment() {

    companion object {
        fun newInstance() = ingredients_details()
    }

    private lateinit var viewModel: IngredientsDetailsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_ingredients_details, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(IngredientsDetailsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}