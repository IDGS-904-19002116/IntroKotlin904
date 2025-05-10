package com.example.introkotlin904.TemasKotlin


// Operaciones básicas

fun main() {
    println("Operaciones Básicas")
   while (true){
       println("Elija lo que desea realizar")
       println("1.- Sumar")
       println("2.- Restar")
       println("3.- Multiplicar")
       println("4.- Dividir")
       println("5.- Salir")

       var num = readln().toInt()
       if (num == 5) {
           println("Saliendo...")
           break
       }else {
           println("Introduce el primer numero")
           var num1 = readln().toInt()
           println("Introduce un segundo numero")
           var num2 = readln().toInt()

           if (num == 3 && num2 == 0){
               println("No se pueden numeros negativos")
           }else{
               when(num){
                   1 -> suma1(num1,num2)
                   2 -> resta1(num1,num2)
                   3 -> multi(num1,num2)
                   4 -> division(num1,num2)
                   else -> println("Error")
               }
           }

       }

    }

}

fun suma1(num1:Int, num2:Int){
    println("La suma es ${num1 + num2} ")
}
fun resta1(num1:Int, num2:Int){
    println("La resta es ${num1 - num2} ")
}
fun multi(num1:Int, num2:Int) {
    println("La multiplicación es ${num1 * num2} ")
}
fun division(num1:Int, num2: Int) {
    println("La división ${num1 / num2} ")
}

