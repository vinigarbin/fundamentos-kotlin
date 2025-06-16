package aula_30_variancia

open class Animal(val name: String)


class Dog : Animal("Cachorro")
class Cat : Animal("Gato")
class Bird : Animal("Pássaro")


// contravariancia = in (consumidores) permite apenas a entrada como T
class Feeder<in T : Animal> {
    fun feed(animal: Animal) {
        println("${animal.name} foi alimentado.")
    }
}

// covariancia = out (produtores)

open class Drink(val name: String)

class Juice : Drink("Suco")
class Soda : Drink("Refrigerante")
class Coffee : Drink("Café")

class Cup<out T : Drink>(val drink: T, val amount: Int)

fun serverDrink(cup: Cup<Drink>) {
    println("Servindo a bebida ${cup.drink.name} de quantidade ${cup.amount}")
}


fun main() {
    val catFeeder = Feeder<Cat>()
    val dogFeeder = Feeder<Dog>()

    catFeeder.feed(Cat())
    dogFeeder.feed(Dog())

    serverDrink(Cup<Coffee>(Coffee(), 10340))
    serverDrink(Cup<Juice>(Juice(), 100))
}