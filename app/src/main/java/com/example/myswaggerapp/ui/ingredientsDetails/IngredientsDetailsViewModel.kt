package com.example.myswaggerapp.ui.ingredientsDetails

import androidx.lifecycle.ViewModel
import com.example.myswaggerapp.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class IngredientsDetailsViewModel @Inject constructor(
    val repository: Repository
): ViewModel() {
    // TODO: Implement the ViewModel
}