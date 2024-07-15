package Estructura_condicional_when
fun main(parametro: Array<String>) {
    var total = 0
    for(i in 1..10) {
        print("Ingrese sueldo del operario: ")
        val sueldo = readln().toInt()
        total += when {
            sueldo > 500 -> {
                println("Sueldo alto")
                sueldo
            }
            sueldo > 2000 -> {
                println("Sueldoi medio")
                0
            }
            else -> {
                println("Sueldo bajo")
                0
            }
        }
    }
    println("Gastos totales en sueldos altos: $total")
}
