package com.example.learningapplicationforcompose.navigation.bottom_bar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Warning
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavItem(
    val icon:ImageVector,
    val label:String,
    val route:String
)
{

    object Home: BottomNavItem(icon = Icons.Default.Home, label = "Home", route = "home")
    object Search: BottomNavItem(icon = Icons.Default.Search, label = "Search", route = "search")
    object Mail: BottomNavItem(icon = Icons.Default.Email, label = "Email", route = "email")
    object Profile: BottomNavItem(icon = Icons.Default.Person, label = "Profile", route = "profile")
    object Warning: BottomNavItem(icon = Icons.Default.Warning, label = "Warning", route = "warning")


    
}