package com.example.introkotlin904.TemasKotlin.tema1App

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.introkotlin904.R

class Ejemplo2Activity : AppCompatActivity() {

    private lateinit var sum1: EditText
    private lateinit var sum2: EditText
    private lateinit var resultadoTxt: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ejemplo2)

        sum1 = findViewById<EditText>(R.id.sum1)
        sum2 = findViewById<EditText>(R.id.sum2)
        resultadoTxt = findViewById<TextView>(R.id.resultadoTxt)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun sumar (view: View){

        var n1 = sum1.text.toString().toInt()
        var n2 = sum2.text.toString().toInt()
        var suma = 0

        for (i in 1 .. n2){
            suma += n1

        }
        resultadoTxt.text = "$suma"
    }

}