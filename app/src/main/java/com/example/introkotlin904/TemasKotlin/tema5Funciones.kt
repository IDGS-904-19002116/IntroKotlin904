package com.example.introkotlin904.TemasKotlin

fun saludo (){
    println("Hola mundo")
}

fun suma(a: Int, b: Int) {
    println("la suma de $a + $b es ${a+b}")
}

fun resta(a:Int, b:Int) = a-b //Función de una línea


fun main(){
    saludo()
    suma(2,3)
    println("la resta de 2-3 es ${resta(2,3)}")
}


// 1.- Realizar operaciones básicas y que muestre un menú, calculadora sencilla.. con salir.
// 2.- Realizar una pirámide de asteriscos
/*
n= 5
*
**
***
****
*****
// dame un número
// hasta que ponga = a 0 sale del programa, pero sólo utilizando do/while

* */

// 3.- Realizar calcular la formula general
// a = b = c
// No puede haber raices negativas y divisiones entre 0

