package betta.andro.bank

class Pessoa {
    var nome: String = "carlos"
    var cpf: String = "123.456.789-22"
}

fun main() {
    val carlos = Pessoa();

    println(carlos.nome)
    println(carlos.cpf)

}