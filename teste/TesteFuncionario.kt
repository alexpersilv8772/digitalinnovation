package one.digitalinnovation.digonebank.teste

import one.digitalinnovation.digonebank.Funcionario
import one.digitalinnovation.digonebank.Pessoa
import java.math.BigDecimal

fun main () {
    val suaIdentidade =  Pessoa (name = "Alexandre", cpf = "0101010789-15")
    println(suaIdentidade.name)
    println(suaIdentidade.cpf)

    val joao = Funcionario(name = "Alexandre Silva", cpf = "0101010789-15", BigDecimal.valueOf(2000.0))
    println(joao.name)
    println(joao.cpf)
    println(joao.salario)
}
