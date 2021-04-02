package mp.dio.diobank

class Autenticacao {
    companion object {
        fun autentica(logavel: Logavel) = println(logavel.login())
    }
}