package com.example.myswaggerapp.data.model.housesModel


import com.google.gson.annotations.SerializedName

data class TraitModel(
    @SerializedName("id")
    val id: String? = "",
    @SerializedName("name")
    val name: String? = ""
)