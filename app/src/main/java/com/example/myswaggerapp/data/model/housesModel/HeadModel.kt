package com.example.myswaggerapp.data.model.housesModel


import com.google.gson.annotations.SerializedName

data class HeadModel(
    @SerializedName("firstName")
    val firstName: String? = "",
    @SerializedName("id")
    val id: String? = "",
    @SerializedName("lastName")
    val lastName: String? = ""
)