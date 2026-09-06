package com.example.coffeeapp.howescreen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffeeapp.R
import com.example.coffeeapp.ui.theme.CoffeeBrown

@Preview(showBackground = true, showSystemUi = true)
@Composable
 fun Mysearchbar() {

     var textfield by remember { mutableStateOf("") }

    Row(modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically) {
        TextField(
            value = textfield,
            onValueChange = {textfield = it},
            placeholder = { Text("Search Coffee", color = Color.Gray) },
            leadingIcon = {
                Icon(
                    painter = painterResource(R.drawable.regular_outline_search),
                    contentDescription = "Leading Search",
                    tint = Color.White,
                    modifier = Modifier.size(20.dp)
                )
            },
            shape = RoundedCornerShape(
                topStart = 16.dp,
                bottomStart = 16.dp
            ),
            modifier = Modifier.weight(1f)
                ,
            colors = TextFieldDefaults.colors(
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                unfocusedContainerColor = Color(0xFF2A2A2A),
                focusedContainerColor = Color(0xFF504E4E),
                cursorColor = Color.LightGray,
                focusedTextColor = Color.White,
                unfocusedTextColor = Color.Gray
            ),
            singleLine = true,

        )

        Spacer(modifier = Modifier.width(8.dp))

        Icon(
            painter = painterResource(R.drawable.regular_outline_filter),
            contentDescription = "Filter Icon",
            tint = Color.White,
            modifier = Modifier.size(width = 48.dp, height = 56.dp)
                .background(CoffeeBrown, shape = RoundedCornerShape(
                    topEnd = 16.dp,
                    bottomEnd = 16.dp
                ))
                .clickable(enabled = true, onClick = {})


        )
    }
}