package Estructura_condicional_when
fun main() {
    var mayor = 0
    for(i in 1..10) {
        print("Ingrese el primer valor: ")
        val num1 = readln().toInt()
        print("Ingrese el segundo valor: ")
        val num2 = readln().toInt()
        print("Ingrese el tercer valor: ")
        val num3 = readln().toInt()
        mayor += when {
            num1 > num2 && num1 > num3 -> num1
            num2 > num3 -> num2
            else -> num3

        }
    }
    println("El valor acumulado de los valores mayores de cada lista de 3 números es: $mayor")
}