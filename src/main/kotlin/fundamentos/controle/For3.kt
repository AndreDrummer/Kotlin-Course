package fundamentos.controle

fun main() {
    for(i in 1..20 step 2) {
        println("i = $i")
    }

    println()

    for(i in 20 downTo 1 step 2) {
        println("i = $i")
    }
}