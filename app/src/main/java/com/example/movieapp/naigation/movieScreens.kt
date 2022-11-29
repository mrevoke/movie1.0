package com.example.movieapp.naigation

enum class movieScreen{
    HomeScreen,
    DetailsScreen;
    companion object{
        fun  fromRoute(route: String?): movieScreen
        = when(route?.substringBefore("/")){

            HomeScreen.name->HomeScreen
            DetailsScreen.name->DetailsScreen
            null->HomeScreen
            else-> throw java.lang.IllegalArgumentException(
                "ROute $route is not recognised")
        }
    }
}