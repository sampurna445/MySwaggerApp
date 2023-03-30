package com.example.myswaggerapp.ui.wizards.wizardsDetails

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.myswaggerapp.R
import com.example.myswaggerapp.data.model.ingredientsModel.IngredientsModelItemModel
import com.example.myswaggerapp.data.model.wizards.WizardsModelItemModel
import com.example.myswaggerapp.databinding.FragmentWizardsDetailsBinding

class WizardsDetailsFragment : Fragment() {

private var _binding : FragmentWizardsDetailsBinding? = null
    private val binding get() = _binding!!
    private  val viewModel by viewModels<WizardsDetailsViewModel> ()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       _binding =  FragmentWizardsDetailsBinding.inflate(inflater,container,false)
        val wizards = arguments?.getSerializable("WizardItem") as WizardsModelItemModel


        binding.wizardsFname.text = wizards.firstName
        binding.wizardsLname.text = wizards.lastName
        binding.wizardsId.text  = wizards.id



        return binding.root
    }

}