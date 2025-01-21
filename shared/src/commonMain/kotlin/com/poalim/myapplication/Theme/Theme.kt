package com.poalim.myapplication.Theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color


// Light theme colors
val lightColors = lightColorScheme(
    primary = Color(0xFF8E24AA),
    onPrimary = Color.White,
    secondary = Color(0xFFBA68C8),
    onSecondary = Color.Black,
    tertiary = Color(0xFFE1BEE7),
    onTertiary = Color.Black,
    background = Color(0xFFF3E5F5),
    onBackground = Color.Black,
    surface = Color.LightGray,
    onSurface = Color.Black,
    error = Color(0xFFD32F2F),
    onError = Color.White
)

// Dark theme colors
val darkColors = darkColorScheme(
    primary = Color(0xFFBA68C8),
    onPrimary = Color.Black,
    secondary = Color(0xFFAB47BC),
    onSecondary = Color.White,
    tertiary = Color(0xFFCE93D8),
    onTertiary = Color.Black,
    background = Color(0xFF311B92),
    onBackground = Color.White,
    surface = Color(0xFF1A237E),
    onSurface = Color.White,
    error = Color(0xFFEF5350),
    onError = Color.Black
)

@Composable
fun AppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        darkTheme -> darkColors
        else -> lightColors
    }

    MaterialTheme(
        colorScheme = colorScheme,
        content = content
    )
}