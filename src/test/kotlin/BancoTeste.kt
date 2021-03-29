import mp.dio.diobank.Banco

fun main() {
    val dioBank = Banco("DioBank", 1)

    println(dioBank.nome)
    println(dioBank.numero)

    val newDioBank = dioBank.copy("DioBank2")
    println(newDioBank.nome)
    println(newDioBank.numero)
}