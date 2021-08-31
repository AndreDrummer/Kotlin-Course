package fundamentos.operadores

data class Carro(val marca: String, val modelo: String)

fun main() {
    val(marca, modelo) = Carro("Ford", "Fusion")

    println("Marca $marca")
    println("Modelo $modelo")

    val (marido, mulher) = listOf<String>("João", "Maria")

    println("Marido $marido")
    println("Mulher $mulher")

    val(_, _, terceiro) = listOf<String>("Kimi", "Hamilton", "Alonso")

    println("O terceiro lugar foi de $terceiro")
}
