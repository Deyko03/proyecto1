package Funcione_parametros

fun mostrarPerimetro(lado: Int){
    val perimetro = lado * 4
    println("El perímetro es de $perimetro")
}

fun mostrarSuperficie(lado: Int){
    val superficie = lado * lado
    println("La superficie es $superficie")
}

fun main() {
 print("Ingrese el valor de un lado de un cuadrado: ")
 val la = readln().toInt()
    print("Quiere calcular el perimetro o la superficie[ingresar texto: perimetro/superficie]: ")
    var respuesta = readln()
    when (respuesta){
        "perimetro" -> mostrarPerimetro(la)
        "superficie" -> mostrarSuperficie(la)
    }

}