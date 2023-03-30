package com.example.myswaggerapp.data.repository

import com.example.myswaggerapp.data.model.housesModel.HousesModel
import com.example.myswaggerapp.data.model.ingredientsModel.IngredientsModel
import com.example.myswaggerapp.data.model.ingredientsModel.IngredientsModelItemModel
import com.example.myswaggerapp.data.model.spells.SpellsModel
import com.example.myswaggerapp.data.model.spells.SpellsModelItemModel
import com.example.myswaggerapp.data.model.wizards.WizardsModel
import com.example.myswaggerapp.data.model.wizards.WizardsModelItemModel
import com.example.myswaggerapp.data.remote.ApiRequest
import javax.inject.Inject


class RepositoryImpl @Inject constructor(
    val apiRequest: ApiRequest
) : Repository {
    override suspend fun getHouses(): HousesModel = apiRequest.getHouses()
    override suspend fun getIngredients(): ArrayList<IngredientsModelItemModel> =
        apiRequest.getIngredients()
    override suspend fun getSpells():  ArrayList<SpellsModelItemModel> = apiRequest.getSpells()
    override suspend fun getWizards(): ArrayList<WizardsModelItemModel> = apiRequest.getWizards()
}