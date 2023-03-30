package com.example.myswaggerapp.ui.wizards

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager

import com.example.myswaggerapp.R

import com.example.myswaggerapp.data.model.wizards.WizardsModelItemModel
import com.example.myswaggerapp.databinding.FragmentWizardBinding

import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class WizardsFragment : Fragment() {

private lateinit var viewModel : WizardsViewModel
 var _binding:FragmentWizardBinding? = null
    val binding  get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        viewModel = ViewModelProvider(this)[WizardsViewModel::class.java]
        // Inflate the layout for this fragment
        _binding = FragmentWizardBinding.inflate(inflater,container,false)

        viewModel.wizards.observe(viewLifecycleOwner){
            it?.let {
                setupUI(it)
            }
        }
        viewModel.getWizards()
        return binding.root
    }

    private fun setupUI(wizards: ArrayList<WizardsModelItemModel>) {
        val wizardsAdapter = WizardsAdapter(wizards)
        binding.rvWizards.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = wizardsAdapter
        }
        wizardsAdapter.onItemClick = {
            val bundle = Bundle().apply {
                putSerializable("WizardItem", it)
            }
            findNavController().navigate(
                R.id.action_nav_wizards_to_wizards_details, bundle

            )
        }
    }


}