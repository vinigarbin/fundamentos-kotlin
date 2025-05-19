package aula_28_classes_e_interfaces_seladas

sealed interface Animal {
    data class Dog(val breed: String) : Animal {
        override val x: Int
            get() = 20

        override fun sound(): String {
            return "Au!"
        }
    }

    data class Cat(val color: String) : Animal {
        override fun sound(): String {
            return "Miau!"
        }
    }

    data object Bird : Animal {
        override fun sound(): String {
            return "Piu!"
        }
    }


    fun sound(): String
    val x: Int
        get() = 10
}

sealed class Result(val y: Int) {
    data class Success(val data: String) : Result(20)
    data class Error(val exception: Exception) : Result(21)
    data object Loading : Result(22)

    val x: Int = 10
}

fun handleResult(result: Result) {
    println(
        when (result) {
            is Result.Error -> "Houve um erro! ${result.exception.message}"
            Result.Loading -> "Carregando..."
            is Result.Success -> "Sucesso! ${result.data}"
        }
    )
}

object Database {
    fun getContacts(): Result {
        return Result.Success(data = listOf("João", "José", "Maria").joinToString())
    }

    fun insertContacts(contact: String): Result {
        return Result.Error(IllegalArgumentException("o Contato a ser inserido possui caracteres invalidos"))
    }

    fun updateContact(id: Int, newContact: String): Result {
        return Result.Loading
    }
}

fun handleAnimal(animal: Animal) {
    println(
        when (animal) {
            is Animal.Cat -> "O animal é um gato. O som que ele faz é ${animal.sound()} e sua cor é ${animal.color}"
            is Animal.Dog -> "O animal é um cachorro. O som que ele faz é ${animal.sound()} e sua raça é ${animal.breed}"
            Animal.Bird -> "O animal é um Passaro. O som que ele faz é ${animal.sound()}"
        }
    )
}

fun main() {

    val contacts: Result = Database.getContacts()
    val isContactInserted: Result = Database.insertContacts("Fernando")
    val isContactUpdated: Result = Database.updateContact(1, "Fernando")

    handleResult(contacts)
    handleResult(isContactInserted)
    handleResult(isContactUpdated)

    val dog = Animal.Dog("Poodle")
    val cat = Animal.Cat("White")
    val bird = Animal.Bird

    handleAnimal(dog)
    handleAnimal(cat)
    handleAnimal(bird)
}