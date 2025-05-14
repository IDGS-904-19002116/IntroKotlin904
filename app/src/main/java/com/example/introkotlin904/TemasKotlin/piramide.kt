package com.example.introkotlin904.TemasKotlin

fun main() {

    var opcion: Int
    do{
        println("Ingrese un numero")
        var numero = readln().toInt()
        println("Piramide")
        var i = 1

        do{
            var j = 1

            do{
                print("*")
                j++
            }while (j <= i)

           println()

            i++
        }while ( i <= numero)
        println("1.Ingresar otro numero\n2.Salir")
        opcion = readln().toInt()
    }while (opcion != 2)
}
