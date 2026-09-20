package com.example.coffeeapp.ui_component

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.coffeeapp.R
import com.example.coffeeapp.navigation.Routes
import com.example.coffeeapp.ui.theme.LightBrown

import java.util.jar.Attributes


@Composable
 fun bottomNavigationbar(navController: NavController , route: String) {

     val navItem = listOf<NavItem>(
         NavItem("Home",R.drawable.regular_outline_home, Routes.HomeScreen),
         NavItem("Cart", R.drawable.regular_outline_bag, Routes.CartScreen),
         NavItem("Favourites", R.drawable.regular_outline_heart, Routes.FavouritesScreen),
         NavItem("Profile", R.drawable.outline_account_circle_24, Routes.ProfileScreen)
     )

    NavigationBar(
        containerColor = MaterialTheme.colorScheme.surface,
        modifier = Modifier.height(100.dp),

    ) {
        navItem.forEachIndexed { index, item ->
            NavigationBarItem(
                icon = {
                    Icon(
                        painter = painterResource(item.icon),
                        contentDescription = item.title
                    )
                },
                label = { Text(text = item.title) },
                modifier = Modifier.size(30.dp),
                selected = item.title == route,

                //Handled Bottom Navigation Bar
                onClick = {
                    navController.navigate(route = item.routes){
                        popUpTo(navController.graph.startDestinationId ){
                            saveState = true// save the state of screen;
                        }
                        launchSingleTop = true// keep only one in stack , in case of multiple click;
                        restoreState = true // saveState save the state and restoreState restore the state of screen;


                    }
                },
                alwaysShowLabel = false,
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = LightBrown,
                    selectedTextColor = LightBrown,
                    unselectedIconColor = Color.DarkGray,
                    unselectedTextColor = Color.DarkGray,
                    indicatorColor = LightBrown.copy(alpha = 0.02f)
                )
            )
        }
    }

}

data class NavItem(
    val title: String,
    val icon: Int,
    val routes: Routes
)