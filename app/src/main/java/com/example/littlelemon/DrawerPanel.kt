package com.example.littlelemon

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ExitToApp
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun DrawerPanel() {
    List(10) {
        Text(
            text = "item#$it",
            modifier = Modifier
                .padding(horizontal = 20.dp, vertical = 10.dp)
        )
    }
    IconButton(onClick = { }) {
        Icon(imageVector = Icons.AutoMirrored.Filled.ExitToApp, contentDescription = "Close Icon" )
    }
}