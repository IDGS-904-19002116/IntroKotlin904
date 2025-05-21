package com.example.introkotlin904

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.introkotlin904.TemasKotlin.cine.CineActivity
import com.example.introkotlin904.TemasKotlin.tema1App.Ejemplo1Activity
import com.example.introkotlin904.TemasKotlin.tema2App.Ejemplo3Activity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)

        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        val btn3 = findViewById<Button>(R.id.btn3)

        btn1.setOnClickListener { navegateToEjemplo1() }
        btn2.setOnClickListener { navegateToCine() }
        btn3.setOnClickListener { navegateToEjemplo3() }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
        private fun navegateToEjemplo1() {
            val intent = Intent(this, Ejemplo1Activity::class.java)
            startActivity(intent)

        }

        private fun navegateToCine() {
            val intent = Intent(this, CineActivity::class.java)
            startActivity(intent)
        }

        private fun navegateToEjemplo3() {
            val intent = Intent(this, Ejemplo3Activity::class.java)
            startActivity(intent)
        }

}