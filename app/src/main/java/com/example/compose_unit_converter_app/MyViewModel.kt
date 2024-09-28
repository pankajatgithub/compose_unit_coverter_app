package com.example.compose_unit_converter_app

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import kotlin.math.roundToInt

class MyViewModel : ViewModel() {
    var tempC by mutableStateOf(0)
    fun convertTemp(tempF:String){
var tempFnum = tempF.toInt()
        tempC = ((tempFnum-32) * 0.5556).roundToInt()
    }

}