package com.websarva.wings.android.countupapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CountUp()
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

/**
 * カウントアップボタンと現在のカウント回数を
 * 表示するComposable関数
 *
 * カウントアップボタンが押下されるたびにカウントの回数を
 * 1ずつ増やし、表示を更新する。
 * 内部的にMutableState<Int>を用いてカウントの回数を
 * 保持している。
 */
@Composable
fun CountUp() {
    var count: Int by remember {
    mutableStateOf(0)
    }

    Column {
        Text(
            text = "$count"
        )
        Button(
            onClick = {
            count += 1
            }
        ) {
            Text(
                text = "Count Up!"
            )
        }
    }
}
