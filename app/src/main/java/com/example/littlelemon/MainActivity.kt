package com.example.littlelemon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.littlelemon.ui.theme.LittleLemonTheme
import androidx.compose.material3.*
import androidx.compose.material.DrawerValue
import androidx.compose.material.rememberDrawerState
import androidx.compose.foundation.layout.size
import androidx.compose.material.Scaffold
import kotlinx.coroutines.launch


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Container()
        }
    }
}


@Composable
fun Container() {
    val scaffoldState = rememberScaffoldState(rememberDrawerState(DrawerValue.Closed))
    val scope = rememberCoroutineScope()

    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            TopAppBar(scaffoldState)
                 },
        drawerContent = {
            // Content of the drawer goes here
            androidx.compose.material.IconButton(onClick = { scope.launch { scaffoldState.drawerState.close() } }) {
                Image(
                    painter = painterResource(id = R.drawable.hamburgericon),
                    contentDescription = "Menu Icon",
                    modifier = Modifier
                        .size(24.dp)
                )
            }
                Text(
                    text = "Drawer Content",
                    modifier = Modifier
                        .padding(10.dp)
                )
            }
        ) { innerPadding ->
            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxSize()
            ) {
                var count by rememberSaveable { mutableIntStateOf(0) }
                UpperPanel()
                LowerPanel()
                Counter(count, { count++ }, { count-- })
            }
        }
    }

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LittleLemonTheme {
        UpperPanel()
    }
}