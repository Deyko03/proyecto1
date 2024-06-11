fun main(){
    /*
    print("Ingrese el primer valor")
    // readln() convierte la entrada del teclado
    //.toInt() convierte los datos de entrada a tipo numerico
    val valor1 = readln().toInt()
    print("Ingrese el segundo valor:")
    val valor2 = readln().toInt()
    val suma = valor1 + valor2
    println("La suma de $valor1 + $valor2 es $suma")
    val producto = valor1 * valor2
    println("El producto de $valor1 * $valor2 es $suma")*/

    /*
    print("Ingrese el valor del lado del cuadro: ")
        val lado = readln().toInt()
        val perimetro = lado * 4
    println("El perímetro de este cuadrado es $perimetro") */

    /*
    print("Ingrese el precio del producto: ")
    val precio = readln().toDouble()
    print("Ingrese la cantidad que lleva de este producto: ")
    val cantidad = readln().toInt()
    val total = precio * cantidad
    print("Su total por pagar es: $total") */




    /*
    print("Ingrese un primer valor entero: ")
    val valor1 = readln().toInt()
    print("Ingrese un segundo valor entero: ")
    val valor2 = readln().toInt()
    print("Ingrese un tercer valor entero: ")
    val valor3 = readln().toInt()
    print("Ingrese un cuarto valor entero: ")
    val valor4 = readln().toInt()
    val suma = valor1 + valor2
    println("El resultado de la suma de los dos primeros valores es: $suma")

    val promedio = valor3 * valor4
    println("El resultado del producto de los dos últimos valores es: $promedio") */

    print("Ingrese un primer valor entero: ")
    val valor1 = readln().toInt()
    print("Ingrese un segundo valor entero: ")
    val valor2 = readln().toInt()
    print("Ingrese un tercer valor entero: ")
    val valor3 = readln().toInt()
    print("Ingrese un cuarto valor entero: ")
    val valor4 = readln().toInt()

    var suma: Int
    suma = valor1 + valor2 + valor3 + valor4
    println("El resultado de la suma de todos los números es: $suma")
    var promedio: Int
    promedio = (valor1 + valor2 + valor3 + valor4)/4
    println("El promedio de todos los números es: $promedio")


}
