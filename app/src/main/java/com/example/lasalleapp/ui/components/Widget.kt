package com.example.lasalleapp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lasalleapp.ui.theme.LaSalleAppTheme

@Composable
fun Widget(icon : ImageVector, title : String){
    Box(
        modifier = Modifier.size(90.dp)
            .background(MaterialTheme.colorScheme.background)
            .clip(RoundedCornerShape(10.dp)),
        contentAlignment = Alignment.Center
    ){
        Column (
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Icon(imageVector = icon,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.primary,
                modifier = Modifier.size(40.dp))
            
            Text(text = title,
                color = MaterialTheme.colorScheme.primary,
                style = MaterialTheme.typography.bodySmall)
        }
    }
}

@Preview
@Composable
fun WidgetPreview(){
    LaSalleAppTheme {
        Widget(icon = Icons.Default.Home, title = "Hola")
    }
}