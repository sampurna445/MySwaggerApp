package com.example.myswaggerapp.ui.wizards.wizardsDetails

import androidx.lifecycle.ViewModel
import com.example.myswaggerapp.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class WizardsDetailsViewModel@Inject constructor(
    val repository: Repository
) : ViewModel() {
    // TODO: Implement the ViewModel
}