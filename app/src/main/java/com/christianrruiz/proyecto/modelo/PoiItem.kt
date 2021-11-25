package com.christianrruiz.proyecto.modelo


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class PoiItem(
    @SerializedName("calificacion")
    val calificacion: Double,
    @SerializedName("descripcion")
    val descripcion: String,
    @SerializedName("nombre")
    val nombre: String,
    @SerializedName("urlFoto")
    val urlFoto: String
) : Serializable