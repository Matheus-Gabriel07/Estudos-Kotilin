// Classe genérica

/*class PreencherEspacoEmBranco(
	val textoDaQuestao : String,
    val resposta : String,
    val dificuldade : String
)

class VerdadeiroEFalso(
	val textoDaQuestao : String,
    val resposta : Boolean,
    val dificuldade : String
)

class Numerico (
	val textoDaQuestao : String,
    val resposta : Int,
    val dificuldade : String
)*/

class Pergunta<T>(
	val textoDaQuestao : String,
    val resposta : T,
    val dificuldade : String
)

fun main(){
    val pergunta1 = Pergunta<String>("Quem invadiu o Brasil foi __________", "Pedro Álveres Cabral", "Fácil")
    val pergunta2 = Pergunta<Boolean>("Verdadeiro ou falso: O Palmeiras tem mundial?", false, "Fácil")
    val pergunta3 = Pergunta<Int>("Quantos dias existem entre duas luas cheias", 30, "Médio")
}