package desafios

import desafios.ClassificacaoIMC.Companion.gerarClassificacao
import kotlin.math.pow

fun validarPeso(peso: Double?): Boolean {
    return !(peso == null || peso > 300 || peso < 0)
}

fun validarAltura(altura: Double?): Boolean {
    return !(altura == null || altura > 3 || altura < 0)
}

fun calculaIMC(peso: Double, altura: Double): Double {
    return peso / altura.pow(2.0)
}


enum class ClassificacaoIMC(val descricao: String) {
    DESCONHECIDO("Desconhecido"),
    ABAIXO_DO_PESO("Abaixo do peso"),
    PESO_NORMAL("Peso normal"),
    SOBREPESO("Sobrepeso"),
    OBESIDADE_GRAU_I("Obsidade grau I"),
    OBESIDADE_GRAU_II("Obsidade grau II"),
    OBESIDADE_GRAU_III("Obesidade Grau III");

    companion object {
        fun gerarClassificacao(imc: Double): ClassificacaoIMC {
            return when {
                imc < 18.5 -> ABAIXO_DO_PESO
                imc >= 18.5 && imc <= 24.9 -> PESO_NORMAL
                imc >= 25 && imc <= 29.9 -> SOBREPESO
                imc >= 30 && imc <= 34.9 -> OBESIDADE_GRAU_I
                imc >= 35 && imc <= 39.9 -> OBESIDADE_GRAU_II
                imc > 39.9 -> OBESIDADE_GRAU_III
                else -> DESCONHECIDO
            }
        }
    }
}


fun main() {
    println("Informe seu peso em KG:")
    val peso = readln().toDoubleOrNull()

    if (!validarPeso(peso)) {
        println("O valor de peso está incorreto.")
        return
    }


    println("Informe sua altura em metros:")
    val alt = readln().toDoubleOrNull()

    if (!validarAltura(alt)
    ) {
        println("O valor da altura está incorreto.")
        return
    }


    val imc = calculaIMC(peso!!, alt!!)
    var classificacao = gerarClassificacao(imc)

    println(
        "O Seu IMC é ${"%.1f".format(imc)} e sua classificação é ${classificacao.descricao}"
    )
}