package aula_10_lacos_repeticao

fun main() {
    // for

    val list = listOf(1, 2, 3, 5, 10)

    for (item in list) {
        println(item)
    }

    list.forEach {
        println(it)
    }

    list.forEachIndexed { index, item ->
        println("index = $index | item = $item")
    }

    val list2 = listOf("abc", "def", "ghi", false, 10.0)

    for (item in list2) {
        println(item)
    }

    list2.forEach {
        println(it)
    }

    list2.forEachIndexed { index, item ->
        println("index = $index | item = $item")
    }

    for ((index, item) in list2.withIndex()) {

        if (index == 3) {
            continue
        }

        println("index = $index | item = $item")
    }

    // while

    var index = 1
    val maxLimit = 5

    while (index <= maxLimit) {
        println("$index ...")
        index++
    }

    // do / while
    var index2 = 1

    do {
        println(index2)

        if (index2 == 3)
            break

        index2++
    } while (index2 <= 5)

    // laços aninhados

    loop@ for (i in 1..3) {
        for (j in 1..3) {
            if (i == 2 && j == 2) {
                break@loop
            }
            println("i = $i | j = $j")
        }
    }

    // repeat
    var index3 = 1

    repeat(5) {
        println(index3)
        index3++
    }

    val lista = listOf(1, 2, 3)
    println(lista[1])
}