package com.example.littlelemon

import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import android.widget.LinearLayout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.littlelemon.ui.theme.LittleLemonTheme

class MainActivity : ComponentActivity() {

    lateinit var toplayout : LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toplayout=findViewById(R.id.toplayout)
        toplayout.setBackgroundColor(Color.parseColor("#495E57"))
        var textview = TextView(this)
        textview.text=resources.getText(R.string.little_lemon)
        textview.setTextColor(Color.parseColor("#F4CE14"))
        toplayout.addView(textview)

//        setContent {
//            LittleLemonTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                    Greeting("Android")
//                }
//            }
//        }
    }
}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello Ricky!",
//        modifier = modifier
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    LittleLemonTheme {
//        Greeting("Ricky")
//    }
//}