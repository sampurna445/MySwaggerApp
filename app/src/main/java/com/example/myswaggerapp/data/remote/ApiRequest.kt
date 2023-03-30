package com.example.myswaggerapp.data.remote

import com.example.myswaggerapp.data.model.housesModel.HousesModel
import com.example.myswaggerapp.data.model.ingredientsModel.IngredientsModel
import com.example.myswaggerapp.data.model.ingredientsModel.IngredientsModelItemModel
import com.example.myswaggerapp.data.model.spells.SpellsModel
import com.example.myswaggerapp.data.model.spells.SpellsModelItemModel
import com.example.myswaggerapp.data.model.wizards.WizardsModel
import com.example.myswaggerapp.data.model.wizards.WizardsModelItemModel
import retrofit2.http.GET

interface ApiRequest {
@GET(ApiDetails.BASE_URL_HOUSES)
suspend fun getHouses() : HousesModel
@GET(ApiDetails.BASE_URL_Ingredients)
suspend fun getIngredients() : ArrayList<IngredientsModelItemModel>
@GET(ApiDetails.BASE__URL_SPELLS)
suspend fun getSpells(): ArrayList<SpellsModelItemModel>
@GET(ApiDetails.BASE_URL_WIZARDS)
suspend fun getWizards():ArrayList<WizardsModelItemModel>
}