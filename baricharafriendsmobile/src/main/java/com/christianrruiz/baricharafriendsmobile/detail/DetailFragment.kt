package com.christianrruiz.baricharafriendsmobile.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.christianrruiz.baricharafriendsmobile.databinding.FragmentDetalleBinding
import com.squareup.picasso.Picasso

class DetailFragment : Fragment() {

    private lateinit var detailBinding: FragmentDetalleBinding
    private val args: DetailFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        detailBinding =FragmentDetalleBinding.inflate(inflater, container, false)

        return detailBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val poi = args.poi

        with(detailBinding) {
            nombreTextView.text = poi.nombre
            descripcionTextView.text = poi.descripcion
            Picasso.get().load(poi.urlFoto).into(pictImageView)
            calificacionTextView.text = poi.calificacion.toString()

        }

    }

}