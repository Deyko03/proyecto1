package Arreglos

fun main() {


    val valoress = FloatArray(8)
    var total = 0f
    for (i in 0..valoress.size - 1) {
        print("Ingrese el valor: ")
        valoress[i] = readln().toFloat()
        total += valoress[i]
    }
    var may = 0f
    var mayo = 0
    for (i in 0..valoress.size - 1) {
        if (valoress[i] > 36)
            may += valoress[i]

        if (valoress[i] > 50)
            mayo++
    }
    println("El valor acumukado de todos los valores es: $total")
    println("El valor acumulado de los valores que son mayor a 36: $may")
    println("La cantitad de valores mayores a 50 es: $mayo")
}