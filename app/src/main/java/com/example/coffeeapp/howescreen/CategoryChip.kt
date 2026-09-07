package com.example.coffeeapp.howescreen

import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffeeapp.ui.theme.LightBrown
import com.example.coffeeapp.ui.theme.LightGray


@Composable
 fun CategoryChip(
    text: String,
    isSelected: Boolean,
    onSelected: () -> Unit) {

    Box(modifier = Modifier.size(width = 90.dp, height = 30.dp)
        .clip(RoundedCornerShape(6.dp))
        .clickable(onClick = {onSelected()})
        .background(color = if (isSelected) LightBrown else Color.Gray.copy(alpha = 0.6f)),
        contentAlignment = Alignment.Center){

        //******  contentAlignment = Alignment.Center -> used for center the child in Box; ***

        Text(text = text,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            maxLines = 1,
            textAlign = TextAlign.Center,
            color = Color.Black
            )
    }

}