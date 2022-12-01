package com.example.movieapp.screens.Home

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
//import com.example.movieapp.MovieRow
import com.example.movieapp.Widgets.MovieRow
import com.example.movieapp.model.Movie
import com.example.movieapp.model.getMovies
import com.example.movieapp.naigation.movieScreen
@Composable
fun HomeScreen(navController: NavController){
    Scaffold(topBar = {
        TopAppBar(backgroundColor = Color.Transparent,
            elevation = 0.dp) {
            Text(text = "Movies")
        }
    }) {
    MainContent(navController =navController)
    }
}




@Composable
fun MainContent(navController: NavController,movieList: List<Movie> = getMovies()
                  ){
    Column(modifier = Modifier.padding(12.dp)) {
        LazyColumn{
            items(items = movieList){
                MovieRow(movie = it){movie->

         navController.navigate(route = movieScreen.DetailsScreen.name+"/$movie")
                    // Log.d("TAG", "MainContent: $movie")

                }

            }
        }

    }



}
