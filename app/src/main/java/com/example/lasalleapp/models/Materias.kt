package com.example.lasalleapp.models

import android.graphics.drawable.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.ui.graphics.vector.ImageVector

data class Materias(
    val id: Int,
    val name : String,
    val faltasp1 : Int,
    val calificacionp1: Double,
    val faltasp2 : Int,
    val calificacionp2: Double,
    val faltasp3 : Int,
    val calificacionp3: Double,
    val promedio : Double
)
