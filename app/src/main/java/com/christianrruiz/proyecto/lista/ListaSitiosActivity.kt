package com.christianrruiz.proyecto.lista

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.christianrruiz.proyecto.R
import com.christianrruiz.proyecto.SitiosAdapter
import com.christianrruiz.proyecto.SitiosTuristicos

class ListaSitiosActivity : AppCompatActivity() {

    private lateinit var listaSitiosTuristicos: ArrayList<SitiosTuristicos>
    private lateinit var sitiosAdapter: SitiosAdapter
    private lateinit var sitiosRecyclerView: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_sitios)

        sitiosRecyclerView = findViewById(R.id.Sitios_Turisticos_Barichara)

        listaSitiosTuristicos = createMockSitiosTuristicos()

        sitiosAdapter = SitiosAdapter(listaSitiosTuristicos)

        sitiosRecyclerView.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = sitiosAdapter
            setHasFixedSize(false)

        }

    }

    private fun createMockSitiosTuristicos(): ArrayList<SitiosTuristicos>{

         return arrayListOf(
             SitiosTuristicos(
                nombre = "Cascada de Juli",
                descripcion = "cascada de dos metros",
                puntuacion = "8.0" ,
                foto = ""
             )
         )

    }

}