package com.christianrruiz.proyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.HorizontalScrollView
import android.widget.ImageButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivityBioparque:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_bioparque)


        val btn = findViewById<ImageButton>(R.id.imageButton6)
        btn.setOnClickListener {
            val intent8 = Intent(this, MainActivityBioparque::class.java)
            startActivity(intent8)

        }

        val salir = findViewById<ImageButton>(R.id.imageButton2)
        salir.setOnClickListener {
            val intent5 = Intent(this, MainActivityBioparque::class.java)
            startActivity(intent5)
        }

        val botonsalir = findViewById<ImageButton>(R.id.imageButton4)
        botonsalir.setOnClickListener {
            val intent3 = Intent(this, MainActivityBioparque::class.java)
            startActivity(intent3)

            val intento = Intent(this, MainActivityBioparque::class.java)
            startActivity(intento)
        }
    }
}
