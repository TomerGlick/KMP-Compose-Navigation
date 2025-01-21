package com.poalim.myapplication.Navigation

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Details : Screen("details")
}