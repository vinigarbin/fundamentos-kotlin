package aula_20_classes_de_dados

class UserClass(val name: String, val age: Int)

data class UserDataClass(val name: String, val age: Int)

fun main() {
    val userClass = UserClass("Vinicius", age = 20)
    val userDataClass = UserDataClass("Vinicius 2 ", age = 22)


    // toString
    println(userClass.toString())
    println(userDataClass.toString())


    // equals

    val jose = UserDataClass("Jose", 30)
    val maria = UserDataClass("Maria", 20)
    val jose2 = UserDataClass("Jose", 30)

    val userClass2 = UserClass("Vinicius", age = 20)

    println(jose == jose2)
    println(userClass == userClass2)

    // copy
    val copyMaria = maria.copy()

    println(copyMaria)
    val (name, age) = jose

    println(name)
    println(age)
}