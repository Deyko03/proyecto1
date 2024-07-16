package Concepto_funciones
fun valores(){
    print("Ingrese un primer valor: ")
    val valor1 = readln().toInt()
    print("Ingrese un segundo valor: ")
    val valor2 = readln().toInt()
    print("Ingrese un tercer valor: ")
    val valor3 = readln().toInt()
    when {
        valor1 < valor2 && valor1 < valor3 -> print("El numero menor es: $valor1")
        valor2 < valor1 && valor2 < valor3 -> print("El número menor es: $valor2")
        else -> println("El número menor es: $valor3")
    }

}

fun main() {
    valores()
    valores()
}