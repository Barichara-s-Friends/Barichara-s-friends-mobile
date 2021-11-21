package com.christianrruiz.proyecto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson

class ListPoiActivity : AppCompatActivity() {



    private lateinit var listPoi: ArrayList<SitiosItem>
    private lateinit var poiAdapter: PoiAdapter
    private lateinit var poiRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_poi)

        poiRecyclerView = findViewById(R.id.poi_recycler_view)

 //       listPois = createMockPoi()
        listPoi = loadMockPoiDesdeJson()
        poiAdapter = PoiAdapter(listPoi)

        poiRecyclerView.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = poiAdapter
            setHasFixedSize(false)

        }
    }

    private fun loadMockPoiDesdeJson(): ArrayList<SitiosItem> {
        val poiString: String = applicationContext.assets.open("poi.json").bufferedReader().use { it.readText() }
        val gson = Gson()
        val poiList = gson.fromJson(poiString, Sitios::class.java)
        return poiList
    }


}