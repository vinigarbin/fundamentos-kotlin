package aula_14_funcoes_extensao

fun String.isPalindrome(): Boolean {
    return this == this.reversed()
}

fun Double.format(decimalDigits: Int): String {
    return "%.${decimalDigits}f".format(this)
}

fun main() {
    println("radar".isPalindrome())
    println("reviver".isPalindrome())
    println("aberto".isPalindrome())

    println(3.14434343.format(3))
}