package aula_13_funcoes_ordem_superior


fun sum(a: Int, b: Int): Int = a + b

fun subtract(a: Int, b: Int): Int = a - b

fun multiply(a: Int, b: Int): Int = a * b

fun mathOperation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun main() {
    val divider = { a: Int, b: Int -> a / b }

    println(mathOperation(10, 5, operation = ::sum))
    println(mathOperation(10, 5, operation = ::subtract))
    println(mathOperation(10, 5, operation = ::multiply))
    println(mathOperation(10, 5, operation = divider))
}