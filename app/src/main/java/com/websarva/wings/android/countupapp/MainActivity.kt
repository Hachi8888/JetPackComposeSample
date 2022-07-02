package com.websarva.wings.android.countupapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloWorld()
        }
    }
 }

/**
 * Textに「Hello World!!」と表示するComposable関数
 */
@Composable
fun HelloWorld() {
    Text(text = "Hello World!!")
}
