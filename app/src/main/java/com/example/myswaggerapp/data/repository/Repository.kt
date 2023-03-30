package com.example.myswaggerapp.data.repository

import com.example.myswaggerapp.data.model.housesModel.HousesModel
import com.example.myswaggerapp.data.model.ingredientsModel.IngredientsModel
import com.example.myswaggerapp.data.model.ingredientsModel.IngredientsModelItemModel
import com.example.myswaggerapp.data.model.spells.SpellsModel
import com.example.myswaggerapp.data.model.spells.SpellsModelItemModel
import com.example.myswaggerapp.data.model.wizards.WizardsModel
import com.example.myswaggerapp.data.model.wizards.WizardsModelItemModel

interface Repository {
suspend fun getHouses() : HousesModel
suspend fun getIngredients(): ArrayList<IngredientsModelItemModel>
suspend fun getSpells() : ArrayList<SpellsModelItemModel>
suspend fun getWizards():ArrayList<WizardsModelItemModel>
}