import mp.dio.diobank.Analista
import mp.dio.diobank.ImprimeRelatorio

fun main() {
    val mp = Analista("marcos", "1023012312321", 5040.00)

    ImprimeRelatorio.imprime(mp)

}


