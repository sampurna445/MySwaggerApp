package com.example.myswaggerapp.data.model.ingredientsModel


import com.google.gson.annotations.SerializedName

data class IngredientsModelItemModel(
    @SerializedName("id")
    val id: String? = "",
    @SerializedName("name")
    val name: String? = ""
):java.io.Serializable