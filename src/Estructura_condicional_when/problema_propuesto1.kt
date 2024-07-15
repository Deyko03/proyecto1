package Estructura_condicional_when
fun main() {
print("Ingrese un valor: ")
    val valor = readln().toDouble()
    when {
        valor > 0 -> print("Número entero")
        valor < 0 -> print("Número negativo")
        else -> println("Numero nulo")
    }
}