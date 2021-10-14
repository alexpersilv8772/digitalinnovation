package one.digitalinnovation.digonebank.teste

import one.digitalinnovation.digonebank.Analista
import one.digitalinnovation.digonebank.Funcionario
import one.digitalinnovation.digonebank.Pessoa
import java.math.BigDecimal

fun main () {
    val joao = Analista(name = "João Pedro", cpf = "0101010789-15", salario = 2000.0)
    ImprimeRelatorioFuncionario.imprime(joao)
}

