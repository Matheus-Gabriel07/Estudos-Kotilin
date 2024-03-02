/* Sistema de Gerenciamento de Livros
    Crie um programa em Kotlin que simule um sistema de gerenciamento de livros. Implemente 
    uma classe `Livro` com atributos como título, autor e ano de publicação. Em seguida, 
    desenvolva uma classe `Biblioteca` que permita adicionar, remover, listar e buscar livros. 
    No programa principal (`fun main()`), demonstre o uso dessas classes adicionando livros, 
    removendo um livro, listando todos os livros e realizando uma busca por título. Utilize 
    conceitos como classes, métodos, listas e estruturas de controle de fluxo.
*/

data class Livro(val titulo : String, val autor : String, val anoPublicado : Int){}

class Biblioteca() {
    val catalogoLivros = mutableListOf<Livro>()
    
    fun adicionarLivro(livro:Livro) {
        catalogoLivros.add(livro)
        println("Livro ${livro.titulo} adicionado com sucesso!")
    }
    
    fun removerLivro(livro:Livro){
        if(catalogoLivros.contains(livro)){
            catalogoLivros.remove(livro)
            println("Livro ${livro.titulo} removido com sucesso!")
        } else {
            println("Esse livro não existe!")
        }
    }
    
    fun listarLivro(){catalogoLivros.forEach { println("${it.titulo} - ${it.autor} (${it.anoPublicado})") }}
    
    fun buscarLivroPorTitulo(titulo: String) {
    val livrosEncontrados = catalogoLivros.filter { it.titulo == titulo }

    if (livrosEncontrados.isNotEmpty()) {
        println("Livro encontrados com o título '$titulo':")
        livrosEncontrados.forEach { println("${it.titulo} - ${it.autor} (${it.anoPublicado})") }
    } else {
        println("Nenhum livro encontrado com o título '$titulo'.")
    }
}
}

fun main() {
    val biblioteca = Biblioteca()
    val livro1 = Livro("A Viagem do Peregrino da Alvorada", "C.S. Lewis", 1952)
    val livro2 = Livro("O Código Da Vinci", "Dan Brown", 2003)
    val livro3 = Livro("A Menina que Roubava Livros", "Markus Zusak", 2005)
    val livro4 = Livro("O Hobbit", "J.R.R. Tolkien", 1937)
    val livro5 = Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 1997)
    
    biblioteca.adicionarLivro(livro1)
    biblioteca.adicionarLivro(livro2)
    biblioteca.adicionarLivro(livro3)
    biblioteca.buscarLivroPorTitulo(livro5.titulo)
    biblioteca.adicionarLivro(livro4)
    biblioteca.removerLivro(livro4)
    biblioteca.adicionarLivro(livro5)
    biblioteca.buscarLivroPorTitulo(livro1.titulo)
    biblioteca.listarLivro()
}