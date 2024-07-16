package Concepto_funciones
fun cuadrado(){
    print("Ingrese un numero entero: ")
    val num = readln().toInt()
    val cuadrado = (num + num)
    println("$num al cuadrado es $cuadrado")
}

fun producto(){
    print("Ingres un primer valor entero: ")
    val valor1 = readln().toInt()
    print("Ingres un segundo valor entero: ")
    val valor2 = readln().toInt()
    val producto = (valor1 * valor2)
    println("El producto de los dos valores es: $producto")
}

fun main() {
    cuadrado()
    producto()
}