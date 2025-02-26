package com.example.bodymassindex.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import java.text.DecimalFormat

class BmiViewModel : ViewModel() {

    var heightInput by mutableStateOf("")
    var weightInput by mutableStateOf("")

    private val height: Float
        get() {
            return heightInput.toFloatOrNull() ?: 0.0f
        }

    private val weight: Float
        get() {
            return weightInput.toFloatOrNull() ?: 0.0f
        }

    val bmi: String
        get() {
            return if (height > 0 && weight > 0) {
                val formatter = DecimalFormat("0.00")
                formatter.format(weight / (height * height))
            } else {
                "0.0"
            }
        }

    fun onHeightChange(newHeight: String) {
        heightInput = newHeight
    }

    fun onWeightChange(newWeight: String) {
        weightInput = newWeight
    }
}
