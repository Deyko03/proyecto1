fun main (){

    /*
    print("Ingrese un primer valor: ")
    val valor1 = readln().toInt()
    print("Ingrese un segundo valor: ")
    val valor2 = readln().toInt()
    val mayor = if( valor1 > valor2) valor1 else valor2
    println("El mayor entre $valor1 y $valor2 es $mayor")
*/

    /*
    print("Ingrese un valor entero: ")
    val valor = readln().toInt()
    val resultado = if (valor % 2==0){
        print("Cuadrado: ")
        valor * valor
    }else{
        print("Cubo: ")
        valor * valor * valor
    }
    print(resultado)
    */

     print("Ingres un número entre 1 y 99: ")
    val valor = readln().toInt()
    val cant = if (valor >=10) print("El número tiene 2 dígitos") else {
        println("$valor tiene un solo dígito")
    }

}