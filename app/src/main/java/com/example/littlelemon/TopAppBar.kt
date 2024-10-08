package com.example.littlelemon

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.IconButton
import androidx.compose.material.ScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch


@Composable
fun TopAppBar(scaffoldState: ScaffoldState) {
    val scope = rememberCoroutineScope()
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(onClick = {scope.launch {scaffoldState.drawerState.open()}}) {
            Image(
                painter = painterResource(id = R.drawable.hamburgericon),
                contentDescription ="Menu Icon",
                modifier = Modifier
                    .size(24.dp)
            )
        }

        Image(
            painter = painterResource(id = R.drawable.littlelemontitle),
            contentDescription ="Little Lemon Logo" ,
            modifier = Modifier
                .fillMaxWidth(0.5F)
                .padding(horizontal = 10.dp)
        )

        IconButton(onClick = { /*TODO*/ }) {
            Image(
                painter = painterResource(id = R.drawable.shoppingcart),
                contentDescription ="Cart",
                modifier = Modifier
                    .size(28.dp)
                )
        }
    }
}
