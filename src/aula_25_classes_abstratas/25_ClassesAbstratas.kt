package aula_25_classes_abstratas

abstract class Vehicle(val color: String) {
    abstract val maxSpeed: Int
    abstract val wheelsAmount: Int

    abstract fun startMovement()

    fun info() {
        println(
            """Velocidade Máxima = $maxSpeed Km/h 
                |Quantidade de rodas: $wheelsAmount""".trimMargin()
        )
    }

}

class Car(val model: String, val year: Int, color: String) : Vehicle(color) {
    override val maxSpeed: Int
        get() = 150
    override val wheelsAmount: Int
        get() = 4

    override fun startMovement() {
        println("Ligando motor...")
    }

    override fun toString(): String {
        super.info()
        return "$model , ${year.toString()}"
    }
}

class Bike(color: String) : Vehicle(color) {
    override val maxSpeed: Int
        get() = 40
    override val wheelsAmount: Int
        get() = 2

    override fun startMovement() {
        println("Pedalando...")
    }
}

fun main() {
    val car = Car("Fiesta", 2024, "red")

    val bike = Bike("blue")

    println(car)

    println(bike.maxSpeed)
    println(bike.wheelsAmount)
    bike.info()

}