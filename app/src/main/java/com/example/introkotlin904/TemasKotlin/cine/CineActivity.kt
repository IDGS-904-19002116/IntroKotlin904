package com.example.introkotlin904.TemasKotlin.cine

import android.os.Bundle
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.introkotlin904.R

class CineActivity : AppCompatActivity() {

    private lateinit var etName: EditText
    private lateinit var etCompradores: EditText
    private lateinit var etTicket: EditText
    private lateinit var radioGroup: RadioGroup
    private lateinit var rdbSi: RadioButton
    private lateinit var rdbNo: RadioButton
    private lateinit var txtTotal: TextView
    private lateinit var txtResultName: TextView
    private lateinit var txtResultBoletos: TextView
    private lateinit var txtResultCompradores: TextView
    private var txtCard: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cine)

        etName = findViewById<EditText>(R.id.etName)
        etCompradores = findViewById<EditText>(R.id.etCompradores)
        etTicket = findViewById<EditText>(R.id.etTicket)
        txtTotal = findViewById<TextView>(R.id.txtTotal)
        radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        txtResultName = findViewById<TextView>(R.id.txtResultName)
        txtResultBoletos = findViewById<TextView>(R.id.txtResultBoletos)
        txtResultCompradores = findViewById<TextView>(R.id.txtoResultCompradores)
        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            txtCard = checkedId == R.id.rdbSi
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets


        }
    }

    fun calcularTotal(view: android.view.View) {
        val nombre = etName.text.toString()
        val compradores = etCompradores.text.toString().toInt()
        val ticket = etTicket.text.toString().toInt()
        var precio_boleto = 12000.0
        var max_boletos = compradores * 7
        var total_boletos = 0
        var precio_total = 0.0


            if (ticket > max_boletos) {
                Toast.makeText(this, "No puedes comprar más de $max_boletos boletos", Toast.LENGTH_LONG).show()
            return
            }
            else{
                total_boletos = ticket
                precio_total = precio_boleto * total_boletos
                if (total_boletos >=6) {
                    precio_total = precio_total - (precio_total * 0.15)
                }
                else if (total_boletos >=3) {
                    precio_total = precio_total - (precio_total * 0.10)
                }
                else {
                    precio_total
                }
            }
            if (txtCard) {
                precio_total = precio_total - (precio_total * 0.10)
            }


        txtTotal.text = "TOTAL: $${precio_total}"
        txtResultName.text = "Nombre: ${nombre}"
        txtResultBoletos.text = "Total de boletos: ${total_boletos}"
        txtResultCompradores.text = "Compradores: ${compradores}"
    }
}