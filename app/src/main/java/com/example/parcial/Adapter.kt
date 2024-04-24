package com.example.parcial

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class Adapter(val context: Context) : ListAdapter<Paises, Adapter.ViewHolder>(DiffCallBack) {

    lateinit var onItemClickListener: (Paises) -> Unit

    inner class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val nombrePais: TextView = view.findViewById(R.id.item_nombre)
        val banderaPais: ImageView = view.findViewById(R.id.item_img)
        val capitalPais: TextView = view.findViewById(R.id.item_capital)
        val poblacionPais: TextView = view.findViewById(R.id.item_poblacion)
        val continentePais: TextView = view.findViewById(R.id.item_continente)
        val paisajePais: ImageView = view.findViewById(R.id.item_paisaje)


        fun bind (pais: Paises) {
            nombrePais.text = pais.nombre
            //capitalPais.text = pais.capital
            poblacionPais.text = pais.poblacion.toString()
            //continentePais.text = pais.continente

            Glide.with(context).load(pais.paisaje).into(paisajePais)

            val image = when(pais.BanderaDeclarada) {
                Bandera.PARGENTINA -> R.drawable.argentina
                Bandera.PALEMANIA -> R.drawable.alemania
                Bandera.PCHINA -> R.drawable.china
                Bandera.PGRECIA -> R.drawable.grecia
                Bandera.PITALIA -> R.drawable.italia
                Bandera.PFRANCIA -> R.drawable.francia
                else -> R.drawable.mexico
            }

            banderaPais.setImageResource(image)

            view.setOnClickListener() {
                onItemClickListener(pais)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.ViewHolder {
        val view: View = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: Adapter.ViewHolder, position: Int) {
        val paises = getItem(position)
        holder.bind(paises)
    }

    companion object DiffCallBack : DiffUtil.ItemCallback<Paises>() {
        override fun areItemsTheSame(oldItem: Paises, newItem: Paises): Boolean {
            return  oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Paises, newItem: Paises): Boolean {
            return oldItem == newItem
        }
    }
}