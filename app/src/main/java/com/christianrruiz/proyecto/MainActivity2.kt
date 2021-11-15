package com.christianrruiz.proyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

//        val boton30=findViewById<ImageButton>(R.id.imageButton3)
//        boton30.setOnClickListener {
//            val intent = Intent(this, MainActivity5::class.java)
//            startActivity(intent)
//        }

 //       val boton6 =findViewById<ImageButton>(R.id.imageButton6)
 //       boton6.setOnContextClickListener { val intent = Intent(this, MainActivity::class.java)
 //           startActivity(intent)}

        val btn = findViewById<ImageButton>(R.id.imageButton8)
        btn.setOnClickListener {
            val intent8 = Intent(this, MainActivity7::class.java)
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