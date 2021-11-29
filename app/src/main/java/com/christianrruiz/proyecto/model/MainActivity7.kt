package com.christianrruiz.proyecto.model

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.christianrruiz.proyecto.DetalleActivity
import com.christianrruiz.proyecto.R

class MainActivity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)

        val btn = findViewById<ImageButton>(R.id.imageButton7)
        btn.setOnClickListener {
            val intent = Intent(this, MainActivity8::class.java)
            startActivity(intent)
        }

        val salir = findViewById<ImageButton>(R.id.imageButton2)
        salir.setOnClickListener {
            val intent5 = Intent(this, MainActivity3::class.java)
            startActivity(intent5)
        }

        val botonsalir = findViewById<ImageButton>(R.id.imageButton4)
        botonsalir.setOnClickListener {
            val intent3 = Intent(this, DetalleActivity::class.java)
            startActivity(intent3)
        }


    }
}