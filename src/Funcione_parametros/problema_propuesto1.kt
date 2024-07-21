package Funcione_parametros

fun comprarClaves(clave1: String, clave2: String){
    if (clave1 == clave2) {
        println("Las claves ingresadas son iguales.")
    } else {
        println("Las claves ingresadas son distintas.")
    }
}

fun main() {

    print("Ingrese su clave: ")
    val c1 = readln()
    print("confirme su clave: ")
    val c2 = readln()

comprarClaves(c1, c2 )
}

