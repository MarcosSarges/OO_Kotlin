package mp.dio.diobank

class Pessoa {
    var nome: String = "Marcos"

    var cpf: String = "123.456.789-99"
        private set
}


fun main() {
    val mp = Pessoa()

    println(mp.cpf + " " + mp.nome)

}
