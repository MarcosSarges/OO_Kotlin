package mp.dio.diobank

class Gerente(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(nome, cpf, salario) {

    override fun calcAuxilio(): Double = salario * 0.4
}