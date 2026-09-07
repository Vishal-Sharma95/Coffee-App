package com.example.coffeeapp.howescreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
 fun HomeScreenCatogary() {

     val categories = listOf<String>("All Coffee","Macchiato","Latte", "Americano", "Snacks", "Desserts")
    var selectedCategory by remember { mutableStateOf(categories.first()) }

    LazyRow(modifier = Modifier.fillMaxWidth()
        .padding(horizontal = 12.dp ),
        horizontalArrangement = Arrangement.spacedBy(8.dp)) {

        items(categories){ catogary  ->

            CategoryChip(
                text = catogary,
                isSelected = catogary == selectedCategory,
                onSelected = {selectedCategory = catogary}

            )
        }

    }

}