package Metodos_set_y_get

class empleado (var nombre: String, sueldo: Double){
    var sueldo: Double = 0.0
        set(valor) {
            if (valor < 0.0)
                field = 0.0
            else
                field = valor
        }

    init {
        this.sueldo = sueldo
    }

    fun imprimir() {
        println("$nombre tiene $sueldo de sueldo")
    }
}

fun main() {
    val empleado1 = empleado("El MilloGangster", 300.000)
    empleado1.imprimir()
    val empleado2 = empleado("El Mynor", -300.000)
    empleado2.imprimir()
}