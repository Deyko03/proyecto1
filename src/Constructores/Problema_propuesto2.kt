package Constructores

class Puntos (var x: Int, var y: Int) {

    fun cuadrante(): String {
        return when {
            x > 0 && y > 0 -> "1º Cuadrante"
            x < 0 && y > 0 -> "2º Cuadrante"
            x < 0 && y < 0 -> "3º Cuadrante"
            x > 0 && y < 0 -> "4º Cuadrante"
            else -> "En el eje"
        }
    }
}

fun main() {
    val punto1 = Puntos(3,4)
    val punto2 = Puntos(-5,6)
    val punto3 = Puntos(-7,-8)
    val punto4 = Puntos(9,-10)
    val punto5 = Puntos(0,5)
    println("Punto 1: ${punto1.cuadrante()}")
    println("Punto 2: ${punto2.cuadrante()}")
    println("Punto 3: ${punto3.cuadrante()}")
    println("Punto 4: ${punto4.cuadrante()}")
    println("Punto 5: ${punto5.cuadrante()}")
}