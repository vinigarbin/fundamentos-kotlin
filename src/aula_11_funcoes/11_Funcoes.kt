package aula_11_funcoes

fun isEven(num: Int): Boolean {
    return num % 2 == 0
}

fun main() {
    val num = 7

    println("é par? ${isEven(num = num)}")
}