package com.example.coffeeapp.howescreen

import androidx.compose.foundation.Image
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
import androidx.compose.ui.res.painterResource
import com.example.coffeeapp.R
import com.example.coffeeapp.model.Product

@Preview(showBackground = true, showSystemUi = true)
@Composable
 fun HomeScreen() {

 var location = "Janatha Rd, Palarivattom"
 Scaffold(
  bottomBar = { bottomNavigationbar() }
 ) { innerpadding ->

  Box(modifier = Modifier.fillMaxSize()
   .padding(innerpadding)
   .background(Color.White)) {

   //Upper Black  Gradient
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
    )
   )

   //Actual content are in Column
   Column(modifier = Modifier.fillMaxSize()
    .padding(horizontal = 16.dp)
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

    Spacer(modifier = Modifier.height(30.dp))

    Image(
     painter = painterResource(R.drawable.banner_1),
     contentDescription = "Banner Image"
    )

    Spacer(modifier = Modifier.height(16.dp))
    HomeScreenCatogary()

    //Displaying Product

    val products = listOf(
     Product(1,"Epresso","Strong and Rich",3.80,R.drawable.coffee_1),
     Product(2,"Latte","Strong and Rich",3.80,R.drawable.coffee_2),
     Product(3,"Cappuccino","Strong and Rich",3.80,R.drawable.coffee_3),
     Product(4,"Mocha","Strong and Rich",3.80,R.drawable.coffee_4),
     Product(5,"Macchiato","Strong and Rich",3.80,R.drawable.coffee_5),
     Product(6,"Flate White","Strong and Rich",3.80,R.drawable.coffee_6),
     Product(7,"Iced Mocha","Strong and Rich",3.80,R.drawable.coffee_4),

     )


    ProductGrid(products = products)

    //Content last herer;
   }


      }

        }


  //function end here
 }


