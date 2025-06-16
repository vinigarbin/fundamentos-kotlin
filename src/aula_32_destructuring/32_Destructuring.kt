package aula_32_destructuring

data class Person(val name: String, val lastName: String, val age: Int)

class Animal(val name: String, val age: Int) {
    operator fun component1() = name
    operator fun component2() = age
}

fun main() {
    val (name, lastName, age) = Person("José", lastName = "SIlva", 400)

    val (a, b) = Pair<String, String>("a", "b")

    val (c, d, e) = Triple<String, Boolean, Int>("one", true, 500)


    val (gato, idade) = Animal("Gato", 20)
}