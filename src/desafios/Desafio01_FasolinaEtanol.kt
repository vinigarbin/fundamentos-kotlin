package desafios

fun calculaMelhorCombustivel(precoGasolina: Double, precoEtanol: Double) {
    val calc = precoEtanol / precoGasolina;

    when {
        calc < 0.7 -> println("Etanol é a melhor opção")
        calc > 0.7 -> println("Gasolina é a melhor opção")
        else -> println("Ambos combustiveis são boas opções")
    }
}


fun main() {
    println("Insira o preço por litro da GASOLINA:")
    println("R$ ")
    val precoGasolina = readln()?.toDoubleOrNull()


    println("Insira o preço do litro de ETANOl:")
    println("R$ ")
    val precoEtanol = readln()?.toDoubleOrNull()

    if (precoGasolina == null || precoEtanol == null) {
        println("Os valores inseridos são invalidos")
        return
    }

    calculaMelhorCombustivel(precoGasolina, precoEtanol)
}