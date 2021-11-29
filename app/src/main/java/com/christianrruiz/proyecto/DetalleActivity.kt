package com.christianrruiz.proyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.christianrruiz.proyecto.model.MainActivity2

class DetalleActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {

        Thread.sleep(0)

        setTheme(R.style.Theme_Proyecto)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton1=findViewById<Button>(R.id.btn)
        boton1.setOnClickListener {
            val intento1 = Intent(this, MainActivity2::class.java)
            startActivity(intento1)
        }

        val intento = Intent(this, MainActivity2::class.java)
        startActivity(intento)







//        startActivity(Intent(this, MainActivity2::class.java))




    }

}