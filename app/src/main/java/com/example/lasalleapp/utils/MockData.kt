package com.example.lasalleapp.utils

import androidx.compose.ui.res.stringResource
import com.example.lasalleapp.R
import com.example.lasalleapp.models.Alumno
import com.example.lasalleapp.models.Community
import com.example.lasalleapp.models.Materias
import com.example.lasalleapp.models.Mes
import com.example.lasalleapp.models.News
import com.example.lasalleapp.ui.components.Option

val newsList = listOf(
    News(
        id = 1,
        title = "Evento de Construcción de la Paz",
        description = "La Salle Bajío realiza un foro para fomentar la construcción de la paz en la comunidad estudiantil.",
        image =  "https://www.lasallebajio.edu.mx/noticias/images/4701_1.jpg"),
    News(
        id = 2,
        title = "Conferencia de Liderazgo",
        description = "Una conferencia que destaca la importancia del liderazgo en la comunidad universitaria.",
        image = "https://www.lasallebajio.edu.mx/noticias/images/4701_2.jpg"),
    News(
        id = 3,
        title = "Semana Cultural 2024",
        description = "Celebración anual de la Semana Cultural con diversas actividades artísticas y deportivas.",
        image = "https://www.lasallebajio.edu.mx/noticias/images/4701_3.jpg")
)

val communities = listOf(
    Community(1,"https://www.lasallebajio.edu.mx/comunidad/images/tile_documentos_inspiradores.jpg"),
    Community(2,"https://www.lasallebajio.edu.mx/comunidad/images/tile_boletin.jpg"),
    Community(3,"https://www.lasallebajio.edu.mx/comunidad/images/tile_cat_souv_22.jpg  "),
    Community(4,"https://www.lasallebajio.edu.mx/comunidad/images/tile_tramites.jpg"),
    Community(5,"https://www.lasallebajio.edu.mx/comunidad/images/tile_blog.jpg"),)


val alumnoList = listOf(
    Alumno(
        1,
        "Naomi Bautista",
        "naomi@lasallebajio.edu.mx",
        "28 de Enero de 2024",
        "Ingeniería en Software y Sistemas Computacionales",
        "Quinto",
        "https://i.pinimg.com/564x/eb/a1/be/eba1be5b08c9d6471e0a5dd282c65a35.jpg"),
    Alumno(
        2,
        "Javier Mejía",
        "javier@lasallebajio.edu.mx",
        "30 de Mayo de 2002",
        "Ingeniería en Software y Sistemas Computacionales",
        "Octavo",
        "https://i.pinimg.com/564x/05/5a/91/055a91979264664a1ee12b9453610d82.jpg"))

val mesList = listOf(
    Mes(1, "Enero", true),
    Mes(2, "Febrero", false),
    Mes(3, "Marzo", true),
    Mes(4, "Abril", true),
    Mes(5, "Mayo", false),
    Mes(6, "Junio", true),
    Mes(7, "Julio", false),
    Mes(8, "Agosto", true),
    Mes(9, "Septiembre", true),
    Mes(10, "Octubre", true),
    Mes(11, "Noviembre", false),
    Mes(12, "Diciembre", false),
)

val materiaList = listOf(
    Materias(1, "Literatura", 2, 9.8, 1, 8.5, 3, 9.2, 0.0),
    Materias(2, "Redes", 0, 8.4, 0, 7.5, 0, 9.6, 0.0 ),
    Materias(3, "Álgebra", 1, 9.0, 1, 9.5, 1, 6.0, 0.0),
    Materias(4, "Comunicación", 0, 9.0, 2, 9.5, 1, 10.0, 0.0),
    Materias(5, "Religión", 0, 7.4, 1, 8.6, 0, 8.6, 0.0),
    Materias(6, "DB", 2, 8.8, 2, 9.3, 0, 9.2, 0.0),
    Materias(7, "Estadística", 3, 6.8, 3, 8.3, 5, 8.9, 0.0),
    Materias(8, "Cálculo", 2, 9.8, 0, 8.4, 4, 7.9, 0.0),
    Materias(9, "Programación", 0, 5.6, 0, 9.0, 2, 10.0, 0.0),
    Materias(10, "Android", 0, 8.7, 2, 6.9, 1, 7.2, 0.0),
    Materias(11, "MacOSX", 1, 8.5, 2, 9.1, 2, 10.0, 0.0),
    Materias(12, "Web", 0, 9.8, 0, 9.5, 0, 9.4, 0.0)
)