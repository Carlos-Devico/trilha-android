package betta.andro.bank

class Pessoa {
    var nome: String = "carlos"
    var cpf: String = "123.456.789-22"

    inner class Endereco{
        var rua: String = "Rua teste"
    }
}

fun main() {
    val carlos = Pessoa();

    println(carlos.nome)
    println(carlos.cpf)
    println(carlos.Endereco().rua)

}