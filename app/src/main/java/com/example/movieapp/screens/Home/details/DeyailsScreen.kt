package com.example.movieapp.screens.Home.details

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
@Preview
@Composable
fun DetailsScreen(navController: NavController, string: String?){

    
    Scaffold(topBar = {
        TopAppBar(backgroundColor = Color.Transparent, elevation = 5.dp) {
          Row(horizontalArrangement = Arrangement.Start) {
              Icon(imageVector = Icons.Default.ArrowBack,
                  contentDescription ="Arrow back",
              modifier = Modifier.clickable { 
                  navController.popBackStack()
              })
Spacer(modifier = Modifier.width(100.dp) )

            Text(text = "movies")
        }}
    }) {


        Surface(modifier = Modifier
    .fillMaxHeight()
    .fillMaxWidth()) {
    Column(horizontalAlignment = Alignment.CenterHorizontally
    , verticalArrangement = Arrangement.Center) {
        Text(text = string.toString(), style = MaterialTheme.typography.h5)
Spacer(modifier = Modifier.height(23.dp))


    }



}
    }

}