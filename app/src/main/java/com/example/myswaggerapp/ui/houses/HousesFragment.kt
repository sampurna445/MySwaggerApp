package com.example.myswaggerapp.ui.houses

import android.os.Bundle
import android.view.LayoutInflater

import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager

import com.example.myswaggerapp.data.model.housesModel.HousesModel
import com.example.myswaggerapp.databinding.FragmentHousesBinding
import com.example.myswaggerapp.ui.houses.HousesAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HousesFragment : Fragment() {
    private lateinit var viewModel: HousesViewModel

    private var _binding: FragmentHousesBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel =
            ViewModelProvider(this)[HousesViewModel::class.java]
        _binding = FragmentHousesBinding.inflate(inflater, container, false)

        viewModel.houses.observe(viewLifecycleOwner) {
            it?.let {
                setupUI(it)
            }
        }

        viewModel.getHouses()

        return binding.root
    }

    private fun setupUI(houses: HousesModel) {
        val housesAdapter = HousesAdapter(houses)
        binding.rvHouses.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = housesAdapter
        }
    }


}