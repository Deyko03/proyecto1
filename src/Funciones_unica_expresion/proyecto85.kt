package Funciones_unica_expresion

fun retonarSuperficie(lado: Int) = lado * lado

fun main() {
    print("Ingrese el valor del lado del cuadrado: ")
    val la = readln().toInt()
    println("La superficie del cuadro es ${retonarSuperficie(la)}")
}