package com.example.coffeeapp.howescreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.coffeeapp.ui_component.bottomNavigationbar

@Preview(showBackground = true, showSystemUi = true)
@Composable
 fun HomeScreen() {

 Scaffold(
  bottomBar = { bottomNavigationbar() }
 ) { innerpadding ->

  Box(modifier = Modifier.fillMaxWidth()
   .fillMaxHeight(1f/3f)
   .background(
    brush = Brush.linearGradient(
     colors = listOf<Color>(
      Color(0xFF303030),
      Color(0xFF1F1F1F),
      Color(0xFF121212)
     )
    )
   )) { }
 }
}