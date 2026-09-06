package com.example.coffeeapp.howescreen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffeeapp.ui_component.bottomNavigationbar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.ui.Alignment

@Preview(showBackground = true, showSystemUi = true)
@Composable
 fun HomeScreen() {

  var location = "Janatha Rd, Palarivattom"
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
   )) {

   Column(modifier = Modifier.fillMaxSize()
    .padding(horizontal = 16.dp)
    .padding(innerpadding)
   ) {

    Text(text = "Location",
     color = Color.Gray,
     fontSize = 14.sp)

    Row(
     modifier = Modifier.fillMaxWidth(),
     verticalAlignment = Alignment.CenterVertically
    ) {

     Text(text = location,
      fontWeight = FontWeight.SemiBold,
      color = Color.White,
      fontSize = 16.sp)

     Spacer(modifier = Modifier.height(4.dp))

     Icon(imageVector = Icons.Default.KeyboardArrowDown,
      contentDescription = "Expand Location",
      tint = Color.White)

    }

    Spacer(modifier = Modifier.height(20.dp))

       Mysearchbar()


   }
  }
 }
}