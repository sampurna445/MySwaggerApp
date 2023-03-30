package com.example.myswaggerapp.data.model.spells


import com.google.gson.annotations.SerializedName

data class SpellsModelItemModel(
    @SerializedName("canBeVerbal")
    val canBeVerbal: Boolean? = false,
    @SerializedName("creator")
    val creator: String? = "",
    @SerializedName("effect")
    val effect: String? = "",
    @SerializedName("id")
    val id: String? = "",
    @SerializedName("incantation")
    val incantation: String? = "",
    @SerializedName("light")
    val light: String? = "",
    @SerializedName("name")
    val name: String? = "",
    @SerializedName("type")
    val type: String? = ""
):java.io.Serializable