package com.example.littlelemon

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Counter(count: Int, onIncrement: () -> Unit, onDecrement: () -> Unit) {

    Card(elevation = CardDefaults.cardElevation(32.dp)) {
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Greek Salad",
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp
            )
            Row (
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                TextButton(onClick = { onDecrement() }) {
                    Text(
                        text = "-",
                        fontSize = 40.sp
                    )
                }
                Text(
                    text = count.toString(),
                    Modifier
                        .size(42.dp)
                        .padding(start = 10.dp),
                    fontSize = 32.sp
                )
                TextButton(onClick = { onIncrement() }) {
                    Text(
                        text = "+",
                        fontSize = 28.sp
                    )
                }
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Add")
            }
        }
    }
}