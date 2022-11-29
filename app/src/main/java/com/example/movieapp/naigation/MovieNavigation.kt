package com.example.movieapp.naigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.movieapp.screens.Home.HomeScreen
import com.example.movieapp.screens.Home.details.DetailsScreen
@Preview
@Composable
fun MovieNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController,
        startDestination = movieScreen.HomeScreen.name){

        composable(movieScreen.HomeScreen.name){
            /// here we paa this should lead us to
            HomeScreen(navController =  navController)

        }
//
        composable(movieScreen.DetailsScreen.name+"/{movie}",
        arguments = listOf(navArgument(name = "movie"){type= NavType.StringType})
        ){
            backStackEntry->
            DetailsScreen(navController=navController,backStackEntry.arguments?.getString("movie"))
        }


    }
}