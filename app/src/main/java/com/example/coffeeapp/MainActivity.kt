package com.example.coffeeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.coffeeapp.cardscreen.CardScreen
import com.example.coffeeapp.cardscreen.CardScreenChip
import com.example.coffeeapp.detailsscreen.DetailsScreen
import com.example.coffeeapp.homescreen.HomeScreen
import com.example.coffeeapp.navigation.NavGraph
import com.example.coffeeapp.ui.theme.CoffeeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()//Important and with Sccffold and their innerpadding
        setContent {
            CoffeeAppTheme {
              NavGraph()

            }
        }
    }
}


