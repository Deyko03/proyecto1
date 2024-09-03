package Metodos_set_y_get

class dado(valor: Int) {
    var valor: Int = 1
        set(valor) {
            if (valor >= 1 && valor <= 6)
                field = valor
            else
                field = 1
        }

    init {
        this.valor = valor
    }

    fun tirar() {
        valor = ((Math.random() * 6) + 1).toInt()
    }

    fun imprimir() {
        println("Valor del dado: $valor")
    }
}
fun main() {
    val dado1 = dado(7)
    dado1.imprimir()
    dado1.tirar()
    dado1.imprimir()
}