package com.example.coffeeapp.detailsscreen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
 fun DetailsScreen() {



    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {DetailsScreeTopAppBar()},
        bottomBar = {DetailsScreenBottomAppBar()}

    ) { }
}