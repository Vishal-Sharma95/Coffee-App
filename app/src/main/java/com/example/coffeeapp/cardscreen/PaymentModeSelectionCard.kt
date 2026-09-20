package com.example.coffeeapp.cardscreen


import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffeeapp.R
import com.example.coffeeapp.ui.theme.CoffeeBrown
import com.example.coffeeapp.ui.theme.LightBrown
import com.example.coffeeapp.ui.theme.LightGray


@Composable
 fun PaymentModeSelectionCard(totalfee: Double) {

     var expand by remember { mutableStateOf(false) }
    var selectedMode by remember { mutableStateOf("Online") }

    Card(modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = LightGray
        )
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
                .padding(24.dp),
            verticalArrangement = Arrangement.spacedBy(24.dp)
        ) {

            //First Row

            Row(modifier = Modifier.fillMaxSize(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically) {

                Row(
                    verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        painter = painterResource(if(selectedMode == "Online") R.drawable.mobile_banking else R.drawable.wallet),
                        contentDescription = "Mobile banking icon",
                        modifier = Modifier.size(30.dp),
                        tint = CoffeeBrown,

                        )
                    Spacer(modifier= Modifier.width(8.dp))

                    Column() {

                        Text(text = selectedMode,
                            style = MaterialTheme.typography.bodyMedium.copy(
                                fontWeight = FontWeight.SemiBold,
                                fontSize = 18.sp
                            ))

                        Text(text = if(selectedMode == "Online") "$$totalfee"
                               else "$${totalfee+1})",
                            style = MaterialTheme.typography.bodyMedium.copy(
                                fontSize = 18.sp
                            ))
                    }
                }

                Box() {
                    Icon(
                        painter = painterResource(R.drawable.regular_outline_arrow_down),
                        contentDescription = "Drop Down icon",
                        tint = Color.Black,
                        modifier = Modifier.size(20.dp)
                            .clickable(onClick = {expand = true})
                    )

                    //Drop Down Composable
                    var dropItem = listOf("Online", "Cash")
                    DropdownMenu(
                        expanded = expand,
                        onDismissRequest = {expand  = false},
                        modifier = Modifier.background(
                            color = LightGray
                        )
                    ) {

                        dropItem.forEach { mode ->

                            DropdownMenuItem(
                                text = {Text(text = mode,
                                    style = MaterialTheme.typography.bodyLarge.copy(
                                        fontWeight = FontWeight.SemiBold
                                    ))},
                                onClick = { selectedMode = mode
                                    expand = false},
                                leadingIcon = {
                                    Icon(
                                        painter = painterResource(
                                            if(mode == "Online") R.drawable.mobile_banking
                                            else R.drawable.wallet
                                        ),
                                        contentDescription = null,
                                        tint = CoffeeBrown,
                                        modifier = Modifier.size(24.dp).padding(4.dp)

                                    )
                                },
                                modifier = Modifier.padding(horizontal = 4.dp).background(
                                    color = if(selectedMode == mode) LightBrown.copy(alpha = 0.15f) else Color.Transparent
                                )
                            )
                        }



                    }
                }





            }



            //Second Row

            Button(
                onClick = {},
                modifier = Modifier.fillMaxWidth()
                    .height(50.dp),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = CoffeeBrown
                )

            ) {
                Text(text = "Place Order",
                    style = MaterialTheme.typography.bodyMedium.copy(
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 16.sp
                    ))
            }
        }



    }
}