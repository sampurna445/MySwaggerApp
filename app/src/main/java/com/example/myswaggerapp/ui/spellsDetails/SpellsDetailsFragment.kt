package com.example.myswaggerapp.ui.spellsDetails

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels


import com.example.myswaggerapp.data.model.spells.SpellsModelItemModel

import com.example.myswaggerapp.databinding.FragmentSpellsDetailsBinding


class SpellsDetailsFragment : Fragment() {
    private var _binding: FragmentSpellsDetailsBinding? = null
    private val binding get() = _binding!!

    private val viewModel by viewModels<SpellsDetailsViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSpellsDetailsBinding.inflate(inflater, container, false)

        val spells = arguments?.getSerializable("SpellsItem") as SpellsModelItemModel


        binding.spellsName.text = spells.name
        binding.spellsId.text = spells.id

        binding.spellsEffect.text = spells.effect
        binding.spellsType.text = spells.type

        binding.spellsIncantation.text = spells.incantation
        binding.spellsCreator.text = spells.creator



        return binding.root
    }


}