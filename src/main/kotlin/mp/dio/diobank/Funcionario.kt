package mp.dio.diobank

abstract class Funcionario(
    nome: String,
    cpf: String,
    val salario: Double
) : Pessoa(nome, cpf) {

    protected abstract fun calcAuxilio(): Double

    override fun toString(): String = """
        Nome: $nome
        CPF: $cpf
        Salario: $salario
        Auxiolio: ${calcAuxilio()}
    """.trimIndent()
}