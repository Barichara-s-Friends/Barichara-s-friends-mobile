package com.christianrruiz.proyecto.lista

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.christianrruiz.proyecto.R
import com.christianrruiz.proyecto.detalle.DetalleActivity
import com.christianrruiz.proyecto.modelo.Sitios
import com.christianrruiz.proyecto.modelo.PoiItem
import com.google.gson.Gson

class ListPoiActivity : AppCompatActivity() {

    private lateinit var listPoi: ArrayList<PoiItem>
    private lateinit var poiAdapter: PoiAdapter
    private lateinit var poiRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_poi)

        poiRecyclerView = findViewById(R.id.poi_recycler_view)

        //       listPois = createMockPoi()
        listPoi = loadMockPoiDesdeJson()
        poiAdapter = PoiAdapter(listPoi, onItemClicked = {onPoiClicked(it) })

        poiRecyclerView.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = poiAdapter
            setHasFixedSize(false)
        }
    }



    private fun onPoiClicked(poi: PoiItem) {
        Log.d("nombre", poi.nombre)
        val intent = Intent(this, DetalleActivity::class.java)
        intent.putExtra("poi",poi)
        startActivity(intent)

    }

    private fun loadMockPoiDesdeJson(): ArrayList<PoiItem> {
        val poiString: String = applicationContext.assets.open("poi.json").bufferedReader().use { it.readText() }
        val gson = Gson()
        val poiList = gson.fromJson(poiString, Sitios::class.java)
        return poiList
    }

}