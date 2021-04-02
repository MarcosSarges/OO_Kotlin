import mp.dio.diobank.Autenticacao
import mp.dio.diobank.Cliente
import mp.dio.diobank.ClienteTipo

fun main() {
    val mp = Cliente("marcos", "1023012312321", ClienteTipo.PF, "senha12345")

    Autenticacao.autentica(mp)
    println(mp)
}