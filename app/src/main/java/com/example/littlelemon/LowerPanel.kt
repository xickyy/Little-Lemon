package com.example.littlelemon

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LowerPanel() {
    Column {
        WeeklySpecialCard()
        MenuDish()
    }
}


@Composable
fun WeeklySpecialCard(){
    Card(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Text(
            text = "Weekly Special",
            color = LittleLemonColor.charcoal,
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(8.dp)
        )
    }
}


@Composable
fun MenuDish() {
    Card {
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
        ) {
            Column {
                Text(text = "Greek Salad",
                    color = LittleLemonColor.charcoal,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(text = "The famous greek salad of " +
                        "crispy lettuce, peppers, olives, " +
                        "our Chicago ...",
                    color = LittleLemonColor.green,
                    modifier = Modifier
                        .padding(top = 5.dp, bottom = 5.dp)
                        .fillMaxWidth(.75f)
                )
                Text(text = "$12.99",
                    color = LittleLemonColor.green,
                    fontWeight = FontWeight.Bold
                )
            }
            Image(painter = painterResource(id = R.drawable.greeksalad),
                contentDescription = "",
            )
        }
    }
    Divider(modifier = Modifier.padding(start = 8.dp, end = 8.dp),
        color = LittleLemonColor.yellow,
        thickness = 1.dp
    )
}

@Preview(showBackground = true)
@Composable
fun LowerPanelPreview(){
    LowerPanel()
}