package Funcione_parametros

fun mostrarMayorMenor(num1: Int, num2: Int, num3: Int) {
    val mayor = if (num1 >= num2 && num1 >= num3) {
        num1
    } else
        if (num2 >= num1 && num2 >= num3) {
        num2
    } else {
        num3
    }

    val menor = if (num1 <= num2 && num1 <= num3) {
        num1
    } else
        if (num2 <= num1 && num2 <= num3) {
        num2
    } else {
        num3
    }

    val medio = if ((num1 >= num2 && num1 <= num3) || (num1 <= num2 && num1 >= num3)) {
        num1
    } else
        if ((num2 >= num1 && num2 <= num3) || (num2 <= num1 && num2 >= num3)) {
        num2
    } else {
        num3
    }

    println("Los números ordenados de mayor a menor son: $mayor, $medio, $menor")
}

    fun main() {
        print("Ingrese un primer valor entero: ")
        val n1 = readln().toInt()
        print("Ingrese un segundo valor entero: ")
        val n2 = readln().toInt()
        print("Ingrese un tercer valor entero: ")
        val n3 = readln().toInt()

        mostrarMayorMenor(n1, n2, n3)
    }