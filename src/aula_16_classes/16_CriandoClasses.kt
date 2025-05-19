package aula_16_classes

import kotlin.random.Random

class Person(val name: String = "Desconhecido", val lastName: String, val age: Int = 0) {
    val fullname: String = "$name $lastName"

    private val password: String = name + Random.nextInt(100)

    private fun usePassword() {
        println(password)
    }

    fun work() {
        usePassword()
        println("$name, $age Trabalhando ...")
    }
}

fun main() {
    val jose: Person = Person(name = "José", "Antonio", age = 29)
    val maria: Person = Person("Maria", "antoneta")

    jose.work()
    maria.work()

    println(jose.fullname)
    println(maria.fullname)
}