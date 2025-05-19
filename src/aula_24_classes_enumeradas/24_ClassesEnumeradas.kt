package aula_24_classes_enumeradas

enum class Direction(val description: String) {
    NORTH("Direção norte") { // 0
        override fun symbol(): Char {
            return '⭡'
        }

        override val symbol: Char
            get() = '⭡'
    },
    SOUTH("Direção sul") { // 1
        override fun symbol(): Char {
            return '⭣'
        }

        override val symbol: Char
            get() = '⭣'
    },
    EAST("Direção leste") { // 2
        override fun symbol(): Char {
            return '⭠'
        }

        override val symbol: Char
            get() = '⭠'
    },
    WEST("Direção oeste") { // 3
        override fun symbol(): Char {
            return '⭢'
        }

        override val symbol: Char
            get() = '⭢'
    };


    companion object {
        fun sumDirection(firstDirection: Direction, secondDirection: Direction) {
            println(firstDirection.description)
            println(secondDirection.description)
        }
    }


    fun addDirection(direction: Direction) {
        println(this.description)
        println(direction.description)
    }

    abstract fun symbol(): Char
    abstract val symbol: Char
}

fun main() {
    val north = Direction.NORTH

//    println(north.ordinal)
//    println(north.name)
//    println(north.description)
//
//    north.addDirection(Direction.EAST)
//
//    Direction.sumDirection(
//        Direction.NORTH, Direction.SOUTH
//    )

    // entries

    Direction.entries.forEach {
        println(it.symbol() + " | " + it.symbol)
    }

    // valueOf

    println(Direction.valueOf("SOUTH").ordinal)

}