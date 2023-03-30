package com.example.myswaggerapp.ui.wizards

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myswaggerapp.data.model.spells.SpellsModel
import com.example.myswaggerapp.data.model.wizards.WizardsModel
import com.example.myswaggerapp.data.model.wizards.WizardsModelItemModel
import com.example.myswaggerapp.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class WizardsViewModel @Inject constructor(
    val repository: Repository
):ViewModel() {
    val wizards = MutableLiveData<ArrayList<WizardsModelItemModel>>()

    fun getWizards(){
        viewModelScope.launch(){
            val repository = repository.getWizards()
            wizards.postValue(repository)
        }
    }

}