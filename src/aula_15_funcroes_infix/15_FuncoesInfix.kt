package aula_15_funcroes_infix

infix fun Int.sum(num: Int): Int = this + num

class XY(val x: Int, val y: Int) {
    infix fun sum(xy: XY): XY {
        return XY(x = this.x + xy.x, y = this.y + xy.y)
    }
}

fun main() {

    println(1 sum 2)

    val xy = XY(x = 1, y = 2) sum XY(x = 2, y = 1)
    println(xy.x)
    println(xy.y)

}