fun main() {
    /*
    //Peoblema 1
    print("Ingrese el sueldo del empleado: ")
    val sueldo: Double = readln().toDouble()

    //condicional if; si el sueldo es mayor 3000
    //imprimir "Debe pagar impuestos
    if (sueldo > 3000) {
        print("Debe pagar impuesto")
    }
*/
    /*
        //Problema2
        print("Ingrese un primer valor: ")
        val valor1 = readln().toInt()
        print("Ingrese un seundo valor: ")
        val valor2 = readln().toInt()
        //condicional con if / else
        if (valor1 > valor2) {
            print("El mayor valor es $valor1")
        } else {
            print("El mayor valor es $valor2")
        }*/

    /*
    //Problema3
    print("Ingrese el primer valor: ")
    val valor1: Int = readln().toInt()
    print("Ingrese el segundo valor: ")
    val valor2: Int = readln().toInt()
    if(valor1 < valor2){
        val suma: Int = valor1 + valor2
        val resta: Int= valor1 - valor2
        println("La suma de los dos valoes es: $suma")
        println("La resta de los dos valores es: $resta")
    }else{
        val producto: Int = valor1 * valor2
        val division: Int = valor1 / valor2
        println("El producto de los dos valores es: $producto")
        println("La división de los dos valores es: $division")
    }*/

    /*
    //Problema4
    print("Ingrese su primera calificación: ")
    val nota1 = readln().toInt()
    print("Ingrese su segunda calificación: ")
    val nota2 = readln().toInt()
    print("Ingrese su tercera calificación: ")
    val nota3 = readln().toInt()
    val promedio = (nota1 + nota2+ nota3)/3
    if(promedio >= 70){
        println("Promovido")
    }*/

    //Problema5

    print("Ingrese un número entre 0 y 99: ")
    val num = readln().toInt()
    if(num >= 10){
        println("Este número tiene 2 digitos")
    }else{
        println("Este número tine un solo digito")
    }

}