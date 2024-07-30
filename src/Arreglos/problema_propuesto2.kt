package Arreglos

import kotlin.random.Random

fun main() {

    /*val num1 = IntArray(4)
    var toti = 0f
    for ( i in 0..num1.size - 1){
        print("Ingrese un valor: ")
        num1[i] = readln().toInt()
        toti +=  num1[i]
    }
    val num2 = IntArray(4)
    var totii = 0f
    for ( i in 0..num2.size - 1){
        print("Ingrese otro valor: ")
        num2[i] = readln().toInt()
        totii +=  num2[i]
    }
    var total = 0f
    for (i in 0..num1.size -4) {
        total = toti + totii
        println("La suma de todos los valores es: $total")
    }

} */



    val arreglo1: IntArray
    arreglo1 = IntArray(4)
    var arreglo2 = IntArray(4)
    val arregloSuma = IntArray(4)

    var verArreglo1 = "Arreglo1: "
    var verArreglo2 = "Arreglo2: "
    var verArreglosuma = "ArregloSumado"
    for (i in 0..arreglo1.size -1){

        arreglo1[i] = Random.nextInt(0,10)
        arreglo2[i] = Random.nextInt(0,10)
        arregloSuma[i] = arreglo1[i] + arreglo2[i]

        verArreglo1 += if (i == arreglo1.lastIndex)
            arreglo1[i] else arreglo1[i].toString() + ", "

        verArreglo2 += if (i == arreglo2.lastIndex)
            arreglo2[i] else arreglo2[i].toString()
        verArreglosuma += if (i == arregloSuma.lastIndex)
            arregloSuma[i] else arregloSuma[i].toString()
    }
    println(verArreglo1)
    println(verArreglo2)
    println(verArreglosuma)
}