package fundamentos

fun main() {
    // Tipos Númericos Inteiros
    val num1: Byte = 127
    val num2: Short = 32767
    val num3: Int = 2_147_483_647
    val num4: Long = 9_223_372_036_854_775 // Long.MAX_VALUE

    // Tipos Numéricos Reais
    val num5: Float = 3.14F
    val num6: Double = 3.14

    // Tipo Caracter
    val char: Char = '?'

    // Tipo booleano
    val boolean: Boolean = true // or false

    // Tudo em Kotlin é Objeto, veja a prova a baixo: O numeral 10 conssegue chamar uma função.
    print(10.dec())

}