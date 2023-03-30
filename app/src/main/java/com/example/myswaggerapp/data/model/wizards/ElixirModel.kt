package com.example.myswaggerapp.data.model.wizards


import com.google.gson.annotations.SerializedName

data class ElixirModel(
    @SerializedName("id")
    val id: String? = "",
    @SerializedName("name")
    val name: String? = ""
)