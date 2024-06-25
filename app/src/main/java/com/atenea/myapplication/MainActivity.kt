package com.atenea.myapplication

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var numero1 = (0..9).random()
        var numero2 = (0..9).random()

        val btn_izquierdo = findViewById<Button>(R.id.btn_derecho)
        val btn_derecho = findViewById<Button>(R.id.btn_derecho)

        btn_izquierdo.text = numero1.toString()
        btn_derecho.text = numero2.toString()

    }

    fun validarIzquierdo(view: View) {
        val btn_izquierdo = findViewById<Button>(R.id.btn_derecho)
        val btn_derecho = findViewById<Button>(R.id.btn_derecho)

        var numero1 = btn_izquierdo.text
        var numero2 = btn_derecho.text

        if (Interger.parseInt(numero1.toString()) > Interger.parseInt(numero2.toString())) {
            btn_izquierdo.setBackgroundColor(Color.GREEN)
        } else {
            btn_izquierdo.setBackgroundColor(Color.RED)
        }
    }
}