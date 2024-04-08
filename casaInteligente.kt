/* Exercício - Classes no Kotlin
 * @author Matheus Gabriel
 */

open class DispositivoInteligente(val nome : String, val categoria : String, val tipoDispositivo : String) {
    fun imprimirInfoDispositivo(){
        println("$nome, categoria: $categoria, tipo: $tipoDispositivo")
    }
}

open class DispositivoTVInteligente (nome: String, categoria: String, tipoDispositivo: String) :
    DispositivoInteligente(nome, categoria, tipoDispositivo) {
        
    // Volume da televisão
	open var volume = 0
    set(value){
        if(value in 1..100){
            field = value
        }
    }
    fun reduzirVolume(){
        if(volume != 0){
        	volume--
            println("Volume atual: ${volume}")
        } else {
            println("O volume da televisão $nome está no minímo")
        }
    }
    
    fun aumentarVolume(){
        if(volume <= 100){
        	volume++
            println("Volume atual: ${volume}")
        } else {
            println("O volume da televisão $nome está no máximo")
        }
    }
    
    // Canal de televisão
    open var canal = 1
    set(value){
        if(value in 1..600){
            field = value
        }
    }
    
    fun canalAnterior(){
        if(canal != 1){
            canal--
            println("Canal atual: ${canal}")
        } else {
            println("A televisão $nome está no primeiro canal, é somente possivel ver os próximos canais")
        }
    }
    
    fun canalProximo(){
        if(canal <= 600){
            canal++
            println("Canal atual: ${canal}")
        } else {
            println("A televisão $nome está no último canal, é somente possivel voltar canais")
        }
    }
}

open class DispositivoIluminacaoInteligente (nome: String, categoria: String, tipoDispositivo: String) :
    DispositivoInteligente(nome, categoria, tipoDispositivo) {
    open var brilho = 100
    set(value){
        if(value in 1..100){
            field = value
        }
    }
    fun reduzirBrilho() {
        if(brilho != 0){
        	brilho-- 
            println("Brilho atual: $brilho")
        } else {
            println("O brilho da iluminação $nome está no minímo")
        }
    }
    
    fun aumentarBrilho() {
        if(brilho <= 100){
        	brilho++ 
            println("Brilho atual: $brilho")
        } else {
            println("O brilho da iluminação $nome está no máximo")
        }
    }
}

// Classe geral de controle da casa
class CasaInteligente(
    var estadoDispositivo : String = "Desligado", 
        DispositivoTV : DispositivoTVInteligente,
        DispositivoIluminacao: DispositivoIluminacaoInteligente
    ) {
    private val DispositivoTV : DispositivoTVInteligente = DispositivoTV
    private val DispositivoIluminacao : DispositivoIluminacaoInteligente = DispositivoIluminacao
    var contagemDispositivoLigado = 0;
    
    // Configuração do dispositivo - Televisão -
    
    fun reduzirVolumeTV(){
        if(estadoDispositivo.equals("Ligado")){
        	DispositivoTV.reduzirVolume() 
        } else {
            println("Não é possivel fazer essa ação, 'Mudar volume de ${DispositivoTV.nome}'")
        }
    }
    
    fun aumentarVolumeTV(){
        if(estadoDispositivo.equals("Ligado")){
        	DispositivoTV.aumentarVolume() 
        } else {
            println("Não é possivel fazer essa ação, 'Aumentar volume de ${DispositivoTV.nome}'")
        }
    }
    
    fun mudarCanalTVParaAnterior(){
        if(estadoDispositivo.equals("Ligado")){
        	DispositivoTV.canalAnterior()
        } else {
            println("Não é possivel fazer essa ação, 'Mudar canal para anterior de ${DispositivoTV.nome}'")
        }
    }
    
    fun mudarCanalTVParaProximo(){
        if(estadoDispositivo.equals("Ligado")){
        	DispositivoTV.canalProximo()
        } else {
            println("Não é possivel fazer essa ação, 'Mudar canal para o próximo de ${DispositivoTV.nome}'")
        }
    }
    
    // Confiração do dispositivo - Iluminação -
    
    fun reduzirBrilhoIluminacao(){
        if(estadoDispositivo.equals("Ligado")){
        	DispositivoIluminacao.reduzirBrilho()
        } else {
            println("Não é possivel fazer essa ação, 'Diminuir brilho de ${DispositivoIluminacao.nome}'")
        }
    }
    
    fun aumentarBrilhoIluminação(){
        if(estadoDispositivo.equals("Ligado")){
        	DispositivoIluminacao.aumentarBrilho()
        } else {
            println("Não é possivel fazer essa ação, 'Aumentar brilho de ${DispositivoIluminacao.nome}'")
        }
    }
    
    // Saídas sobre as configurações dos dispositivos
    
    fun imprimirInfoTVInteligente(){
        if(estadoDispositivo.equals("Ligado")){
        	contagemDispositivoLigado++
            println("== ${DispositivoTV.nome} == \n"+
                    "Categoria: ${DispositivoTV.categoria} \n"+
                    "Tipo: ${DispositivoTV.tipoDispositivo} \n"+
                    "Canal: ${DispositivoTV.canal} \n"+
                    "Volume: ${DispositivoTV.volume} \n")
        }
    }
    
    fun imprimirInfoIluminacaoInteligente(){
        if(estadoDispositivo.equals("Ligado")){
        	contagemDispositivoLigado++
            println("== Iluminação da casa == \n"+
                    "Nome: ${DispositivoIluminacao.nome} \n" +
                    "Categoria: ${DispositivoIluminacao.categoria} \n" +
                    "Tipo: ${DispositivoIluminacao.tipoDispositivo} \n" +
                    "Brilho: ${DispositivoIluminacao.brilho} \n")
        }
    }
    
    fun imprimirQuantidadeDispositivos(){
        println("${contagemDispositivoLigado} dispositivos ligados")
    }
}

fun main() {
    val tvInteligente = DispositivoTVInteligente("TV Sala", "Eletrônicos", "Smart TV")
    tvInteligente.volume = 50
    tvInteligente.canal = 10

    val iluminacaoInteligente = DispositivoIluminacaoInteligente("Lâmpada Sala", "Iluminação", "LED")
    iluminacaoInteligente.brilho = 80

    val casaInteligente = CasaInteligente("Ligado", tvInteligente, iluminacaoInteligente)

    // Televisão
    casaInteligente.reduzirVolumeTV()
    casaInteligente.mudarCanalTVParaAnterior()
    println()
	casaInteligente.imprimirInfoTVInteligente()
    casaInteligente.aumentarVolumeTV()
    casaInteligente.mudarCanalTVParaProximo()
    
    // Iluminação
    println()
    casaInteligente.reduzirBrilhoIluminacao()
    println()
    casaInteligente.imprimirInfoIluminacaoInteligente()
    casaInteligente.aumentarBrilhoIluminação()
    
    casaInteligente.imprimirQuantidadeDispositivos()
}