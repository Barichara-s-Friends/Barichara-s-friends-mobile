package com.christianrruiz.baricharafriendsmobile.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.christianrruiz.baricharafriendsmobile.R
import com.christianrruiz.baricharafriendsmobile.databinding.FragmentListaBinding
import com.christianrruiz.baricharafriendsmobile.modelo.PoiItem
import com.christianrruiz.baricharafriendsmobile.modelo.Sitios
import com.google.gson.Gson

class ListaFragment : Fragment() {

    private lateinit var listBinding: FragmentListaBinding
    private lateinit var poiAdapter: PoiAdapter
    private lateinit var listPoi: ArrayList<PoiItem>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        listBinding = FragmentListaBinding.inflate(inflater, container, false)
        return listBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        listPoi = loadMockPoiDesdeJson()
        poiAdapter = PoiAdapter(listPoi, onItemClicked = {onPoiClicked(it)})

        listBinding.poiRecyclerView.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = poiAdapter
            setHasFixedSize(false)
        }

    }

    private fun onPoiClicked(poi: PoiItem) {
        findNavController().navigate(ListaFragmentDirections.actionListaFragmentToDetailFragment(poi = poi))
       findNavController().navigate(ListaFragmentDirections.actionListaFragmentToSettingsFragment())
    }

    private fun loadMockPoiDesdeJson(): ArrayList<PoiItem> {
        val poiString: String = context?.assets?.open("poi.json")?.bufferedReader().use { it!!.readText() }
        val gson = Gson()
        val poiList = gson.fromJson(poiString, Sitios::class.java)
        return poiList
    }



}