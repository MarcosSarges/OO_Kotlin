package mp.dio.diobank

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String
) : Funcionario(nome, cpf, salario), Logavel {

    override fun calcAuxilio(): Double = salario * 0.4
    override fun login(): Boolean = senha == "senha123"
}