package com.example.littlelemon

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

interface Destinations {
    val route:String
    val icon: ImageVector
    val title:String
}

object Home:Destinations {
    override val route = "Home"
    override val icon = Icons.Filled.Home
    override val title = "Home"
}

object MenuList:Destinations {
    override val route = "Menu List"
    override val icon = Icons.Filled.Menu
    override val title = "Menu"
}

object Settings:Destinations {
    override val route = "Settings Screen"
    override val icon = Icons.Filled.Settings
    override val title = "Settings"
}