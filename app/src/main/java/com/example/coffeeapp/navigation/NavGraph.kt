package com.example.coffeeapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.coffeeapp.FavouritesScreen.Favoritesscreen
import com.example.coffeeapp.Profilescreen.ProfileScreen
import com.example.coffeeapp.cardscreen.CardScreen
import com.example.coffeeapp.detailsscreen.DetailsScreen
import com.example.coffeeapp.homescreen.HomeScreen
import com.example.coffeeapp.welcomescreen.Welcomescreen

@Preview
@Composable
 fun NavGraph() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.WelcomeScreen
    ) {
        //all the Destination

        composable<Routes.WelcomeScreen> {
            Welcomescreen(navController)
        }

        composable<Routes.HomeScreen> {
            HomeScreen(navController)
        }

        //different case with parameter
        composable<Routes.DetailScreen> { backStackEntry ->

            val args =  backStackEntry.toRoute<Routes.DetailScreen>()
            DetailsScreen(productId = args.productId,navController)

        }

        composable<Routes.CartScreen>{
            CardScreen(navController)
        }

        composable<Routes.FavouritesScreen>{
            Favoritesscreen(navController)
        }

        composable<Routes.ProfileScreen>{
            ProfileScreen(navController)
        }

    }

}