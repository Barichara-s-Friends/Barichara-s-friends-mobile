package com.christianrruiz.barichara.list

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.christianrruiz.barichara.databinding.FragmentListBinding
import com.christianrruiz.barichara.model.PoiItem
import com.christianrruiz.barichara.model.Sitios
import com.google.gson.Gson

class ListFragment : Fragment() {

    private lateinit var listBinding: FragmentListBinding
    private lateinit var poi: PoiAdapter
    private lateinit var listPoi: ArrayList<PoiItem>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        listBinding = FragmentListBinding.inflate(inflater, container, false)

        return listBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        listPoi = loadMockPoiDesdeJson()
        poi = PoiAdapter(listPoi, onItemClicked = {onPoiClicked(it) })

    }

    private fun onPoiClicked(poi: PoiItem) {
        //TODO
    }


    private fun loadMockPoiDesdeJson(): ArrayList<PoiItem> {
        val poiString: String = context?.assets?.open("poi.json")?.bufferedReader().use { it!!.readText() }//TODO OJO
        val gson = Gson()
        val poiList = gson.fromJson(poiString, Sitios::class.java)
        return poiList
    }



}