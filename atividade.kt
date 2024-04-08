val travessuras = { println("Sem gostosuras!") }
val gostosuras = { println("Ganhe uma goloseima") }
fun travessurasOuGosotosuras(ehTravessura : Boolean, gostosuraExtra:((Int) -> String)?): () -> Unit {
    if(ehTravessura){
        return travessuras
    } else {
        if(gostosuraExtra != null){
        	println(gostosuraExtra(5))
        }
        return gostosuras
    }
}

fun main() {
    //val moedas:(Int) -> String = {quantidade -> "$quantidade moedas"}
    val funcaoTravessuras = travessurasOuGosotosuras(true){"$it moedas"}
    val funcaoGostosuras = travessurasOuGosotosuras(false, null)
    repeat(4){
    	funcaoTravessuras()
    }
    funcaoGostosuras()
}