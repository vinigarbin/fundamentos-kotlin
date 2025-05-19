package aula_18_companion_object

class Person {
    companion object {

        const val KEY = "12345678"
        private val KEY_2 = "123457890"

        fun getKey(): String {
            return KEY + KEY_2
        }
    }

    fun getKey(): String {
        return KEY_2
    }
}

fun main() {
    val key = Person.KEY
    val keySum = Person.getKey()
    val key2 = Person().getKey()

    println(key)
    println(keySum)
    println(key2)


}