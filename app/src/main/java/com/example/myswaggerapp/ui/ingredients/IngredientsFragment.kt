package com.example.myswaggerapp.ui.ingredients

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myswaggerapp.data.model.housesModel.HousesModel

import com.example.myswaggerapp.data.model.ingredientsModel.IngredientsModel
import com.example.myswaggerapp.data.model.ingredientsModel.IngredientsModelItemModel
import com.example.myswaggerapp.databinding.FragmentIngredientsBinding
import com.example.myswaggerapp.ui.houses.HousesAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class IngredientsFragment : Fragment() {

    private val viewModel by viewModels<IngredientsViewModel>()
    private var _binding: FragmentIngredientsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        _binding = FragmentIngredientsBinding.inflate(inflater, container, false)

        viewModel.ingredients.observe(viewLifecycleOwner) {
            it?.let {
                setupUI(it)
            }
        }
        viewModel.getIngredients()

        return binding.root
    }


    private fun setupUI(ingredients: ArrayList<IngredientsModelItemModel>) {
        val ingredientsAdapter = IngredientsAdapter(ingredients)
        binding.rvIngredients.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = ingredientsAdapter
        }
    }

}