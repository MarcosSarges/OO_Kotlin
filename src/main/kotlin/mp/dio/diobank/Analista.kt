package mp.dio.diobank

class Analista(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(nome, cpf, salario) {

    override fun calcAuxilio() = salario * 0.1
}