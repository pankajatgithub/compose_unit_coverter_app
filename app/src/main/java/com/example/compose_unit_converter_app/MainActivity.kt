package com.example.compose_unit_converter_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.compose_unit_converter_app.ui.theme.Compose_unit_converter_appTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Compose_unit_converter_appTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                   MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen(){
    Column(horizontalAlignment = Alignment.CenterHorizontally) {

Text(text = "Unit Converter App", fontSize = 32.sp)
        OutlinedTextField(value ="",
            onValueChange ={},
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number
            ),
            label = { Text(text = "Enter Temp")},
            singleLine = true
        )
Button(onClick = {}) {
    Text(text = "Convert Now")
}
        Text(text = "The Degree in Celsius", fontSize = 32.sp )


    }

}