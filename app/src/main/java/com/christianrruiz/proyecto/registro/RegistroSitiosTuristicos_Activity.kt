package com.christianrruiz.proyecto.registro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import com.christianrruiz.proyecto.DetalleActivity
import com.christianrruiz.proyecto.R
import com.christianrruiz.proyecto.SitiosTuristicos

class RegistroSitiosTuristicos_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_sitios_turisticos)

        val sendButton : Button = findViewById(R.id.send_button)
        val nombreEditText: EditText = findViewById(R.id.nombre_edit_text)
        val descripcionTextView: TextView = findViewById(R.id.Descripcion_text_view)
        val puntuacionTextView: TextView = findViewById(R.id.puntuacion_text_view)
        val fotoImageView: ImageView = findViewById(R.id.foto_image_view)


        sendButton.setOnClickListener {

            if (nombreEditText.text.isEmpty() || descripcionTextView.text.isEmpty() || puntuacionTextView.text.isEmpty())
                Toast.makeText(this,"Debe digitar todos los campos con * son obligatorios", Toast.LENGTH_SHORT).show()

            val nombre = nombreEditText.text.toString()
            val descripcion = descripcionTextView.text.toString()
            val puntuacion = puntuacionTextView.text.toString()
            val foto = fotoImagenView.image.toString()

            val SitiosTuristicos = SitiosTuristicos(nombre, descripcion, puntuacion, foto )


            val intent = Intent(this, DetalleActivity::class.java)
            intent.putExtra("nombre",nombre)
            startActivity(intent)





        }



    }
}