fun comprimentoString(talvezString : String?): Int? = talvezString?.length
fun main() {
    var stringNula : String = null
    println(comprimentoString(stringNula))
}