package aula_09_operadores_matematicos

import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.log10
import kotlin.math.pow
import kotlin.math.roundToInt

fun main() {
    val num = 4
    val num2 = 2

    println(num + num2)
    println(num - num2)
    println(num * num2)
    println(num / num2)
    println(num % num2)

    // incremento
    var num3 = 10
    var num4 = 20

    num3++
    num4--

    println(num3)
    println(num4)

    // atribuição composta

    var num5 = 1

    num5 += num
    println(num5)

    num5 -= num
    println(num5)

    num5 *= num
    println(num5)

    num5 /= num
    println(num5)

    num5 %= num
    println(num5)

    // biblioteca math

    val value = 2.567

    val valueRounded = value.roundToInt()
    println(valueRounded)

    val valueFloor = floor(value)
    println(valueFloor)

    val valueCeil = ceil(value)
    println(valueCeil)

    val base = 2.0
    val exponent = 3.0
    val valuePow = base.pow(exponent)
    println(valuePow)

    val logValue = log10(100.0)

    println(logValue)

}