//Exercicios

fun main() {
    val numerosVerdes = listOf(1, 4, 23)
    val numerosVermelhos = listOf(17, 2)
    println("O total de numeros é ${numerosVerdes.size + numerosVermelhos.size}")
}

fun main() {
    val SUPORTADO = setOf("HTTP", "HTTPS", "FTP")
    val requisitado = "smtp"
    val ehSuportado = requisitado in SUPORTADO
    println("Suporte para $requisitado: $ehSuportado")
}

fun main() {
    val numeroParaPalavra = mapOf(0 to "zero", 1 to "um", 2 to "dois")
    val n = 2
    println("$n por extenso é '${numeroParaPalavra[n]}'")
}