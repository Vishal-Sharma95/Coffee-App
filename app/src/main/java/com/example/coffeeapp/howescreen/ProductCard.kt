package com.example.coffeeapp.howescreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.coffeeapp.R
import com.example.coffeeapp.model.Product
import com.example.coffeeapp.ui.theme.CoffeeBrown
import com.example.coffeeapp.ui.theme.IvoryWhite
import com.example.coffeeapp.ui.theme.LightBrown
import com.example.coffeeapp.ui.theme.LightGray


@Composable
fun ProductCard(modifier: Modifier = Modifier
                , product: Product) {

    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp)
            ,
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = LightGray.copy(alpha = 0.6f)
        )
    ) {
        Column(modifier = Modifier.padding(8.dp)) {

            Box(modifier = Modifier.fillMaxWidth().height(150.dp)) {
                Image(painter = painterResource(product.imageRes),
                    contentDescription = "product Card",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                        .clip(shape = RoundedCornerShape(24.dp)))

                //Add to favorite btn on Image;
                Box(modifier = Modifier.align(alignment = Alignment.TopEnd)
                    .padding(8.dp)
                    .background(color = LightGray.copy(alpha = 0.8f),
                        shape = RoundedCornerShape(8.dp))
                    .padding(horizontal = 8.dp, vertical = 4.dp)
                    ) {
                    Icon(
                        painter = painterResource(R.drawable.regular_outline_heart),
                        contentDescription = "Add to favorite",
                        tint = LightBrown,
                        modifier = modifier.size(30.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(8.dp))
            Text(text = product.name,
                style = typography.titleMedium.copy(
                    color = Color.Black,
                    fontWeight = FontWeight.SemiBold
                ))

            Spacer(modifier = modifier.height(4.dp))
            Text(text = product.description,
                style = MaterialTheme.typography.bodySmall.copy(
                    color = Color.Gray
                ),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )//These property noted

            Spacer(modifier = Modifier.height(20.dp))

            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically) {

                Text(text = "$ ${product.price}",
                    style = typography.titleMedium.copy(
                        fontWeight = FontWeight.Bold,
                        color = CoffeeBrown
                    ))

                IconButton(onClick = {},
                    modifier = Modifier.background(
                        color = LightBrown,
                        shape = RoundedCornerShape(10.dp)
                    )) {
                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = "Add to Card Button",
                        modifier = Modifier.background(color = LightBrown),
                        tint = Color.White
                    )
                }
            }
        }
    }

}