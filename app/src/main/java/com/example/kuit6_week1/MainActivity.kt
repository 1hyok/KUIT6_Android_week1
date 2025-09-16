package com.example.kuit6_week1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.kuit6_week1.ui.theme.Kuit6_week1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Kuit6_week1Theme {

            }
        }
    }
}

@Composable
fun Sample(modifier: Modifier = Modifier) {
    Column(modifier.fillMaxSize()) {
        SampleRow {
            Box(
                Modifier
                    .background(color = Color.Black)
                    .fillMaxSize()
            ) {

            }
        }
    }
}

@Preview
@Composable
private fun SamplePreview() {
    Sample()
}