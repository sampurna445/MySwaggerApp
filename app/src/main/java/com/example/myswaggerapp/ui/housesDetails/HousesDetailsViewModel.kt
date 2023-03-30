package com.example.myswaggerapp.ui.housesDetails

import androidx.lifecycle.ViewModel
import com.example.myswaggerapp.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HousesDetailsViewModel @Inject constructor(
    val repository: Repository
) : ViewModel() {
    // TODO: Implement the ViewModel
}