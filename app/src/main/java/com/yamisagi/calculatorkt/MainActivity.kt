package com.yamisagi.calculatorkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    // İlk olarak bu değişkenleri tanımlıyoruz,
    // Daha sonra bu değişkenleri fonksiyonlarda kullanmak için
    var firstNumber: Int? = null
    var secondNumber: Int? = null
    var result: Int? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sum(view: View) {
        firstNumber = number1.text.toString().toIntOrNull()
        secondNumber = number2.text.toString().toIntOrNull()
        if (firstNumber != null && secondNumber != null) {
            result = firstNumber!! + secondNumber!!
            resultView.text = result.toString()
        } else {
            resultView.text = "Not enough numbers"
        }


    }

    fun min(view: View) {
        firstNumber = number1.text.toString().toIntOrNull()
        secondNumber = number2.text.toString().toIntOrNull()
        if (firstNumber != null && secondNumber != null) {
            result = firstNumber!! - secondNumber!!
            resultView.text = result.toString()
        } else {
            resultView.text = "Not enough numbers"
        }


    }

    fun multiply(view: View) {
        firstNumber = number1.text.toString().toIntOrNull()
        secondNumber = number2.text.toString().toIntOrNull()
        if (firstNumber != null && secondNumber != null) {
            result = firstNumber!! * secondNumber!!
            resultView.text = result.toString()
        } else {
            resultView.text = "Not enough numbers"
        }

    }

    fun divide(view: View) {
        firstNumber = number1.text.toString().toIntOrNull()
        secondNumber = number2.text.toString().toIntOrNull()
        try {
            if (firstNumber != null && secondNumber != null && firstNumber!! < secondNumber!!) {
                resultView.text = "Cannot divide bigger number by smaller number"

            } else if (firstNumber != null && secondNumber != null) {
                result = firstNumber!! / secondNumber!!

                resultView.text = result.toString()

            } else {
                resultView.text = "Not enough numbers"
            }
        } catch (e: ArithmeticException) {
            resultView.text = "Division by zero is not allowed"
        }

    }
}




