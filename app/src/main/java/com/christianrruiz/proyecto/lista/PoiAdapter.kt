package com.christianrruiz.proyecto.lista

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.christianrruiz.proyecto.R
import com.christianrruiz.proyecto.modelo.PoiItem
import com.squareup.picasso.Picasso


class PoiAdapter(
    private val poiList: ArrayList<PoiItem>,
    private val onItemClicked: (PoiItem) -> Unit
) : RecyclerView.Adapter<PoiAdapter.PoiViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PoiViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_view_poi_item, parent, false)
        return PoiViewHolder(view)
    }

    override fun onBindViewHolder(holder: PoiViewHolder, position: Int) {
        val poi = poiList[position]
        holder.itemView.setOnClickListener { onItemClicked(poiList[position]) }
        holder.bind(poi)
    }

    override fun getItemCount(): Int = poiList.size

    class PoiViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){

            private var nombreTextView: TextView = itemView.findViewById(R.id.nombre_card_text_view)
            private var descripcionTextView: TextView = itemView.findViewById(R.id.descripcion_card_text_view)
            private var calificacionTextView: TextView = itemView.findViewById(R.id.calificacion_card_text_view)
            private var imagenImageView: ImageView = itemView.findViewById(R.id.imagen_card_image_view)

            fun bind(poi: PoiItem){
                nombreTextView.text = poi.nombre
                descripcionTextView.text = poi.descripcion
                calificacionTextView.text = poi.calificacion.toString()
                Picasso.get().load(poi.urlFoto).into(imagenImageView);

            }
        }
}