package Funciones_unica_expresion

fun promedio(val1: Int, val2: Int, val3: Int) = (val1 + val2 + val3)/3

fun main() {
    print("Ingrese un primer número: ")
    val num1 = readln().toInt()
    print("Ingrese un segndo número: ")
    val num2 = readln().toInt()
    print("Ingrese un tercer número: ")
    val num3 = readln().toInt()
    println("El promedio de estos números es: " +
    "${promedio(num1, num2, num3)}")
}