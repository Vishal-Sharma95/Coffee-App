package com.example.coffeeapp.howescreen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.coffeeapp.model.Product



@Composable
 fun ProductGrid(
     products: List<Product>
 ) {

    LazyColumn(
        modifier = Modifier.fillMaxSize()
            .padding(8.dp)

    ) {
        items(products.chunked(2)){ rowItem ->
/* If you have a list of 6 data class items
and call .chunked(2), it creates a new list containing
3 smaller lists, with 2 items in each.
 */
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                //Card is called
                ProductCard(
                    product = rowItem[0],
                    modifier = Modifier.weight(1f)
                )

                if(rowItem.size == 2){

                    ProductCard(
                        product = rowItem[1],
                        modifier = Modifier.weight(1f)
                    )

                } else {
                       Spacer(modifier = Modifier.weight(1f))
                    }

                }
            }


        }
    }
