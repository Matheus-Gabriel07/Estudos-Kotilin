// Exercicio 06

import kotlin.random.Random
data class Empregado(val nome : String, var salario : Int){}

class GeradorEmpregadoAlatorio(var salarioMin : Int = 0, var salarioMax : Int = 0) {
    val listaFunc = listOf("Ricardo", "Amanda", "Rafael", "Matheus")
    fun gerarEmpregado() : Empregado {
        var nomeSorteado = (0..(listaFunc.size -1)).random()
        var salario = (salarioMin..salarioMax).random()
        val empregado = Empregado(listaFunc[nomeSorteado], salario)
        return empregado
    }
}

fun main() {
    val emGen = GeradorEmpregadoAlatorio(10000,30000)
    println(emGen.gerarEmpregado())
    println(emGen.gerarEmpregado())
    println(emGen.gerarEmpregado())
    emGen.salarioMin = 15000
    emGen.salarioMax = 50000
    println(emGen.gerarEmpregado())
}