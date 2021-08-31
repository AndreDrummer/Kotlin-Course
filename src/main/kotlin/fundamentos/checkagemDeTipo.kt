package fundamentos

import kotlin.reflect.typeOf

@OptIn(ExperimentalStdlibApi::class)
fun main() {
    val valor = "abc"

    if(valor is String) {
        println("$valor is ${valor::class.simpleName}")
    } else if(valor !is String) {
        println("Não é String")
    }

}