fun main () {

    //Problema 1
    /*
    do {
        print("Ingrese un valor comprendido entre 0 y 999: ")
        val valor = readln().toInt()
        if (valor < 10)
            println("El valor ingresado tiwnw un dígito")
        else
            if (valor < 100)
                println("El valor ingresado tiene dos dígitos")
            else
                println("El valor ingresado tiene tres dígitos")
    } while (valor != 0)
*/
    //Problema 2
/*
    var cant = 0
    var suma = 0
    do {
        print("Ingrese un valor (0 para finalizar): ")
        val valor = readln().toInt()
        if (valor != 0){
            suma += valor
            cant ++
        }
    }while(valor != 0)
    if (cant != 0){
        val promedio = suma / cant
        print("El promedio de los valores ingresados es: $promedio")
    }*/
    /*
    var cantidad_inferior = 0 // por debajo de 9.8
    var cantidad_superior = 0 //por debajo de 10.2
    var cantidad_adecuada = 0 // entre 9.8 y 10.2
    do{
        print("Ingrese el peso de la pieza (0 para finalizar): ")
        val peso = readln().toDouble()
       if(peso > 10.2)
           cantidad_superior++
        else
            if(peso >= 9.8 && peso <= 10.2)
                cantidad_adecuada++
        else
            cantidad_inferior
    }while(peso != 0.0)
    println("Piezas aptas: $cantidad_adecuada")
    println("Piezas con un peso superior a 10.2: $cantidad_superior")
    println("Piezas con un peso inferior a 9.8: $cantidad_inferior")
    val suma = cantidad_inferior + cantidad_adecuada + cantidad_superior
    println("Cantidad total de piezas procesadas: $suma")
*/
    //Problemas propuestos

    /*
    var valorAcumulado = 0

    println("Ingrese los valores a sumar. Ingrese 9999 para finalizar.")

    do {
        print("Ingrese un valor: ")
        val entrada = readln().toInt()

        if (entrada != 9999) {
            valorAcumulado += entrada
        }

    } while (entrada != 9999)

      if(valorAcumulado == 0) {
            println("El valor acumulado es cero.")
        }else
        if(valorAcumulado > 0){
                println("El valor acumulado es mayor a cero.")
        }else
        if(valorAcumulado < 0) {
            println("El valor acumulado es menor a cero.")
        }

    println("El valor acumulado es: $valorAcumulado")
*/



    var saldos = 0.0


    println("Ingrese los datos de las cuentas corrientes. Ingrese un número de cuenta negativo para finalizar.")

    do {
        print("Ingrese el número de cuenta: ")
        val cuenta = readln().toInt()
        if (cuenta >= 0 ) {
            print("Ingrese el saldo actual: ")
            val saldo = readln().toDouble()

            if (saldo > 0) {
                println("Estado de la cuenta: Acreedor")
                saldos+=saldo
            }else
            if (saldo < 0) {
                println("Estado de la cuenta: Deudor")
            }else
            if (saldo == 0.0) {
                println("Estado de la cuenta: Nulo")
            }

        }
    } while (cuenta >= 0)

    println("La suma total de los saldos acreedores es: $saldos")
}