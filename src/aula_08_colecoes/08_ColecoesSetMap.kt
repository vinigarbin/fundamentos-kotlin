package aula_08_colecoes

fun main() {

    // set
    val set = setOf(1, 2, 3, 2)

    val setRandom = setOf(1, 2, 3, "kotlin", "kotlin", "bernardo", 4.0, 5f, 0..100, 1, 2, 19, "kotlin2")

    val setMutable = mutableSetOf(1, 2, 3, "kotlin", "kotlin2", 4.0, 5.0)

    setMutable.add(10)
    setMutable.remove(1)

    println(setMutable)

    // map
    val map = mapOf<Int, String>(Pair(1, "kotlin"), 2 to "kotlin2", 3 to "kotlin3", 1 to "kotlin 3")

    println(map)

    println(map.keys)
    println(map.values)
    println(map.entries)

    val mapMutable = mutableMapOf(1 to "kotlin", "kotlin" to 1, 1f to 1.0, 0..10 to 1)

    println(mapMutable)

    val hashMap = hashMapOf(1 to "kotlin")

    println(hashMap)
}