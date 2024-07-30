package com.uvg.example.ejemplo01_kotlin

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.uvg.example.ejemplo01_kotlin.ui.theme.Ejemplo01_kotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Ejemplo01_kotlinTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Diego :D")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column (
        modifier = modifier
    ) {
        Text(
            text = "Hello $name!",
            modifier = modifier
        )
    
    }
}

@Preview(showBackground = true, showSystemui = true)
@Composable
fun GreetingPreview() {
    Ejemplo01_kotlinTheme {
        Greeting("Android")
    }
}