package com.example.lasalleapp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lasalleapp.models.Materias
import com.example.lasalleapp.models.News
import com.example.lasalleapp.ui.theme.LaSalleAppTheme

@Composable
fun MateriaItem(materia : Materias, onClick:(Materias) -> Unit){
    val promedio = (materia.calificacionp1 * 0.2) + (materia.calificacionp2 * 0.2) + (materia.calificacionp3 * 0.6)
    Row (
        modifier = Modifier
            .width(330.dp)
            .height(40.dp)
            .clip(RoundedCornerShape(80.dp))
            .background(MaterialTheme.colorScheme.onPrimary)
            .clickable {
                onClick(materia)
            },
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Icon(
            imageVector =  Icons.Default.Menu,
            contentDescription = "Icon Materia",
            tint = MaterialTheme.colorScheme.primary,
            modifier = Modifier
                .padding(start = 15.dp)
                .width(45.dp)
        )

        Text(
            text = materia.name,
            fontSize = 20.sp,
            style = MaterialTheme.typography.titleLarge,
            color = MaterialTheme.colorScheme.primary,
            modifier = Modifier.width(150.dp))

        Text(
            text = promedio.toString(),
            fontSize = 20.sp,
            style = MaterialTheme.typography.titleLarge,
            color = MaterialTheme.colorScheme.primary
        )
    }
}

//@Composable
//@Preview
//fun MateriaItemPreview(){
//    LaSalleAppTheme {
//        MateriaItem(materia = Materias(1, "Literatura", 2, 9.8, 1, 8.5, 3, 9.2, 0.0), )
//    }
//}