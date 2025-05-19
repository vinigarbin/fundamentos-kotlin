package aula_07_inicializacaoTardia

import kotlin.properties.Delegates

fun main() {
    //lateinit
    lateinit var a: String

    a = "kotlin"

    println(a)

    // lazy

    val b: String by lazy {
        "kotlin lazy"
    }

    println(b)

    // tipos primitimos

    // Delegates faz o mesmo que o lateinit
    var c: Int by Delegates.notNull()

    c = 1
    println(c)
}