package one.digitalinnovation.digonebank

//import java.math.BigDecimal //Importa da biblioteca Java Math o tipo de vriável BigDecimal

abstract class Funcionario( //Classe abstrata ou classe mãe. A referida classe não instancia.
    name: String,
    cpf: String,
    val salario: Double
) : Pessoa(name, cpf) {
    protected abstract fun calculoAuxilio(): Double

    override fun toString(): String = """
        Nome: $name
        Cpf: $cpf
        Salario: $salario
        Auxilio: ${calculoAuxilio()}
    """.trimIndent() //trimIndent -> Detecta um recuo mínimo comum de todas as linhas de entrada,
// remove-o de todas as linhas e também remove a primeira e a última linhas se estiverem em branco
// (observe a diferença em branco versus vazio
}