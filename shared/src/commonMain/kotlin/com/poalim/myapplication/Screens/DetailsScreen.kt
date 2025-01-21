package com.poalim.myapplication.Screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun DetailsScreen (navController: NavController) {
    Column (Modifier.padding(20.dp)) {
        Spacer(Modifier.height(50.dp))
        Text("Details Screen")
        Button(onClick = {
            navController.popBackStack()
        }) {
            Text("Back")
        }
    }
}