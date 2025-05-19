package aula_05_estruturas_condicionais

fun main() {
    val x = 100
    val y = 50


    val result = if (x > y) {
        "x > y"
    } else if (x < y) {
        "x < y"
    } else if (x == y) {
        "x == y"
    } else {
        "else"
    }

    println(result)

    val result2 = when (x) {
        in 1..100 -> "1..100"
        100 -> "100"
        in 101..200 -> "101..200"

        else -> "else"
    }

    println(result2)
}
