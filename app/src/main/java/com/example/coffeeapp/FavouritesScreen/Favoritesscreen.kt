package com.example.coffeeapp.FavouritesScreen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.coffeeapp.R
import com.example.coffeeapp.model.Product
import com.example.coffeeapp.ui_component.bottomNavigationbar


@OptIn(ExperimentalMaterial3Api::class)

@Composable
 fun Favoritesscreen(navController: NavController) {

    var FavouriteItems by remember {
        mutableStateOf(
        listOf(
            Product(1,"Epresso","Strong and Rich",3.80,R.drawable.coffee_1),
            Product(2,"Latte","Strong and Rich",3.80,R.drawable.coffee_2),
            Product(3,"Cappuccino","Strong and Rich",3.80,R.drawable.coffee_3),

            )
    )
    }


    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                     Text(text = "Favourites Product",
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center ,
                        fontWeight = FontWeight.Bold,
                        fontSize = 24.sp)
                }
            )
        },
        bottomBar = {bottomNavigationbar(navController, route = "Favourites")}

    ) { innerPadding ->

        LazyColumn(
            modifier = Modifier.fillMaxSize().padding(16.dp).padding(innerPadding)
        ) {

            item {
                FavouriteItems.forEach {   product ->

                    FavoriteScreencardchip(product,
                        onRemove = { FavouriteItems = FavouriteItems - product })
                }
            }


        }
    }



}