package com.example.myswaggerapp.data.model.wizards


import com.google.gson.annotations.SerializedName

data class WizardsModelItemModel(
    @SerializedName("elixirs")
    val elixirs: List<ElixirModel?>? = listOf(),
    @SerializedName("firstName")
    val firstName: String? = "",
    @SerializedName("id")
    val id: String? = "",
    @SerializedName("lastName")
    val lastName: String? = ""
):java.io.Serializable