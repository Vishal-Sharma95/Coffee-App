package com.example.coffeeapp.cardscreen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.coffeeapp.R
import com.example.coffeeapp.navigation.Routes

@OptIn(ExperimentalMaterial3Api::class)

@Composable
 fun CardScreenTopBar(navController: NavController) {

    TopAppBar(

        title = { Text(text = "Order",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center ,
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp)},

        navigationIcon = {
            Icon(
                painter = painterResource(R.drawable.regular_outline_arrow_left),
                contentDescription = "Left Back Navigation",
                tint = Color.Black,
                modifier = Modifier.clickable(
                    onClick = {navController.popBackStack()}// back a stack and reached to before stack

                )
            )
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.White
        )
    )

}