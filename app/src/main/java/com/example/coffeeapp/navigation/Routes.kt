package com.example.coffeeapp.navigation

import kotlinx.serialization.Serializable

sealed class Routes {

    @Serializable
    object WelcomeScreen: Routes()

    @Serializable
    object HomeScreen: Routes()

    //agar hume  ek screen se dussre screen me navigate karna hai to
    // sealed object bna kar use kar sakte hai.

    //Per , Agar hume Ek Screen se Dussre Screen tk navigate karna hai
    // and sath hi sath data bhi pass karna hai to data class use karenge.


    @Serializable
    data class DetailScreen(val productId: Int): Routes()
}