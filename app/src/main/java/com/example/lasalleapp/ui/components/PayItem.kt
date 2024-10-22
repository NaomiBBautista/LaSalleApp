package com.example.lasalleapp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lasalleapp.models.Mes
import com.example.lasalleapp.ui.theme.LaSalleAppTheme

@Composable
fun PayItem(mes : Mes){
    Row (
        modifier = Modifier
            .width(280.dp)
            .height(50.dp)
            .background(MaterialTheme.colorScheme.onPrimary),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ){
        Box (
            modifier = Modifier
                .width(200.dp)
                .height(50.dp)
                .clip(RoundedCornerShape(50.dp))
                .background(MaterialTheme.colorScheme.background),
        ){
            Text(
                text = mes.name,
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.primary,
                modifier = Modifier.padding(15.dp))
        }

        // Icono y color dependiendo del estado de pago
        Box(
            modifier = Modifier
                .height(50.dp)
                .width(50.dp)
                .clip(RoundedCornerShape(30.dp))
                .background(
                    if (mes.pagado) MaterialTheme.colorScheme.onSecondary else MaterialTheme.colorScheme.error
                ),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = if (mes.pagado) Icons.Default.Check else Icons.Default.Close,
                contentDescription = if (mes.pagado) "Pagado" else "Pendiente",
                tint = MaterialTheme.colorScheme.onPrimary
            )
        }
    }

}

@Composable
@Preview
fun PayItemPreview(){
    LaSalleAppTheme {
        PayItem(mes = Mes(1, "Enero", true))
    }
}