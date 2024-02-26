//Exercicio 02

fun IntervaloEmSegundos( horas: Int = 0, minutos: Int = 0 , segundos: Int = 0): Int {
    return (((horas * 60) +minutos) * 60 + segundos)
}
fun main(){
    //1min25s
    println("${IntervaloEmSegundos( minutos = 1, segundos = 25)} segundos")
    
    //2h
    println("${IntervaloEmSegundos(horas = 2)} segundos")
    
    //10min
    println("${IntervaloEmSegundos(minutos = 10)} segundos")
    
    //1h1s
    println("${IntervaloEmSegundos(horas = 1, segundos = 1)} segundos")
}