fun main() {
    //Problemas propuestos

    //1
    /*
    var mayores = 0
    var menores = 0
    var contador = 0

    println("Ingresa las notas de los alumnos:")

    while (contador < 10) {
        contador++
        print("Nota del alumno $contador: ")
        val nota = readln().toInt()
            if (nota >= 7) {
                mayores++
            } else {
                menores++
            }
        }
    println("Notas mayores o iguales a 7: $mayores")
    println("Notas menores a 7: $menores")
}
*/
    /*
    //Problema2

    var x = 1
    print("Ingrese la cantidad de alturas que va a ingresar: ")
    val n = readln().toInt()
    var altu = 0.0
    while (x <= n){
        print("Igrese la altura: ")
    val altura = readln().toDouble()
    altu = altu + altura
    x++
}
val promedio = altu/n
println("El promedio de altura de las personas es: $promedio")
}*/


    /*
var x = 1
print("Ingrese la cantidad de empleados:")
val n: Int = readln().toInt()
var suma = 0
var sueldomin = 0
var sueldomax = 0
while (x <= n) {
    print("Ingrese el sueldo del empleado:")
    val sueldo: Int = readln().toInt()
    suma = suma + sueldo
    x = x + 1
    if(sueldo >= 100 && sueldo <= 300)
        sueldomin = sueldomin + 1
    else
        if(sueldo >= 300 && sueldo <= 500)
            sueldomax = sueldomax + 1
}
val importe = suma*n
println("Los cantidad de empleados que cobran entre $100 y $300 son: $sueldomin")
println("Los cantidad de empleados que cobran más de $300 son: $sueldomax")
println("El importe que gasta la empresa es de $importe dolares")
*/


    /*
var x = 11
while (x <= 275) {
    println("$x")
    x = x + 11
}
*/


    /*
var x = 8
while (x <= 500) {
    println("$x")
    x = x + 8
}
*/


    /*
var x = 1
var x2 = 1
var suma1 = 0
var suma2 = 0
println("Lista 1")
while (x <= 5) {
    print("Ingrese un valor:")
    val vall1: Int = readln().toInt()
    suma1 = suma1 + vall1
    x = x + 1
}
println("Lista 2")
while (x2 <= 5) {
    print("Ingrese un valor:")
    val vall2: Int = readln().toInt()
    suma2 = suma2 + vall2
    x2 = x2 + 1
}
if(suma1 == suma2)
    println("Listas iguales")
else
    if(suma1 > suma2)
        println("Lista 1 mayor")
else
    if(suma2 > suma1)
        println("Lista 2 mayor")
*/


    var x = 1
    var pares = 0
    var impares = 0
    print("Ingrese la cantidad de numeros deseada a ingresar:")
    val n: Int = readln().toInt()
    while (x <= n) {
        print("Ingrese un numero:")
        val num: Int = readln().toInt()
        x = x + 1
        if (num % 2 == 0)
            pares = pares + 1
        else
            impares = impares + 1
    }
    println("La cantidad de numero pares es: $pares")
    println("La cantidad de numero impares es: $impares")
}