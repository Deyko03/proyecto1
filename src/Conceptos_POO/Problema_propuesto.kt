package Conceptos_POO

class Alumno{
    var nombre: String = ""
    var nota: Int = 0

    fun inicializar(nombre: String, nota: Int){
        this.nombre = nombre
        this.nota = nota
    }

    fun regular() {
        if (nota >= 4)
            println("La nota es regular")
    }
}
fun main (){
    print("Ingrese el nombre: ")
    var nombre = readln().toString()
    println("Ingrese la nota: ")
    var nota = readln().toInt()

    val alumno1 = Alumno()
    alumno1.inicializar(nombre, nota)
    alumno1.regular()

    println("Ingrese el segundo nombre: ")
    var nombre2 = readln().toString()
    println("Ingrese la nota: ")
    var nota2 = readln().toInt()

    val alumno2 = Alumno()
    alumno2.inicializar(nombre2, nota2)
    alumno2.regular()

}