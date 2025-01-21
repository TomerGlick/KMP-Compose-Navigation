package com.poalim.myapplication.Screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.compose.material3.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.poalim.myapplication.Navigation.Screen
import kotlinx.coroutines.sync.Mutex

@Composable
fun HomeScreen (navController: NavController) {
    Column (Modifier.padding(20.dp)) {
        Spacer(Modifier.height(50.dp))
        Text("Home Screen")
        Button(onClick = {
            navController.navigate(route = Screen.Details.route)
        }) {
            Text("Go to Details")
        }
    }
}
