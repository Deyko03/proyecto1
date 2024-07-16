package Estructura_condicional_when_argumento
fun main() {
    print("Ingrese un valor entero positivo comprendido emtre 1 y 99999: ")
    val valor = readln().toInt()
    when (valor) {
        in 1..9 -> print("Tiene 1 dígito")
        in 10..99 -> print("Tiene 2 dígito")
        in 100..999 -> print("Tiene 3 dígito")
        in 1000..9999 -> print("Tiene 4 dígito")
        in 10000..99999 -> print("Tiene 5 dígito")
        else -> print("No se encurntra comprendido en el rango indicado")
    }
}