package com.example.coffeeapp.cardscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Remove
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffeeapp.R
import com.example.coffeeapp.model.Product
import com.example.coffeeapp.ui.theme.CoffeeBrown
import com.example.coffeeapp.ui.theme.LightGray

@Composable
 fun CardScreenChip(product: Product) {


     var productCount by remember { mutableStateOf(1) }

        Card(
            modifier = Modifier.fillMaxWidth().padding(vertical = 6.dp),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(
                containerColor = LightGray
            ),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 4.dp
            )

        ) {
            //Card Content;

            Row(modifier = Modifier.fillMaxWidth().padding(10.dp),
                verticalAlignment = Alignment.CenterVertically) {

                Image(
                    painter = painterResource(product.imageRes),
                    contentDescription = "Card chip Image",
                    Modifier.clip(shape = RoundedCornerShape(16.dp))
                        .size(60.dp)
                )



                Column(modifier = Modifier.weight(1f)
                    .padding(start = 12.dp)) {
                    Text(text = product.name,
                        style = MaterialTheme.typography.bodyLarge.copy(
                            fontWeight = FontWeight.SemiBold,
                            color = Color.Black
                        ))

                    Text(text = product.description,
                        style = MaterialTheme.typography.bodySmall.copy(
                            color = Color.DarkGray
                        ))
                }


                //Plus  and minus product

                Row(verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(10.dp)) {

                    //for decrease
                    IconButton(
                        modifier = Modifier.size(24.dp),
                        onClick = {

                            if (productCount >1){
                            productCount -- }

                            }
                    ) {
                        Icon(
                            modifier = Modifier.background(color = CoffeeBrown.copy(alpha = 0.1f),
                                shape = CircleShape),
                            imageVector = Icons.Default.Remove,
                            contentDescription = "Minus Icon btn",
                            tint = CoffeeBrown
                        )
                    }



                    Text(text = " $productCount",
                        style = MaterialTheme.typography.bodyLarge.copy(
                            fontWeight = FontWeight.SemiBold,
                            color = Color.Black,

                        ))


                    //for increase
                   IconButton(onClick = {productCount ++},
                       modifier = Modifier.size(24.dp)) {

                       Icon(
                           modifier = Modifier.background(color = CoffeeBrown.copy(alpha = 0.1f),
                               shape = CircleShape
                           ),
                           imageVector = Icons.Default.Add,
                           contentDescription = "Add Icon btn",
                           tint = CoffeeBrown,

                       )
                   }
                }

            }

        }
    }


