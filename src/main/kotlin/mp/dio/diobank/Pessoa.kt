package mp.dio.diobank

class Pessoa {

    var nome: String = "Marcos"

    var cpf: String = "123.456.789-99"
        private set

    constructor() {

    }

    fun pessoaInfo() = "$nome e $cpf"
}


fun main() {
    val mp = Pessoa()

    println(mp.pessoaInfo())

}
