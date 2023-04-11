package com.example.navcompose.buttomnavigation

import com.example.navcompose.R

sealed class BottomItem(val title: String, val icon: Int, val route: String){
    object Screen1: BottomItem("Screen1", R.drawable.baseline_add_shopping_cart_24, "screen1")
    object Screen2: BottomItem("Screen2", R.drawable.baseline_add_alert_24, "screen2")
    object Screen3: BottomItem("Screen3", R.drawable.baseline_add_reaction_24, "screen3")
    object Screen4: BottomItem("Screen4", R.drawable.baseline_adb_24, "screen4")
}
