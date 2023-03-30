package com.example.myswaggerapp.ui.housesDetails

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myswaggerapp.R
import com.example.myswaggerapp.data.model.housesModel.HousesModelItemModel
import com.example.myswaggerapp.databinding.FragmentHousesDetailsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HousesDetailsFragment : Fragment() {

    private var _binding: FragmentHousesDetailsBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: HousesDetailsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel =
            ViewModelProvider(this)[HousesDetailsViewModel::class.java]
        _binding = FragmentHousesDetailsBinding.inflate(inflater, container, false)

        val house = arguments?.getSerializable("HouseItem") as HousesModelItemModel


        binding.housesName.text = house.name
        binding.housesAnimal.text = house.animal
        binding.housesHouseColor.text = house.houseColours



        return binding.root
    }

}