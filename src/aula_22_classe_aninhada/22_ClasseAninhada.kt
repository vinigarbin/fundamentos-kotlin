package aula_22_classe_aninhada

data class Car(val model: String, val year: Int) {
    object Engine {

        data class FuelType(val typeName: String) {
            fun fuelCar() {
                println("Abastecendo $typeName ...")
            }
        }

        fun start() {
            println("Ligando ...")
        }
    }
}

fun main() {
    val car = Car("fiesta", 2012)
    val carEngine = Car.Engine
    val fuelType = Car.Engine.FuelType("Gasolina")

    carEngine.start()
    fuelType.fuelCar()

}