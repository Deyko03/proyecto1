package Funciones_unica_expresion
fun perimetroCuadrado(lad: Int) = lad * 4
fun main() {
    print("Ingrese la medida del lado del cuadrado: ")
    val med = readln().toInt()
    println("El perímetro de este cuadrado es de: " +
    "${perimetroCuadrado(med)}")
}