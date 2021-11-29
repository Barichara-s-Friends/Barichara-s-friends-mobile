package com.christianrruiz.proyecto.model

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.christianrruiz.proyecto.databinding.ActivitySaltoDelMicoMain13Binding


class MainActivity13 : AppCompatActivity() {

    private lateinit var detalleMain13Binding: ActivitySaltoDelMicoMain13Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detalleMain13Binding = ActivitySaltoDelMicoMain13Binding.inflate(layaotInflater)

        val name = intent.extras?.getString("salto_del_mico")
        detalleMain13Binding.nameTextView.text = name

    }
}