package one.digitalinnovation.digonebank.teste

import one.digitalinnovation.digonebank.Analista
import one.digitalinnovation.digonebank.Funcionario
import one.digitalinnovation.digonebank.Gerente
import one.digitalinnovation.digonebank.Pessoa
import java.math.BigDecimal

fun main () {
    val Maria = Gerente(name = "Maria da Silva", cpf = "0101010789-15", salario = 5000.0)
    ImprimeRelatorioFuncionario.imprime(Maria)
}

