package Funciones_con_retorno

fun mostrarPromedio(v1: Int, v2: Int, v3: Int): Int {
    val pro = (v1 + v2 + v3) /3
    return pro
}

fun main() {
    print("Ingrese un primer valor entero: ")
    val valor1 = readln().toInt()
    print("Ingrese un segundo valor entero: ")
    val valor2 = readln().toInt()
    print("Ingrese un tercer valor entero: ")
    val valor3 = readln().toInt()
    print("El valor promedio de los promedios es de ${mostrarPromedio(valor1, valor2, valor3)}")
}