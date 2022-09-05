package src.oo

class Pessoa (var nome: String, val anoNascimento: Int)
class Pessoa2 (var nome: String, val anoNascimento: Int){
    fun saudacao(){
        println("Olá, meu nome é $nome")
    }
}

fun main(){
    val pessoa: Pessoa2 = Pessoa2("Gustavo", 1997)
    pessoa.saudacao()
}