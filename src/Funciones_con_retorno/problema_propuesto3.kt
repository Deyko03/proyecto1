package Funciones_con_retorno

fun calcularSuperficie(lado1: Int, lado2: Int): Int {
    val superficie = lado1 * lado2
    return superficie

}
fun main() {
    print("Ingrese el valor de un lado del rectángulo: ")
    val la1 = readln().toInt()
    print("Ingrese el valor de otro lado del rectángulo: ")
    val la2 = readln().toInt()
    print("Ingrese el valor del lado de otro rectángulo: ")
    val la3 = readln().toInt()
    print("Ingrese el valor de otro  lado de este rectángulo: ")
    val la4 = readln().toInt()

    if (calcularSuperficie(la1, la2) < calcularSuperficie(la3, la4))
        println("El rectaángulo con los lados $la3 y $la4 tiene una superficie mayor")
    else
        if (calcularSuperficie(la1, la2) == calcularSuperficie(la3, la4))
            println("ambos rectángulos tienen la misma superficie")
        else
         println("El rectángulo con los lados $la1 y $la2 tiene una superficie mayor")


}

