package aula_06_controle_de_excecoes

fun main() {
    var x = 1

    try {
        x = 1 / 0
        println(x)
    } catch (e: ArithmeticException) {
        x = 3

        println("Erro de expressão aritmética")
    } catch (e: Exception) {
        x = 4

        println("Erro genérico")
    }
}