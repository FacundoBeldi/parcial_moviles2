package com.example.parcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recView: RecyclerView
    private lateinit var adapter: Adapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recView= findViewById(R.id.Rec_Paises)
        recView.layoutManager=LinearLayoutManager(this)
        val dataSet = getListadoPaises()
        adapter=Adapter(applicationContext)
        recView.adapter=adapter
        adapter.submitList(dataSet)
        adapter.onItemClickListener = {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("nombre", it.nombre)
            intent.putExtra("capital", it.capital)
            intent.putExtra("paisaje", it.paisaje)
            intent.putExtra("continente", it.continente)
            startActivity(intent)
        }
    }

    private fun getListadoPaises(): MutableList<Paises>? {
        return mutableListOf(
            Paises(1, Bandera.PARGENTINA,"Argentina","CABA",46230000,"America","https://www.clarin.com/2022/02/18/A8PHLMvr9_720x0__1.jpg"),
            Paises(2, Bandera.PALEMANIA,"Alemania","Berlin",83800000,"Europa","https://blog.pangea.es/wp-content/uploads/2021/09/ecoturismo-alemania-Berchtesgaden.jpg"),
            Paises(3, Bandera.PCHINA,"China","Pekin",1412000000,"Asia","https://previews.123rf.com/images/yuhongspace/yuhongspace1706/yuhongspace170600198/79608521-pek%C3%ADn-paisaje-arquitect%C3%B3nico-urbano.jpg"),
            Paises(4, Bandera.PGRECIA,"Grecia","Atenas",10430000,"Europa","https://i.pinimg.com/236x/7a/98/b5/7a98b5948bd589e4904f390d429f6312.jpg"),
            Paises(5, Bandera.PITALIA,"Italia","Roma",58940000,"Europa","https://img.freepik.com/fotos-premium/paisaje-serie-italia_287743-526.jpg"),
            Paises(6, Bandera.PFRANCIA,"Francia","Paris",67970000,"Europa","https://humanidades.com/wp-content/uploads/2018/09/francia-3-800x414.jpg"),
            Paises(7, Bandera.PMEXICO,"Mexico","Mexico",127500000,"America","https://blog.vivaaerobus.com/wp-content/uploads/2020/04/paisajes-de-mexico.jpg"),
            Paises(8, Bandera.PFRANCIA,"Francia","Paris",67970000,"Europa","https://humanidades.com/wp-content/uploads/2018/09/francia-3-800x414.jpg"),
            Paises(9, Bandera.PFRANCIA,"Francia","Paris",67970000,"Europa","https://humanidades.com/wp-content/uploads/2018/09/francia-3-800x414.jpg"),
            Paises(10, Bandera.PFRANCIA,"Francia","Paris",67970000,"Europa","https://humanidades.com/wp-content/uploads/2018/09/francia-3-800x414.jpg"),
            Paises(11, Bandera.PFRANCIA,"Francia","Paris",67970000,"Europa","https://humanidades.com/wp-content/uploads/2018/09/francia-3-800x414.jpg"),
            Paises(12, Bandera.PFRANCIA,"Francia","Paris",67970000,"Europa","https://humanidades.com/wp-content/uploads/2018/09/francia-3-800x414.jpg"),
            Paises(13, Bandera.PFRANCIA,"Francia","Paris",67970000,"Europa","https://humanidades.com/wp-content/uploads/2018/09/francia-3-800x414.jpg"),
            Paises(14, Bandera.PFRANCIA,"Francia","Paris",67970000,"Europa","https://humanidades.com/wp-content/uploads/2018/09/francia-3-800x414.jpg"),
            Paises(15, Bandera.PFRANCIA,"Francia","Paris",67970000,"Europa","https://humanidades.com/wp-content/uploads/2018/09/francia-3-800x414.jpg"),
            Paises(16, Bandera.PFRANCIA,"Francia","Paris",67970000,"Europa","https://humanidades.com/wp-content/uploads/2018/09/francia-3-800x414.jpg"),
            Paises(17, Bandera.PFRANCIA,"Francia","Paris",67970000,"Europa","https://humanidades.com/wp-content/uploads/2018/09/francia-3-800x414.jpg"),
            Paises(18, Bandera.PFRANCIA,"Francia","Paris",67970000,"Europa","https://humanidades.com/wp-content/uploads/2018/09/francia-3-800x414.jpg"),
            Paises(19, Bandera.PFRANCIA,"Francia","Paris",67970000,"Europa","https://humanidades.com/wp-content/uploads/2018/09/francia-3-800x414.jpg"),
            Paises(20, Bandera.PFRANCIA,"Francia","Paris",67970000,"Europa","https://humanidades.com/wp-content/uploads/2018/09/francia-3-800x414.jpg"),
            )
    }
}