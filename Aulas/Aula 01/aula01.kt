fun main() {
    val d: Int
    val check = true
    if(check) {
        d = 1
    } else {
        d = 2
    }
    println(d)
    val a = 1
    val b = 2
    println(if(a > b) a else b)
    val obj = "Hi!"
    // COmo instrução não obrigatorio
    when(obj) {
        "1" -> println("Um")
        "Hi!" -> println("Saldação")
        else -> println("Desconhecido")
    }
    // Como exepressão, else obrigatorio
    val resultado = when(obj) {
        "1" -> "Um"
        "Hi!" -> "Saldação"
        else -> "Desconhecido"
    }
    println(resultado)
    val temperatura = 25
    val descricao =  when {
        temperatura < 20 -> "Muito frio"
        temperatura < 22 -> "Frio"
        temperatura < 25 -> "Bom"
        else -> "Quentinho"
    }
    println(descricao)
}