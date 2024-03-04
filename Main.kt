//Valores nunca nulos

fun main() {
    var nuncaNulo : String = "Nunca pode estar nulo"
    //nuncaNulo = null - isso acarreta um erro
    
    /*String? - Talvez string - Variavel nulável. Se for atribuido nulo,
      não ira acontecer um erro na execução do programa
    */
    var nulavel : String? = "Isso pode ser nulo"
    nulavel = null
    
    var stringNula = null
    println(descreverString(stringNula))
}

fun descreverString(talvezString:String?):String {
    if(talvezString != null && talvezString.length > 0){
        return "String de comprimento ${talvezString.length}"
    } else {
        return "String nula ou vazia"
    }
}