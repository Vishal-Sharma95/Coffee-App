package com.example.coffeeapp.detailsscreen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.coffeeapp.R
import com.example.coffeeapp.model.Product


@Composable
 fun DetailsScreen(productId:Int,navController: NavController) {

    val products = listOf(
        Product(1,"Epresso","Strong and Rich",3.80,R.drawable.coffee_1),
        Product(2,"Latte","Strong and Rich",3.80,R.drawable.coffee_2),
        Product(3,"Cappuccino","Strong and Rich",3.80,R.drawable.coffee_3),
        Product(4,"Mocha","Strong and Rich",3.80,R.drawable.coffee_4),
        Product(5,"Macchiato","Strong and Rich",3.80,R.drawable.coffee_5),
        Product(6,"Flate White","Strong and Rich",3.80,R.drawable.coffee_6),
        Product(7,"Iced Mocha","Strong and Rich",3.80,R.drawable.coffee_4),

        )

    val selectedProduct = products.find { it.id == productId }

    if(selectedProduct == null){
        Text(text = "Product not found", color = Color.Red)
        return
    }
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {DetailsScreeTopAppBar(navController)},
        bottomBar = {DetailsScreenBottomAppBar()}

    ) { innerPadding ->

        LazyColumn() {
            item {
                ProductDetailsContent(selectedProduct, innerPadding = innerPadding)
            }
        }

    }
}