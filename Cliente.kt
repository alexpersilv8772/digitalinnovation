package one.digitalinnovation.digonebank

class Cliente (name: String,
               Cpf: String,
               val ClienteTipo: ClienteTipo,
               val senha: String
) : Pessoa(name, Cpf), Logavel {
    override fun login(): Boolean = "123456" == senha

    override fun toString(): String = """
        Nome:     $name
        Cpf:      $cpf
        Tipo:     ${ClienteTipo.descricao}
    """.trimIndent() //trimIndent -> Detecta um recuo mínimo comum de todas as linhas de entrada,
// remove-o de todas as linhas e também remove a primeira e a última linhas se estiverem em branco
// (observe a diferença em branco versus vazio
}
