class Cliente(val id : Int, var email : String = "fulano@exemplo.com") {
    val categoria : String = "trabalho"
    
    fun imprimirId() {
        println(id)
    }
    
    fun imprimirEmail() {
        println(email)
    }
}

fun main() {
    val cliente = Cliente(1, "rafael@exemplo.com")
    println(cliente.id)
    println("A identidade do cliente é ${cliente.id}, e o email é ${cliente.email}")
    cliente.imprimirId()
    cliente.imprimirEmail()
}