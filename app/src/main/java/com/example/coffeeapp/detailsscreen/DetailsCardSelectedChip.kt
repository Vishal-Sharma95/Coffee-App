package com.example.coffeeapp.detailsscreen

import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffeeapp.ui.theme.CharcoalGray
import com.example.coffeeapp.ui.theme.LightBrown
import com.example.coffeeapp.ui.theme.LightGray


@Composable
 fun DetailsCardSelectedChip(modifier: Modifier,selected: Boolean,onClick: () -> Unit,sizeText: String) {

    Box(
        modifier
            .background(
                color = if(selected) LightBrown else Color.White,
                shape = RoundedCornerShape(12.dp)
            )
            .border(
                width = 1.dp,
                shape = RoundedCornerShape(12.dp),
                color = LightGray
            )
            .height(46.dp)

            .clickable{onClick()},
        contentAlignment = Alignment.Center
    ) {

        Text(text = sizeText,
            fontSize = 16.sp,
            fontWeight = FontWeight.SemiBold,
            color = if (selected) Color.White else CharcoalGray
        )
    }
}