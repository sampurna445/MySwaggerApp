package com.example.myswaggerapp.ui.ingredientsDetails

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels


import com.example.myswaggerapp.data.model.ingredientsModel.IngredientsModelItemModel

import com.example.myswaggerapp.databinding.FragmentIngredientsDetailsBinding



class IngredientsDetailsFragment : Fragment() {
    private var _binding: FragmentIngredientsDetailsBinding? = null
    private val binding get() = _binding!!

   private val viewModel by viewModels<IngredientsDetailsViewModel>()



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentIngredientsDetailsBinding.inflate(inflater, container, false)

        val ingredient = arguments?.getSerializable("IngredientItem") as IngredientsModelItemModel


        binding.ingredientsName.text = ingredient.name
        binding.ingredientsId.text = ingredient.id



        return binding.root

    }

}