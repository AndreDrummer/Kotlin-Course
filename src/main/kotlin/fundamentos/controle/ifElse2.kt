package fundamentos.controle

fun main() {
    val num1: Int = 2
    val num2: Int = 3

    // val maiorValor: Int = if(num1 > num2 ) num1 else num2 pode ser assim ou...


    // Assim
    val maiorValor = if(num1 > num2 ) {
            num1
        } else {
            num2
        }

    println("Maior valor $maiorValor")
}