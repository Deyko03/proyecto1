package Funciones_tipo_arreglo

fun cargar(): IntArray {
    print("Cuantos sueldos quiere cargar: ")
    val cantidad = readln().toInt()
    val sueldos = IntArray(cantidad)
    for (i in sueldos.indices) {
        sueldos[i] = readln().toInt()
    }
return sueldos
}

fun imprimirr(sueldos: IntArray) {
    println("Listado de sueldos")
    for(sueldo in sueldos)
        println(sueldos)
}

fun main() {  
    val sueldos = cargar()
    imprimirr(sueldos)
}