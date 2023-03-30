package com.example.myswaggerapp.ui.spells

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myswaggerapp.data.model.spells.SpellsModel
import com.example.myswaggerapp.data.model.spells.SpellsModelItemModel
import com.example.myswaggerapp.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SpellsViewModel @Inject constructor(
    val repository: Repository
) :ViewModel(){
    val spells = MutableLiveData <ArrayList<SpellsModelItemModel>>()

   fun getSpells(){
       viewModelScope.launch(){
          val repository = repository.getSpells()
           spells.postValue(repository)
       }
   }
}