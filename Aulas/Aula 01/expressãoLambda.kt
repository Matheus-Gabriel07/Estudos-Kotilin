//Expressões lambda

fun converterMaiuscula(s : String) : String {
    return s.uppercase()
}

fun teste1() {
    println(converterMaiuscula("kai"))
    println({s : String -> s.uppercase()}("oi"))
}

//Atribuida a uma variavel
//passada como parametro para outra função
//retornada por uma função
//auto-invocada

//Atribuindo uma expressão lambda a uma variavel
fun teste2() {
    val maiusculaConvertida = {s : String -> s.uppercase()}
    //println(maiusculaConvertida())
}

//passando uma expressão lambda para outra expressão
fun teste3() {
    val num = listOf(1,-2,3,-4,5,-6)
    val pos = num.filter({x -> x > 0})
    val neg = num.filter({x -> x < 0})
    println(pos)
    println(neg)
    
    val duplo = num.map({x -> x * 2})
    val tripo = num.map({x -> x * 3})
    println(duplo)
    println(tripo)
}

//Retornando uma expressão lambda
//(Int) -> Int == retorna uma expressão lambda que recebe um argumento e retorna ele
fun paraSegundos(tempo : String) : (Int) -> Int = when(tempo) {
    "hora" -> {valor -> valor * 60 * 60}
    "minuto" -> {valor -> valor * 60}
    "segundo" -> {valor -> valor}
    else -> {valor -> valor}
}

fun teste4() {
    val tempoEmMinutos = listOf(2,10,15,1)
    val minSeg = paraSegundos("minuto")
    val tempoTotalSegundos = tempoEmMinutos.map(minSeg).sum()
    println("O tempo total é $tempoTotalSegundos segundos")
}

fun main() {
    //expressão lambda com função autoexecutavel
    println({s : String -> s.uppercase()}("oia"))
}