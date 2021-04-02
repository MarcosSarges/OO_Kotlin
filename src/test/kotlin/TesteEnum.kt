import mp.dio.diobank.ClienteTipo

fun main() {
    ClienteTipo.values().forEach { el ->
        println("$el - ${el.descricao}")
    }

    val pf = ClienteTipo.PF

    println(pf.descricao)
}