package com.example.coffeeapp.ui_component

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

//App Message Dialog


@Composable
 fun AppMessageDialog(
     show: Boolean,
     title: String,
     message: String,
     onDismiss: () -> Unit
 ) {

   if (show){

       AlertDialog(
           onDismissRequest = { onDismiss() },
           title = {Text(text = title)},
           text = { Text(text = message) },
           confirmButton = { TextButton(
               onClick = {onDismiss()}
           ){
               Text(text = "OK")
           } }
       )
   }
}