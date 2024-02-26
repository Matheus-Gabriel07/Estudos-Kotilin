//Exercio 4

fun repetir(n: Int, funcao: () -> Unit){
    repeat(n){
        funcao()
    }
}

fun main(){
    repetir(3) {
        println("Kamehameha!")
    }
}