package funcoes

fun funcaoTes(parametro1: String, parametro2: Int): String {
    return "O parametro 1 é $parametro1 e o parametro 2 é $parametro2"
}

fun main() {
    // Para que o metodo tenha parametros nomeados, basta adicionar o nome do parametro na chamada a função.
    // Diferente do DART onde eu preciso declarar a função com chaves, aqui eu declaro a função da mesma forma
    // mas na hora de invocá-la, eu passo os parametros nomeados ou não.

    val retorno = funcaoTes("Tamo aqui viu...",1);
//    val retorno = funcaoTes(parametro2 = 1, parametro1 = "Tamo aqui viu");
    println(retorno)
}