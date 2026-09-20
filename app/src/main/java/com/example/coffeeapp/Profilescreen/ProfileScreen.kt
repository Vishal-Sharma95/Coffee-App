package com.example.coffeeapp.Profilescreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.coffeeapp.R
import com.example.coffeeapp.ui.theme.CoffeeBrown
import com.example.coffeeapp.ui.theme.LightGray
import com.example.coffeeapp.ui_component.bottomNavigationbar

@Composable
 fun ProfileScreen(navController: NavController) {

    Scaffold(modifier = Modifier.fillMaxSize(),
        topBar = {ProfileScreenTopBar()},
        bottomBar = { bottomNavigationbar(navController, route = "Profile") }
        ) { innerPadding ->

        Column(
            modifier = Modifier.fillMaxSize().padding(16.dp).padding(innerPadding)
        ) {

            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {


                Box(
                    modifier = Modifier.size(100.dp).background(
                        color = CoffeeBrown.copy(alpha = 0.15f),
                        shape = CircleShape
                    ),
                    contentAlignment = Alignment.Center,

                    ) {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = "Profile Icon",
                        modifier = Modifier.size(80.dp),
                        tint = CoffeeBrown

                    )
                }

                Spacer(modifier = Modifier.height(20.dp))
                Text(text = "Vishal Kumar Sharma",
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.SemiBold)

                Spacer(modifier = Modifier.height(4.dp))

                Text(text = "example@gmail.com",
                    style = MaterialTheme.typography.bodyMedium,
                    fontWeight = FontWeight.Normal,
                    color = Color.DarkGray
                )

            }



            //In Parent Column , // second child of Parent Column

            Spacer(modifier= Modifier.height(30.dp))
            Column(modifier = Modifier.padding(16.dp)) {
                Text(text = "Address",
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.SemiBold,
                )

                Spacer(modifier = Modifier.height(24.dp))

                Text(text = "IIT Road",
                    style = MaterialTheme.typography.bodyMedium,
                    fontWeight = FontWeight.Normal,
                    color = Color.DarkGray
                )

                Text(text = "Roorkee Uttrakhand",
                    style = MaterialTheme.typography.bodyMedium,
                    fontWeight = FontWeight.Normal,
                    color = Color.DarkGray
                )

                Text(text = "Kerla - 682025",
                    style = MaterialTheme.typography.bodyMedium,
                    fontWeight = FontWeight.Normal,
                    color = Color.DarkGray
                )
            }

            Spacer(modifier = Modifier.height(30.dp))

            Card(
                modifier = Modifier.fillMaxWidth()
            ) {

                Column(modifier = Modifier.padding(18.dp),
                    verticalArrangement = Arrangement.spacedBy(21.dp)) {

                    Row() {

                        Icon(
                            imageVector = Icons.Default.ShoppingCart,
                            contentDescription = "Shopping Cart",
                            tint = CoffeeBrown
                        )
                        Spacer(modifier = Modifier.width(8.dp))

                        Text(text = "Orders",
                            style = MaterialTheme.typography.bodyLarge,
                            fontWeight = FontWeight.SemiBold,
                            color = Color.DarkGray)
                    }



                    Row() {

                        Icon(
                            imageVector = Icons.Default.Favorite,
                            contentDescription = "Favourites Icon",
                            tint = CoffeeBrown
                        )
                        Spacer(modifier = Modifier.width(8.dp))

                        Text(text = "Favorites",
                            style = MaterialTheme.typography.bodyLarge,
                            fontWeight = FontWeight.SemiBold,
                            color = Color.DarkGray)
                    }



                }

            }

        }
    }



}