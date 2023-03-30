package com.example.myswaggerapp.ui.wizards

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myswaggerapp.R

class wizards_details : Fragment() {

    companion object {
        fun newInstance() = wizards_details()
    }

    private lateinit var viewModel: WizardsDetailsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_wizards_details, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(WizardsDetailsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}