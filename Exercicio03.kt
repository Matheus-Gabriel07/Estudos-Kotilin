fun main(){
        val acoes = listOf("titulo", "ano", "autor")
        val prefixo = "http://exemplo.com.br/info"
        val id = 5
        val urls = acoes.map({item -> "$prefixo/$id/$item"})
        println(urls)
}
