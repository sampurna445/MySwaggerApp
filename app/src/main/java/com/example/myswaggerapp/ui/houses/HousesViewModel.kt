package com.example.myswaggerapp.ui.houses

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myswaggerapp.data.model.housesModel.HousesModel
import com.example.myswaggerapp.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HousesViewModel @Inject constructor(
    val repository: Repository
) : ViewModel() {
    val houses = MutableLiveData<HousesModel>()

    fun getHouses() {
        viewModelScope.launch {
            val repository = repository.getHouses()
            houses.postValue(repository)
        }
    }
}