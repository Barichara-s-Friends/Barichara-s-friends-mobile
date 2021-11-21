package com.christianrruiz.proyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main8)

        val btn1 = findViewById<ImageButton>(R.id.imageButton6)
        btn1.setOnClickListener {
            val intent9 = Intent(this, MainActivity8::class.java)
            startActivity(intent9)
        }

        val btn = findViewById<ImageButton>(R.id.imageButton6)
        btn.setOnClickListener {
            val intent8 = Intent(this, MainActivity2::class.java)
            startActivity(intent8)
        }

        val salir = findViewById<ImageButton>(R.id.imageButton2)
        salir.setOnClickListener {
            val intent5 = Intent(this, MainActivity3::class.java)
            startActivity(intent5)
        }

        val botonsalir = findViewById<ImageButton>(R.id.imageButton4)
        botonsalir.setOnClickListener {
            val intent3 = Intent(this, MainActivity::class.java)
            startActivity(intent3)
        }
    }
}