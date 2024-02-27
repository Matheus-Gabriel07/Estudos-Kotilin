// Exercicio 05
// Conside o seguinte código
data class Empregado(val nomeFuncionario : String, var salario : Int = 1200){}

fun main(){
  val emp = Empregado("Dimas",5000)  
  println(emp)
  emp.salario += 500
  println(emp)
}