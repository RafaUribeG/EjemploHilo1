package com.example.ejemplohilo1.cinterfaces

fun main(){

    var peli = HiloPropioPRU2("La Máscara")
    var peli2 = HiloPropioPRU2("SpiderMan")
    var peli3 = HiloPropioPRU2("El lobo de Wall Street")
    var peli4 = HiloPropioPRU2("Bastardos sin Gloria")
    var peli5 = HiloPropioPRU2("Batman: The Dark Knight")

    peli.descargarPelicula(object :ListenerDescarga{
        override fun descargaFinalizada() {
            println("Película ${peli.pelicula} descargada")
            println("Play a la película ${peli.pelicula}")
        }
    })

    peli2.descargarPelicula(object :ListenerDescarga{
        override fun descargaFinalizada() {
            println("Película ${peli2.pelicula} descargada")
            println("Play a la película ${peli2.pelicula}")
        }
    })

    peli3.descargarPelicula(object :ListenerDescarga{
        override fun descargaFinalizada() {
            println("Película ${peli3.pelicula} descargada")
            println("Play a la película ${peli3.pelicula}")
        }
    })

    peli4.descargarPelicula(object :ListenerDescarga{
        override fun descargaFinalizada() {
            println("Película ${peli4.pelicula} descargada")
            println("Play a la película ${peli4.pelicula}")
        }
    })

    peli5.descargarPelicula(object :ListenerDescarga{
        override fun descargaFinalizada() {
            println("Película ${peli5.pelicula} descargada")
            println("Play a la película ${peli5.pelicula}")
        }
    })

}