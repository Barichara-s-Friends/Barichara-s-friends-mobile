package com.christianrruiz.proyecto


import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android .widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class SitiosAdapter(
    private val listaSitiosTuristicos: ArrayList<SitiosTuristicos>
) : RecyclerView.Adapter<SitiosAdapter.SitiosTuristicosViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SitiosTuristicosViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_sitios_view_item, parent, false)
        return SitiosTuristicosViewHolder(view)

    }

    override fun onBindViewHolder(holder: SitiosTuristicosViewHolder, position: Int) {
        val SitiosTuristicos = listaSitiosTuristicos[position]
        holder.bind(SitiosTuristicos)

    }

    override fun getItemCount(): Int = listaSitiosTuristicos.size


    class SitiosTuristicosViewHolder(View: View) : RecyclerView.ViewHolder(View) {

        private var nameTextView: TextView = itemView.findViewById(R.id.nombre_edit_text)
        private var descripcionTextView: TextView =
            itemView.findViewById(R.id.Descripcion_text_view)
        private var puntajeTextView: TextView = itemView.findViewById(R.id.puntuacion_text_view)
        private var fotoImageView: ImageView = itemView.findViewById(R.id.foto_image_view)

        fun bind(sitiosTuristicos: SitiosTuristicos) {
            Log.d("nombre", sitiosTuristicos.nombre)
            nameTextView.text = sitiosTuristicos.nombre
            descripcionTextView.text = sitiosTuristicos.descripcion
            puntajeTextView.text = sitiosTuristicos.puntuacion
            // fotoImageView.imageAlpha = sitiosTuristicos.foto
        }

    }

}


