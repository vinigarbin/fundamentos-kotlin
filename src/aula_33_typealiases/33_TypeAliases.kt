typealias Operation = (Int, Int) -> Int

fun mathOperation(a: Int, b: Int, operation: Operation): Int {
    return operation(a, b)
}

typealias NomeDoAluno = String

typealias NotasDoAluno = List<Int>

typealias MapaDeEstudantes = Map<NomeDoAluno, NotasDoAluno>

fun processaNotas(mapaDeEstudantes: MapaDeEstudantes) {
    for ((nome, notas) in mapaDeEstudantes) {
        println("Estudante $nome: |  Notas : ${notas.joinToString()}")
    }
}

fun main() {

    val estudantes: MapaDeEstudantes = mapOf(
        "Alice" to listOf(5, 6, 7),
        "Bruno" to listOf(9, 10, 9)
    )

    processaNotas(estudantes)

}