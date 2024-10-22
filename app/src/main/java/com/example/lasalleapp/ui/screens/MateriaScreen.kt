package com.example.lasalleapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lasalleapp.R
import com.example.lasalleapp.ui.theme.LaSalleAppTheme
import com.example.lasalleapp.utils.Logout
import com.example.lasalleapp.utils.alumnoList
import com.example.lasalleapp.utils.materiaList

@Composable
fun MateriaScreen(innerPadding: PaddingValues, materiaId: Int){
    val materia = materiaList.first { it.id == materiaId}
    val promedio = (materia.calificacionp1 * 0.2) + (materia.calificacionp2 * 0.2) + (materia.calificacionp3 * 0.6)
    Column (modifier = Modifier
        .fillMaxSize()
        .padding(innerPadding)
        .background(MaterialTheme.colorScheme.background)
    )
    {
        // HEADER
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(bottomStart = 40.dp, bottomEnd = 40.dp))
                .height(270.dp)
                .background(MaterialTheme.colorScheme.primary)
        )
        {
            Image(
                painter = painterResource(id = R.drawable.edificio),
                contentDescription = "background",
                modifier = Modifier
                    .fillMaxWidth()
                    .offset(y = 80.dp),
                contentScale = ContentScale.Crop
            )

            Row(
                modifier = Modifier.padding(15.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Logo
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "logo",
                    modifier = Modifier.size(70.dp)
                )

                // Usuario
                Column(
                    modifier = Modifier
                        .padding(start = 10.dp)
                        .weight(1f)
                ) {
                    Text(
                        text = stringResource(id = R.string.welcome_text),
                        color = MaterialTheme.colorScheme.onPrimary,
                        fontSize = 18.sp
                    )

                    Text(
                        text = "Naomi Bautista",
                        color = MaterialTheme.colorScheme.onPrimary,
                        fontSize = 22.sp, fontWeight = FontWeight.Bold
                    )
                }

                // Icono
                Icon(
                    imageVector = Logout,
                    contentDescription = "logout",
                    modifier = Modifier.size(30.dp),
                    tint = MaterialTheme.colorScheme.onPrimary
                )
            }
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .offset(y = (-50).dp)
                .padding(horizontal = 24.dp)
                .clip(RoundedCornerShape(30.dp))
                .background(MaterialTheme.colorScheme.onPrimary)
                .height(500.dp),
            contentAlignment = Alignment.Center
        ) {
            Column (
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(
                    text = materia.name,
                    fontSize = 35.sp,
                    style = MaterialTheme.typography.titleLarge,
                    color = MaterialTheme.colorScheme.primary,
                    modifier = Modifier.padding(top = 25.dp, start = 10.dp))

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    verticalArrangement = Arrangement.Center,
                ) {
                    Text(
                        text = stringResource(id = R.string.p1),
                        style = MaterialTheme.typography.headlineSmall,
                        color = MaterialTheme.colorScheme.primary,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 40.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Box (
                            modifier = Modifier
                                .width(120.dp)
                                .height(40.dp)
                                .padding(start = 20.dp)
                                .clip(RoundedCornerShape(60.dp))
                                .background(MaterialTheme.colorScheme.background),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "Faltas: " + materia.faltasp1.toString(),
                                style = MaterialTheme.typography.titleSmall,
                                color = MaterialTheme.colorScheme.primary)
                        }

                        Box (
                            modifier = Modifier
                                .width(170.dp)
                                .height(40.dp)
                                .padding(start = 20.dp)
                                .clip(RoundedCornerShape(60.dp))
                                .background(MaterialTheme.colorScheme.background),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "Calificación: " + materia.calificacionp1.toString(),
                                style = MaterialTheme.typography.titleSmall,
                                color = MaterialTheme.colorScheme.primary)
                        }
                    }
                }

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    verticalArrangement = Arrangement.Center,
                ) {
                    Text(
                        text = stringResource(id = R.string.p2),
                        style = MaterialTheme.typography.headlineSmall,
                        color = MaterialTheme.colorScheme.primary,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 40.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Box (
                            modifier = Modifier
                                .width(120.dp)
                                .height(40.dp)
                                .padding(start = 20.dp)
                                .clip(RoundedCornerShape(60.dp))
                                .background(MaterialTheme.colorScheme.background),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "Faltas: " + materia.faltasp2.toString(),
                                style = MaterialTheme.typography.titleSmall,
                                color = MaterialTheme.colorScheme.primary)
                        }

                        Box (
                            modifier = Modifier
                                .width(170.dp)
                                .height(40.dp)
                                .padding(start = 20.dp)
                                .clip(RoundedCornerShape(60.dp))
                                .background(MaterialTheme.colorScheme.background),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "Calificación: " + materia.calificacionp2.toString(),
                                style = MaterialTheme.typography.titleSmall,
                                color = MaterialTheme.colorScheme.primary)
                        }
                    }
                }

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    verticalArrangement = Arrangement.Center,
                ) {
                    Text(
                        text = stringResource(id = R.string.p3),
                        style = MaterialTheme.typography.headlineSmall,
                        color = MaterialTheme.colorScheme.primary,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 40.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Box (
                            modifier = Modifier
                                .width(120.dp)
                                .height(40.dp)
                                .padding(start = 20.dp)
                                .clip(RoundedCornerShape(60.dp))
                                .background(MaterialTheme.colorScheme.background),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "Faltas: " + materia.faltasp3.toString(),
                                style = MaterialTheme.typography.titleSmall,
                                color = MaterialTheme.colorScheme.primary)
                        }

                        Box (
                            modifier = Modifier
                                .width(170.dp)
                                .height(40.dp)
                                .padding(start = 20.dp)
                                .clip(RoundedCornerShape(60.dp))
                                .background(MaterialTheme.colorScheme.background),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "Calificación: " + materia.calificacionp3.toString(),
                                style = MaterialTheme.typography.titleSmall,
                                color = MaterialTheme.colorScheme.primary)
                        }
                    }
                }

                Row (
                    modifier = Modifier.fillMaxWidth().padding(top = 25.dp, start =  20.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ){
                    Text(
                        text = stringResource(id = R.string.promedio),
                        fontSize = 20.sp,
                        style = MaterialTheme.typography.labelLarge,
                        color = MaterialTheme.colorScheme.primary,
                        modifier = Modifier.width(120.dp))

                    Box (
                        modifier = Modifier
                            .width(120.dp)
                            .height(60.dp)
                            .padding(start = 20.dp)
                            .clip(RoundedCornerShape(35.dp))
                            .background(MaterialTheme.colorScheme.primary),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = promedio.toString(),
                            fontSize = 20.sp,
                            style = MaterialTheme.typography.labelLarge,
                            color = MaterialTheme.colorScheme.onPrimary)
                    }
                }

            }
        }

    }
}

@Composable
@Preview
fun MateriaPreview(){
    LaSalleAppTheme {
        MateriaScreen(innerPadding = PaddingValues(0.dp), 1)
    }
}