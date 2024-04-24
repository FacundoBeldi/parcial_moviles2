package com.example.parcial

data class Paises(
    val id: Int,
    val BanderaDeclarada: Bandera,
    val nombre: String,
    val capital: String,
    val poblacion: Int,
    val continente: String,
    val paisaje: String
)
enum class Bandera{
    PALEMANIA,PARGENTINA, PCHINA, PFRANCIA,PGRECIA, PITALIA, PMEXICO
}