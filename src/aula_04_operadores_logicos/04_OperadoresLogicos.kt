package aula_04_operadores_logicos

import kotlin.math.sqrt

fun main() {
    val a = true
    val b = false
    val c = true

    // operador E (&&)
    val result = a && b
    val result2 = a && c

    println(result)
    println(result2)

    // operador OU (||)

    val result3 = a || b
    val result4 = a || c

    println(result3)
    println(result4)

    // operador NÃO (!)

    val e = true
    val f = !e

    println(f)

    val num1 = 10
    val num2 = 5

    // operador IGUALDADE (==)
    println(num1 == num2)

    // operador DESIGUALDADE (!=)
    println(num1 != num2)

    // operador é  e não é (is e !is)
    val num: Any = 1
    val numText: Any = "test"

    println(num is String)
    println(numText is String)

    println(num !is String)
    println(numText !is String)

    // operadores pertence e não pertence (in !in)
    val range = 1..10
    val x = 5
    val y = 15

    println(x in range)
    println(y in range)


    println(x !in range)
    println(y !in range)

}