package com.example.coffeeapp.FavouritesScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Remove
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.coffeeapp.R
import com.example.coffeeapp.model.Product

import com.example.coffeeapp.ui.theme.CoffeeBrown
import com.example.coffeeapp.ui.theme.LightGray



@Composable
 fun FavoriteScreencardchip(favourite: Product,  onRemove:() -> Unit) {

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
                painter = painterResource(favourite.imageRes),
                contentDescription = "Card chip Image",
                Modifier.clip(shape = RoundedCornerShape(16.dp))
                    .size(60.dp)
            )



            Column(modifier = Modifier.weight(1f)
                .padding(start = 12.dp)) {
                Text(text = favourite.name,
                    style = MaterialTheme.typography.bodyLarge.copy(
                        fontWeight = FontWeight.SemiBold,
                        color = Color.Black
                    ))

                Text(text = favourite.description,
                    style = MaterialTheme.typography.bodySmall.copy(
                        color = Color.DarkGray
                    ))
            }




            Row(verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(10.dp)) {

                //For delete
                IconButton(
                    modifier = Modifier.size(36.dp),
                    onClick = { onRemove()}
                ) {
                    Icon(
                        modifier = Modifier.background(color = CoffeeBrown.copy(alpha = 0.1f),
                            shape = CircleShape).padding(5.dp),
                        imageVector = Icons.Default.Delete,
                        contentDescription = "Minus Icon btn",
                        tint = MaterialTheme.colorScheme.error,
                    )
                }

            }

        }

    }
}