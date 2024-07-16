package Estructura_condicional_when_argumento
fun main() {
    var hijo0 = 0
    var hijo1 = 0
    var hijo2 = 0
    var mas = 0
    for(i in 1..10) {
        print("Ingrese cuantos hijos tiene la familia: ")
        val cant = readln().toInt()
        when (cant) {
            0 -> hijo0 ++
            1 -> hijo1 ++
            2 -> hijo2 ++
            else -> mas ++
        }
    }
    println("La cantidad de familias que tienen 0 hijos son: $hijo0")
    println("La cantidad de familias que tienen 1 hijo son: $hijo1")
    println("La cantidad de familias que tienen 2 hijos son: $hijo2")
    println("La cantidad de familias que tienen mas de 2 hijos son: $mas")

}