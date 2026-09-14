package com.example.coffeeapp.detailsscreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffeeapp.ui.theme.CoffeeBrown
import com.example.coffeeapp.ui.theme.IvoryWhite
import com.example.coffeeapp.ui_component.AppMessageDialog

@Preview(showBackground = true)
@Composable
 fun DetailsScreenBottomAppBar() {

     var dialogFlag by remember { mutableStateOf(false) }

    BottomAppBar(
        modifier = Modifier.fillMaxWidth(),
        containerColor = Color.Transparent
    ) {
        Row(modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween) {

            Column() {
                Text(text = "Price",
                    fontSize = 16.sp)

                Text(text = "$4.53",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.SemiBold)
            }

            Spacer(modifier = Modifier.width(40.dp))

            Button(
                onClick = {
                    dialogFlag = true
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = CoffeeBrown,
                    contentColor = IvoryWhite
                ),
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier.weight(1f).height(56.dp)
            ) {
                Text(text = "Add To Cart",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold)
            }


            AppMessageDialog(
                show = dialogFlag,
                title = "Added to Card",
                message = "Item has been Added to Your Cart",
                onDismiss = {dialogFlag = false}
            )
        }

    }
}