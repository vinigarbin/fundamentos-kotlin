package aula_19_classe_aberta

open class Animal(val name: String) {

    open val age = 0

    open fun sound() {
        println("$name: som")
    }
}

class Dog(override val age: Int) : Animal(name = "Cachorro") {


    override fun sound() {
        println("$name: AU")
    }

}

fun main() {
    val dog = Dog(20)

    dog.sound()

    println(dog.age)

}