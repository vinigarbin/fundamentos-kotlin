package nules

fun main() {
    var a: String? = null
    val result: String = a ?: "kotlin"
    println(result)

    var b: Int = -1
    b = a?.toInt() ?: 0
    println(b)

    if (a != null) {
        println(a!!.toInt())
    }

    val c = a as? Int

    println(c)

    b?.let {
        println(it)
    }
}