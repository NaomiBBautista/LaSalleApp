package com.example.lasalleapp.utils

sealed class Screens (val route: String){
    data object  Home : Screens("home")
    data object Grades : Screens("grades")
    data object Calemdar : Screens("calendar")
    data object Settings : Screens("settings")
    data object Materia : Screens("materia")
    data object Pagos : Screens("pagos")
    data object Password : Screens("password")
    data object Theme : Screens("theme")
    data object NewsDetail : Screens("news-detail")
}