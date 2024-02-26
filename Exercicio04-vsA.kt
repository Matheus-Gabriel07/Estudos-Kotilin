//Exercio 4 - versão alternativa

fun repetir(n: Int = 0, funcao: () -> Unit){
    var i = 0
    while(i != n) {
        println("!")
        i++
    }
}

fun main(){
    repetir(3){}
}