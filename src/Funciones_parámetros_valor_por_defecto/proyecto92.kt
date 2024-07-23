package Funciones_parámetros_valor_por_defecto

fun tituloSubrayado(titulo:String,caracter:String="*"){
    println(titulo)
    for(i in 1..titulo.length)
    print(caracter)
    println()
}
fun main(){
    tituloSubrayado("SistemadeAdministracion")
    tituloSubrayado("Ventas", "-")
}