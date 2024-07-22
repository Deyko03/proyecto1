package Funciones_con_retorno

fun perimetroCuadrado(ladop: Int): Int {
    val pro = ladop*4
    return pro
}

fun main() {
    print("Ingese el  valor de un lado del cuadrado: ")
    val la = readln().toInt()
    println("el perimetro del cuadrado es: " +
            "${perimetroCuadrado(la)}")
}