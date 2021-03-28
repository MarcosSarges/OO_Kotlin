package mp.dio.diobank

class Pessoa {
    var nome:String = "Marcos"
    var cpf:String = "123.456.789-99"
}


fun main(){

    val MP = Pessoa()

    println(MP.cpf +" "+ MP.nome)

}
