package aula_31_funcao_inline_tipo_reified

import aula_30_variancia.Drink

inline fun executeAction(action: () -> Unit) {
    println("Iniciando ação")
    action()
    println("Finalizando ação")
}

inline fun <reified T> printTypeName() {
    println(T::class.simpleName)
}

class Juice : Drink("Suco")
class Soda : Drink("Refrigerante")
class Coffee : Drink("Café")

class Cup<out T : Drink>(val drink: T, val amount: Int)

inline fun <reified T : Drink> serveDrink(cup: Cup<T>) {
    println("[${T::class.simpleName}] Servindo a bebida ${cup.drink.name} de quantidade ${cup.amount}")
}


fun main() {

    println("Iniciando ação2")

    printTypeName<String>()
    printTypeName<Int>()

    val juice = Juice()
    val juiceCup = Cup(juice, 500)

    serveDrink(juiceCup)


    fun String.reversa(): String {
        return this.reversed()
    }
    println("Kotlin".reversa())
}