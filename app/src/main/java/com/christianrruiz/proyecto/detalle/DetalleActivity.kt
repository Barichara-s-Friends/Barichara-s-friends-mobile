package com.christianrruiz.proyecto.detalle

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.christianrruiz.proyecto.databinding.ActivityDetalleBinding
import com.christianrruiz.proyecto.modelo.PoiItem
import com.squareup.picasso.Picasso

class DetalleActivity : AppCompatActivity() {


    private lateinit var detailBinding: ActivityDetalleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailBinding = ActivityDetalleBinding.inflate(layoutInflater)
        setContentView(detailBinding.root)

        val poi: PoiItem? = intent.extras?.getSerializable("poi") as PoiItem
        if (poi != null) {
            with(detailBinding) {
                nombreTextView.text = poi.nombre
                descripcionTextView.text = poi.descripcion
                Picasso.get().load(poi.urlFoto).into(pictImageView)
                calificacionTextView.text = poi.calificacion.toString()

            }

        }
//        detalleBinding.nombreTextView.text = nombre


//        val boton30=findViewById<ImageButton>(R.id.imageButton3)
//        boton30.setOnClickListener {
//            val intent = Intent(this, MainActivity5::class.java)
//            startActivity(intent)
//        }

 //       val boton6 =findViewById<ImageButton>(R.id.imageButton6)
 //       boton6.setOnContextClickListener { val intent = Intent(this, MainActivity::class.java)
 //           startActivity(intent)}

/*        val btn = findViewById<ImageButton>(R.id.imageButton6)
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
*/


    }



}