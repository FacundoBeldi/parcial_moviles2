package com.example.parcial

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class DetailActivity : AppCompatActivity() {
    lateinit var textViewNombre: TextView
    lateinit var textViewCapital: TextView
    lateinit var textViewContinente : TextView
    lateinit var url: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val bundle = intent.extras

        val nombre = bundle?.getString("nombre")
        val capital = bundle?.getString("capital")
        val paisaje = bundle?.getString("paisaje")
        val continente = bundle?.getString("continente")

        textViewNombre = findViewById(R.id.textViewNombrePais)
        textViewCapital = findViewById(R.id.textViewNombreCapital)
        textViewContinente = findViewById(R.id.textViewNombreContinente)
        url = findViewById(R.id.imageViewUrl)

        textViewNombre.text = nombre
        textViewCapital.text = capital
        textViewContinente.text = continente
        Glide.with(applicationContext).load(paisaje).into(url)
    }
}