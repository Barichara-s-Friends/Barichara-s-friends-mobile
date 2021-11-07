package com.christianrruiz.proyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {

        Thread.sleep(0)

        setTheme(R.style.Theme_Proyecto)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton1=findViewById<Button>(R.id.btn)
        boton1.setOnClickListener {
            val intento1 = Intent(this, MainActivity3::class.java)
            startActivity(intento1)
        }

        val boton1=findViewById<Button>(R.id.imageButton3)
        boton1.setOnClickListener {
            val intento1 = Intent(this, MainActivity2::class.java)
            startActivity(intento1)
        }



//        startActivity(Intent(this, MainActivity2::class.java))




    }

}