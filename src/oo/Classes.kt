package src.oo

class Pessoa2 (var nome: String, val anoNascimento: Int){
    fun saudacao(){
        println("Olá, meu nome é $nome")
    }
}

fun main(){

    val maquina: Maquina = Maquina("TESTE")

    maquina.getMarca();
}