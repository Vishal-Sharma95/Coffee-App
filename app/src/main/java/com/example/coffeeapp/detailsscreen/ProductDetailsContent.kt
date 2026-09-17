package com.example.coffeeapp.detailsscreen


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffeeapp.R
import com.example.coffeeapp.model.Product
import com.example.coffeeapp.ui.theme.CoffeeBrown
import com.example.coffeeapp.ui.theme.IvoryWhite
import com.example.coffeeapp.ui.theme.LightGray

@Composable
 fun ProductDetailsContent(products: Product, innerPadding: PaddingValues) {

     var selectedVariable by remember { mutableStateOf("M") }

    Column(
        modifier = Modifier.fillMaxSize()
            .padding(16.dp)
            .padding(innerPadding)

    ) {

        Image(
            painter = painterResource(products.imageRes),
            contentDescription = products.name,
            modifier = Modifier.fillMaxWidth()
                .height(250.dp)
                .clip(RoundedCornerShape(10.dp)),
            contentScale = ContentScale.Crop

        )

        Spacer(modifier = Modifier.height(12.dp))

        Text(text = products.name,
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp,
            color = Color.Black)

        Spacer(modifier = Modifier.height(12.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Ice / Hot",
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                color = Color.Gray
            )

            Icon(
                painter = painterResource(R.drawable.default_bean),
                contentDescription = "Bean seeds Icon",
                modifier = Modifier.background(
                    color = IvoryWhite,
                    shape = RoundedCornerShape(10.dp)
                )
                    .size(36.dp)
                    .padding(6.dp),
                tint = CoffeeBrown
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        HorizontalDivider(modifier = Modifier.fillMaxWidth(),
            color = Color.LightGray.copy(alpha = 0.5f))

        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Description",
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp,
            color = Color.Black)

        Spacer(modifier = Modifier.height(12.dp))

        Text(text = products.description,
            fontWeight = FontWeight.Medium,
            fontSize = 16.sp,
            color = Color.Gray)

        Spacer(modifier = Modifier.height(24.dp))

        Text(text = "Size",
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp,
            color = Color.Black)

        Spacer(modifier = Modifier.height(12.dp))

        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(30.dp)) {

            listOf("S","M","L").forEach {  size ->

                DetailsCardSelectedChip(
                    sizeText = size,
                    selected = selectedVariable == size,
                    onClick = {selectedVariable = size},
                    modifier = Modifier.weight(1f)
                        .height(46.dp)
                )

            }
        }

    }

}