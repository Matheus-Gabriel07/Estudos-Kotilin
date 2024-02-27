fun main() {
    val botao = 'A'
    
    println(
        when(botao) {
            'A' -> "Sim"
            'B' -> "Zero"
            'X' -> "Menu"
            'Y' -> "Nada"
            else -> "Não existe essa ação"
        }
    )
}