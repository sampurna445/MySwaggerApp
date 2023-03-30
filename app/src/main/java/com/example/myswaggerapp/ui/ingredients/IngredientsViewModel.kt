package com.example.myswaggerapp.ui.ingredients

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myswaggerapp.data.model.ingredientsModel.IngredientsModel
import com.example.myswaggerapp.data.model.ingredientsModel.IngredientsModelItemModel
import com.example.myswaggerapp.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class IngredientsViewModel @Inject constructor(
    val repository: Repository
) : ViewModel() {
    val ingredients = MutableLiveData<ArrayList<IngredientsModelItemModel>>()

    fun getIngredients() {
        viewModelScope.launch {
            val repository = repository.getIngredients()
            ingredients.postValue(repository)

        }
    }
}