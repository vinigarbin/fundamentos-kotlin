package aula_23_classes_internas

class Car(val model: String, val year: Int) {
    inner class Engine {

        inner class Fuel(val typeName: String) {
            fun fuelCar() {
                println("Abastecendo o carro $model $year com $typeName")
                start()
            }
        }

        fun start() {
            println("Ligando $model $year...")
        }
    }
}

fun main() {
    val carEngine = Car("fiesta", 2012).Engine()
    val fuel = carEngine.Fuel("Gasolina")

//    carEngine.start()
    fuel.fuelCar()
}