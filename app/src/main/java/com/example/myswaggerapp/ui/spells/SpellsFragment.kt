package com.example.myswaggerapp.ui.spells

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager


import com.example.myswaggerapp.R
import com.example.myswaggerapp.data.model.ingredientsModel.IngredientsModel
import com.example.myswaggerapp.data.model.spells.SpellsModel
import com.example.myswaggerapp.data.model.spells.SpellsModelItemModel

import com.example.myswaggerapp.databinding.FragmentSpellsBinding

import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SpellsFragment : Fragment() {
    private val viewModel by viewModels<SpellsViewModel>()
    private var _binding :  FragmentSpellsBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        _binding = FragmentSpellsBinding.inflate(inflater,container,false)

        viewModel.spells.observe(viewLifecycleOwner){
            it?.let {
                setupUI(it)
            }
        }
        viewModel.getSpells()
        return binding.root
    }

    private fun setupUI(spells: ArrayList<SpellsModelItemModel>) {
        val spellsAdapter = SpellsAdapter(spells)
        binding.rvSpells.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = spellsAdapter
        }

        spellsAdapter.onItemClick = {
            val bundle = Bundle().apply {
                putSerializable("SpellsItem", it)
            }
            findNavController().navigate(
                R.id.action_nav_spells_to_spells_details, bundle

            )
        }
    }

}