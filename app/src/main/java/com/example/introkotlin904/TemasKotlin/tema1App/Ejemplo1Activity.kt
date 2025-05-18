package com.example.introkotlin904.TemasKotlin.tema1App

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.introkotlin904.R.*

class Ejemplo1Activity : AppCompatActivity() {

    private lateinit var et1: EditText
    private lateinit var et2: EditText
    private lateinit var txtResult: TextView
    private lateinit var rdbSuma: RadioButton
    private lateinit var rdbResta: RadioButton
    private lateinit var rdbM: RadioButton
    private lateinit var rdbDivision: RadioButton



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(layout.activity_ejemplo1)

         et1 = findViewById<EditText>(id.et1)
         et2 = findViewById<EditText>(id.et2)
         rdbSuma = findViewById<RadioButton>(id.rdbSuma)
        rdbResta = findViewById<RadioButton>(id.rdbResta)
        rdbM = findViewById<RadioButton>(id.rdbM)
        rdbDivision = findViewById<RadioButton>(id.rdbDivision)
         txtResult = findViewById<TextView>(id.txtResult)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun calculador (view: View){

        val num1 = et1.text.toString().toDouble()
        val num2 = et2.text.toString().toDouble()

        val resultado = when {
            rdbSuma.isChecked -> num1 + num2
            rdbResta.isChecked -> num1 - num2
            rdbM.isChecked -> num1 * num2
            rdbDivision.isChecked -> num1 / num2
            else -> {
                println("Ingrese un número válido")
            }
    }

    txtResult.text = "$resultado"

    }
}