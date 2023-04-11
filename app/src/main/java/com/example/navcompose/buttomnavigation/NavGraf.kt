package com.example.navcompose.buttomnavigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun NavGraph(navHostController: NavHostController) {
    NavHost(navController = navHostController, startDestination = "screen1") {
        composable("screen1"){
            Screens1()
        }
        composable("screen2"){
            Screens2()
        }
        composable("screen3"){
            Screens3()
        }
        composable("screen4"){
            Screens4()
        }
    }
}