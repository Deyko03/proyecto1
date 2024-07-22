package Funciones_con_retorno

fun retornarSuperficie(ladop: Int): Int {
    val sup = ladop * ladop
    return sup
}

fun main() {
    print("Ingrese el valor del lado del cuadrado: ")
    val la = readln().toInt()
    val superficie = retornarSuperficie(la)
    println("La superficie del cuadrado es de : $superficie")
}