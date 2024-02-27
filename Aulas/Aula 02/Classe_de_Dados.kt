/* Classe de dados
        Classe para armazenar dados que contém 
        alguns métodos(funções membros) conveniente 
        para lidar com dados
*/

data class Usuario(val nome : String, val id : Int)
/* Métodos dentro da classe de dados
    - .toString() - imprime uma string legível da instância da classe
                    e suas propriedades
    - .equals() - compara duas instâncias de classes
    - .copy() cria uma nova instância a partir de outra já existente
*/

fun main() {
    val kaique = Usuario(nome = "Kaique", id = 1)
    println(kaique)
    val matheus = Usuario(nome = "Matheus", id = 2)
    println(matheus)
    println(kaique.toString())
    println("${kaique == matheus}")
    val guilherme = kaique.copy()
    println(kaique == guilherme)
    println(guilherme.equals(kaique))
}