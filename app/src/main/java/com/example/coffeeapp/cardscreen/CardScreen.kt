package com.example.coffeeapp.cardscreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.coffeeapp.R
import com.example.coffeeapp.model.Product
import com.example.coffeeapp.ui.theme.CoffeeBrown
import com.example.coffeeapp.ui_component.bottomNavigationbar


@Composable
 fun CardScreen(navController: NavController) {

     var amount by remember { mutableStateOf(12.50) }


    var fee by remember { mutableStateOf(12.50) }
    var  totalfee by remember  { mutableStateOf( amount + fee) }

    val Cardproducts = listOf(
        Product(1,"Epresso","Strong and Rich",3.80,R.drawable.coffee_1),
        Product(2,"Latte","Strong and Rich",3.80,R.drawable.coffee_2),
        Product(3,"Cappuccino","Strong and Rich",3.80,R.drawable.coffee_3),

        )

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {CardScreenTopBar(navController)},
        bottomBar = { bottomNavigationbar(navController,"Cart") },
        containerColor = Color.White
    ) { innerPadding ->

        LazyColumn(
            modifier = Modifier.padding(innerPadding)
                .padding(horizontal = 16.dp)
        ) {

            item {
                Row() {
                    Text(text = "Deliver",
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                        color = CoffeeBrown
                    )
                }

                Spacer(modifier = Modifier.height(16.dp))

               Cardproducts.forEach { product ->
                   CardScreenChip(product)
               }


                Spacer(modifier = Modifier.height(16.dp))

                //Other than Product Order;

                Text(
                    text = "Payment Summary",
                    style = MaterialTheme.typography.titleMedium.copy(
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp
                    )
                )

                Spacer(modifier = Modifier.height(12.dp))
                Row(
                    modifier = Modifier.fillMaxSize(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(text = "Price",
                        fontSize = 18.sp)
                    Text(text = "$$amount",
                        fontSize = 18.sp)
                }

                Spacer(modifier = Modifier.height(2.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(text = "Dilevary Fee",
                        fontSize = 18.sp)
                    Text(text = "$$fee",
                        fontSize = 18.sp)
                }



                Spacer(modifier = Modifier.height(12.dp))

                //Final price Card;
                PaymentModeSelectionCard(totalfee)



            }


        }

    }
}