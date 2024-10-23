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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
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
import com.example.lasalleapp.ui.components.CardImage
import com.example.lasalleapp.ui.components.PayItem
import com.example.lasalleapp.ui.theme.LaSalleAppTheme
import com.example.lasalleapp.utils.Logout
import com.example.lasalleapp.utils.Screens
import com.example.lasalleapp.utils.mesList
import com.example.lasalleapp.utils.newsList

@Composable
fun PagosScreen(innerPadding: PaddingValues){
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
            )
            {
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
                )
                {
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

        Box(modifier = Modifier
            .fillMaxWidth()
            .offset(y = (-50).dp)
            .padding(horizontal = 24.dp)
            .clip(RoundedCornerShape(30.dp))
            .background(MaterialTheme.colorScheme.onPrimary)
            .height(550.dp),
            contentAlignment = Alignment.Center
        ){
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = stringResource(id = R.string.pagos),
                    style = MaterialTheme.typography.titleLarge,
                    color = MaterialTheme.colorScheme.primary,
                    modifier = Modifier.padding(10.dp))

                LazyColumn(
                    modifier = Modifier.fillMaxSize()
                        .padding(10.dp),
                    verticalArrangement = Arrangement.spacedBy(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    items(mesList){ mes ->
                        PayItem(mes = mes)
                    }
                }
            }

        }
    }
}

@Composable
@Preview
fun PagosPreview(){
    LaSalleAppTheme {
        PagosScreen(innerPadding = PaddingValues(0.dp))
    }
}