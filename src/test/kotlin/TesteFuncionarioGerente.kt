import mp.dio.diobank.Autenticacao
import mp.dio.diobank.Gerente
import mp.dio.diobank.ImprimeRelatorio

fun main() {
    val mp = Gerente("marcos", "1023012312321", 5040.00, "senha123")

    ImprimeRelatorio.imprime(mp)
    Autenticacao.autentica(mp)
}



