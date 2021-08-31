package funcoes

class ItemDePedido(val nome: String, var preco: Double) {
    companion object {
        fun create(nome: String, preco: Double) = ItemDePedido(nome, preco)
    }

    private var desconto: Double = 0.10

    fun precoComDesconto(): Double {
        return preco - preco * desconto
    }
}
fun main(args: Array<String>) {
    var item1 = ItemDePedido.create("TV 50 Polegadas", 2989.90)
    var item2 = ItemDePedido("Liquidificador", 200.0)
    println(item1.precoComDesconto())
    println(item2.precoComDesconto())
}