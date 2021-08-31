package funcoes

import kotlin.reflect.typeOf

fun main(args: Array<String>) {
    for(n in ordenar(38, 3, 456, 8, 51, 1, 88, 73)) {
        print("$n ")
    }
}
fun ordenar(vararg numbers: Int): IntArray {
    return numbers.sortedArray()
}