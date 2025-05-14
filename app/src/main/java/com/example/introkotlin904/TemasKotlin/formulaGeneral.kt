package com.example.introkotlin904.TemasKotlin

fun main (){
    var opcion: Int
    println("Formula general")
    do{


    do {
        println("Ingrese los valores para a, b y c")
        println("a =")
        var a = readln().toDouble()
        println("b =")
        var b = readln().toDouble()
        println("c =")
        var c = readln().toDouble()

        var num1 = -b
        println(num1)
        var num2 = b*b
        println(num2)
        var num3 = (-4) * (a) * (c)
        println(num3)
        var num4 = (2 * a)
        println(num4)
        var num5 = num2 + num3
        println(num5)
        var num6 = Math.sqrt(num5)
        println(num6)

        if (num5 == -num5){
            println("no puede haber raices negativas")
        }
        if (num4 == 0.0){
            print("No se puede dividir entre 0")
        }

        var x1 = (num1 + num6) / num4
        var x2 = (num1 - num6) / num4



        println("Los resultados son:\n1.- X 1 = ${x1}\n2.- X 2 = ${x2}")
    } while (x1 != x1)
    println("1.- Formula\n2.- Salir")
        opcion = readln().toInt()
    } while(opcion != 2)

}