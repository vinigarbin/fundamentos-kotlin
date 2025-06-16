package aula_34_validacoes_de_argumentos

// require

fun dividir(a: Int, b: Int): Int {
    require(b != 0) { "O divisor não pode ser zero." }

    return a / b
}

// requireNotNull
fun imprimirNome(nome: String?) {
    val nomeNaoNullo = requireNotNull(nome) { "O nome de usúario não foi definido até o momento." }

    println("Nome: $nomeNaoNullo")
}

// check

fun processarListaNotas(lista: List<Int>) {
    check(lista.isNotEmpty()) { "A lista não pode ser processada. Não há nenhum item inserido." }

    println("PRocessando lista de tamanho de ${lista.size}...")

    check(lista.all { it != 0 }) { "O aluno foi reprovado devido possuir uma nota 0." }

    println("A média é ${lista.sum() / lista.size}")

}

fun main() {
//    println(dividir(1, 2))
//    println(dividir(3, 0))

//    imprimirNome("Bernardo")
//    imprimirNome(null)

    processarListaNotas(listOf(1, 3, 4, 5))
    processarListaNotas(listOf(1, 3, 4, 0))
    processarListaNotas(emptyList())
}
