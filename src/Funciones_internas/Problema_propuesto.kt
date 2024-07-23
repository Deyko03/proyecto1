package Funciones_internas

fun encontrarMayor() {
    fun encontarMayor(num1: Int, num2: Int) = if (num1 > num2) num1 else num2
    for (i in 1..5) {
        print("Ingrese el primer valor: ")
        val valor1 = readln().toInt()
        print("Ingrese el segundo valor: ")
        val valor2 = readln().toInt()
        println("El mayor entre $valor1 y $valor2 es ${encontarMayor(valor1, valor2)}")
    }
}

fun main() {
    encontrarMayor()
}