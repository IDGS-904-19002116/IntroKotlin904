package com.example.introkotlin904.TemasKotlin

/*
    List
    Mutablelist
    Set
    MutableSet
    Map
    MitableMap
*/
fun main(){
    val readOnlyFiguras = listOf("cuadrado","triangulo","circulo")
        println(readOnlyFiguras)
    println(" La primer figura es ${readOnlyFiguras[0]}")
    println(" El primer elemento es ${readOnlyFiguras.first()}")
    println("Número de elementos ${readOnlyFiguras.count()} items")
    println("Circulo" in readOnlyFiguras)
    println(readOnlyFiguras)
    //readOnlyFiguras.add("pentagono")



    val figura: MutableList<String> = mutableListOf("cuadrado2","triangulo2","circulo2")
    println(figura)
    figura.add("pentagono2")
    println(figura)
    figura.remove("cuadrado2")
    println(figura)

    val mutableFiguras = mutableListOf("cuadrado","triangulo","circulo")
    val frutas = setOf("manzana", "bananas", "naranja")
    val frutas2 = mutableSetOf("manzana", "bananas", "naranja")
    val coches = mapOf("uno" to 1, "dos" to 2, "tres" to 3)
    val coches2 = mutableMapOf("uno" to 1, "dos" to 2, "tres" to 3)
    println(coches2)
}