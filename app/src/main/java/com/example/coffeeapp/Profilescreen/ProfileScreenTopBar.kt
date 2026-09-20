package com.example.coffeeapp.Profilescreen

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
 fun ProfileScreenTopBar() {

    TopAppBar(
        title = { Text(text = "Profile",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center ,
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp)}
    )
}