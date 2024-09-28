package com.example.compose_unit_converter_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.compose_unit_converter_app.ui.theme.Compose_unit_converter_appTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Compose_unit_converter_appTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    var viewModel : MyViewModel = MyViewModel()
                    MainScreen(viewModel)
                }
            }
        }
    }
}

@Composable
fun MainScreen(myViewModel: MyViewModel ) {
//fun MainScreen(myViewModel: MyViewModel = viewModel()) {
    var inputTemp by remember {
        mutableStateOf("0")
    }
    Column(horizontalAlignment = Alignment.CenterHorizontally) {

        Text(text = "Unit Converter App", fontSize = 32.sp)
        OutlinedTextField(
            value = inputTemp,
            onValueChange = {
                enteredTemp : String -> inputTemp = enteredTemp
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number
            ),
            label = { Text(text = "Enter Temp") },
            singleLine = true
        )
        Button(onClick = {
            myViewModel.convertTemp(inputTemp)
        }) {
            Text(text = "Convert Now")
        }
        Text(text = "The Degree in Celsius : \n ${myViewModel.tempC}", fontSize = 32.sp)


    }

}