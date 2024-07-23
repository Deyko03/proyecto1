package Funciones_parámetros_valor_por_defecto

fun sumarValores(v1: Int, v2: Int, v3: Int = 0, v4: Int = 0, v5: Int = 0): Int {
return v1 + v2 + v3+ v4+ v5

}

fun main() {
    println(sumarValores(1, 2))
    println(sumarValores(1, 2, 3))
    println(sumarValores(1, 2, 3, 4))
    println(sumarValores(1, 2, 3, 4, 5))
}