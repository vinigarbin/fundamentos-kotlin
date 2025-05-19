package aula_29_genericos


fun <T> printItem(item: T) {
    println(item)
}

data class Product(val name: String, val amount: Int)

class Container<T>(val items: List<T>) : ItemsPrinter<T> {
    fun showItems() {
        println(
            """
            Itens do container: 
            ${items.joinToString()}
        """.trimIndent()
        )
    }

    override fun print(item: T) {
        println(item)
    }
}

interface ItemsPrinter<T> {
    fun print(item: T) {
        println(item)
    }
}

fun <T> List<T>.secondOrNull(): T? {
    return if (this.size >= 2) this[1] else null
}

fun <T : Comparable<T>> findMax(a: T, b: T): T {
    return if (a > b) a else b
}

fun main() {

    printItem("Kotlin")

    printItem(true)
    printItem(1)

    printItem(object {
        val name = "name"

        val x = 100.0
    })


    val container1 = Container(
        listOf<Product>(
            Product("Laranja", 20),
            Product("Maça", 24)
        )
    )

    container1.showItems()

    val container2 = Container(
        listOf(
            "Laranja",
            "Maça"
        )
    )

    container2.showItems()
    container2.print(container2.items.first())


    val productList = listOf(
        Product("Laranja", 20),
        Product("Maça", 24)
    )
    val productList2 = listOf(
        Product("Laranja", 20)
    )


    println(productList.secondOrNull())
    println(productList2.secondOrNull())

    println(findMax("hello", "kotlin"))
    println(findMax(10, 100))
}