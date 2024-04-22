data class Pergunta<T>(
	val textoDaQuestao : String,
    val resposta : T,
    val dificuldade : Dificuldade
)

enum class Dificuldade{FÁCIL, MÉDIO, DIFÍCIL}

class Quiz : ProgressoImpresso {
    val pergunta1 = Pergunta<String>("Quem invadiu o Brasil foi __________", "Pedro Álveres Cabral", Dificuldade.FÁCIL)
    val pergunta2 = Pergunta<Boolean>("Verdadeiro ou falso: O Palmeiras tem mundial?", false, Dificuldade.MÉDIO)
    val pergunta3 = Pergunta<Int>("Quantos dias existem entre duas luas cheias", 30, Dificuldade.DIFÍCIL)
    
    override val textoProgresso : String
    	get() = "${Quiz.realizado} em ${Quiz.total} realizados"
    
    override fun imprimirBarraProgresso() {
        repeat(Quiz.realizado){print("█")}
        repeat(Quiz.total - Quiz.realizado) {print("░")}
        println()
        println(textoProgresso)
    }
    
    companion object ProgressaoAluno {
    	var total : Int = 10
    	var realizado : Int = 3
	}
    
    fun imprimeQuiz(){
        pergunta1.let {
            println(it.textoDaQuestao)
            println(it.resposta)
            println(it.dificuldade)
        }
        println()
        
        pergunta2.let {
            println(it.textoDaQuestao)
            println(it.resposta)
            println(it.dificuldade)
        }
        println()
        
        pergunta3.let {
            println(it.textoDaQuestao)
            println(it.resposta)
            println(it.dificuldade)
        }
        println()
    }
}

interface ProgressoImpresso{
	val textoProgresso : String
    fun imprimirBarraProgresso()
}

fun main(){
    Quiz().imprimirBarraProgresso()
    //val quiz  = Quiz()
    //quiz.imprimeQuiz()
	Quiz().apply{imprimeQuiz()}
}