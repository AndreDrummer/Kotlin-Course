package fundamentos

fun main() {
    println(soma(11))
}

fun soma(a: Int, b: Int = 1): Int {
    return a+b
}