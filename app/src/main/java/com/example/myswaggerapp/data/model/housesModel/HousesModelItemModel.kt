package com.example.myswaggerapp.data.model.housesModel


import com.google.gson.annotations.SerializedName

data class HousesModelItemModel(
    @SerializedName("animal")
    val animal: String? = "",
    @SerializedName("commonRoom")
    val commonRoom: String? = "",
    @SerializedName("element")
    val element: String? = "",
    @SerializedName("founder")
    val founder: String? = "",
    @SerializedName("ghost")
    val ghost: String? = "",
    @SerializedName("heads")
    val heads: List<HeadModel?>? = listOf(),
    @SerializedName("houseColours")
    val houseColours: String? = "",
    @SerializedName("id")
    val id: String? = "",
    @SerializedName("name")
    val name: String? = "",
    @SerializedName("traits")
    val traits: List<TraitModel?>? = listOf()
)