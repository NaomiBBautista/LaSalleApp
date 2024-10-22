package com.example.lasalleapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
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
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage
import com.example.lasalleapp.R
import com.example.lasalleapp.models.Alumno
import com.example.lasalleapp.ui.components.Option
import com.example.lasalleapp.ui.components.Widget
import com.example.lasalleapp.ui.theme.LaSalleAppTheme
import com.example.lasalleapp.utils.Attach_email
import com.example.lasalleapp.utils.CalendarDays
import com.example.lasalleapp.utils.CashCoin
import com.example.lasalleapp.utils.Lock_person
import com.example.lasalleapp.utils.Logout
import com.example.lasalleapp.utils.Palette
import com.example.lasalleapp.utils.Screens
import com.example.lasalleapp.utils.Task
import com.example.lasalleapp.utils.UserRound
import com.example.lasalleapp.utils.alumnoList
import com.example.lasalleapp.utils.newsList

@Composable
fun SettingsScreen(innerPadding: PaddingValues, navController: NavController, alumnoId : Int) {
    val alumno = alumnoList.first { it.id == alumnoId }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .background(MaterialTheme.colorScheme.background)
            .verticalScroll(
                rememberScrollState()
            ),
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        // HEADER
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(bottomStart = 40.dp, bottomEnd = 40.dp))
                .height(270.dp)
                .background(MaterialTheme.colorScheme.primary)
                .padding(bottom = 0.dp)) {
            Image(
                painter = painterResource(id = R.drawable.edificio),
                contentDescription = "background",
                modifier = Modifier
                    .fillMaxWidth()
                    .offset(y = 80.dp),
                contentScale = ContentScale.Crop)

            Row(
                modifier = Modifier.padding(15.dp),
                verticalAlignment = Alignment.CenterVertically) {
                // Logo
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "logo",
                    modifier = Modifier.size(70.dp))

                // Usuario
                Column(
                    modifier = Modifier
                        .padding(start = 10.dp)
                        .weight(1f)) {
                    Text(
                        text = stringResource(id = R.string.welcome_text),
                        color = MaterialTheme.colorScheme.onPrimary,
                        fontSize = 18.sp)

                    Text(
                        text = "Naomi Bautista",
                        color = MaterialTheme.colorScheme.onPrimary,
                        fontSize = 22.sp, fontWeight = FontWeight.Bold)
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


        // BODY
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .height(500.dp)
                .padding(start = 20.dp, end = 20.dp, top = 40.dp)
                .clip(RoundedCornerShape(40.dp))
                .background(MaterialTheme.colorScheme.onPrimary))
        {
            // Nombre
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, top = 100.dp, end = 20.dp),
                verticalArrangement = Arrangement.Center
                ) {
                Row (
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                    ){
                    Icon(
                        imageVector = UserRound,
                        contentDescription = "Nombre",
                        modifier = Modifier.size(25.dp),
                        tint = MaterialTheme.colorScheme.primary)

                    Spacer(modifier = Modifier.size(10.dp))

                    Text(
                        text = stringResource(id = R.string.name),
                        color = MaterialTheme.colorScheme.primary,
                        style = MaterialTheme.typography.titleMedium)
                }

                Text(
                    text = alumno.name,
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier.padding(start = 40.dp))
            }

           //Fecha de Nacimiento
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                verticalArrangement = Arrangement.Center)
            {
                Row (
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically){
                    Icon(
                        imageVector = CalendarDays,
                        contentDescription = "Fecha Nacimiento",
                        modifier = Modifier.size(25.dp),
                        tint = MaterialTheme.colorScheme.primary)

                    Spacer(modifier = Modifier.size(10.dp))

                    Text(
                        text = stringResource(id = R.string.fecha),
                        color = MaterialTheme.colorScheme.primary,
                        style = MaterialTheme.typography.titleMedium)
                }

                Text(
                    text = alumno.date,
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier.padding(start = 40.dp))
            }

            //Correo
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp),
                verticalArrangement = Arrangement.Center)
            {
                Row (
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically){
                    Icon(
                        imageVector = Attach_email,
                        contentDescription = "Fecha Nacimiento",
                        modifier = Modifier.size(25.dp),
                        tint = MaterialTheme.colorScheme.primary)

                    Spacer(modifier = Modifier.size(10.dp))

                    Text(
                        text = stringResource(id = R.string.email),
                        color = MaterialTheme.colorScheme.primary,
                        style = MaterialTheme.typography.titleMedium)
                }

                Text(
                    text = alumno.email,
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier.padding(start = 40.dp))
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 30.dp),
                horizontalArrangement = Arrangement.Absolute.SpaceEvenly
            ) {
                Option(
                    icon = Lock_person,
                    title = stringResource(id = R.string.changePassword),
                    onClick = { navController.navigate(Screens.Password.route) }
                )
                Option(
                    icon = Palette,
                    title = stringResource(id = R.string.changeTheme),
                    onClick = { navController.navigate(Screens.Theme.route) }
                )
            }
        }

        Box(
            modifier = Modifier
                .width(280.dp)
                .height(230.dp)
                .offset(y = (-600).dp)
                .padding(horizontal = 24.dp)
                .clip(RoundedCornerShape(120.dp))
                .background(MaterialTheme.colorScheme.primary),
            contentAlignment = Alignment.Center
        ) {
            AsyncImage(
                model = alumno.image,
                contentDescription = "Alumno Image",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
        }


    }
}

@Preview
@Composable
fun SettingsPreview(){
    LaSalleAppTheme {
        val navController = rememberNavController()
        SettingsScreen(innerPadding = PaddingValues(0.dp), navController, 1)
    }
}