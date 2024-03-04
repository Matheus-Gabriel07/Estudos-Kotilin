//Considere o código abaixo:

data class Empregado( val nome: String, var salario: Int)

fun empregadoPeloId(id: Int) = when (id){
    1 -> Empregado( "Inácio", 4000 )
    2 -> null
    3 -> Empregado( "Bráulio", 5000 )
    4 -> Empregado( "Emengarda", 6000 )
    else -> null
}

fun main() {
    println((1..5).sumOf { id -> salarioPeloId( id ) })
}

//Escreva uma função salarioPeloId() que retorne zero (0) se o empregado não estiver no banco de dados
fun salarioPeloId( id: Int) : Int = empregadoPeloId(id)?.salario ?: 0