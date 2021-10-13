package one.digitalinnovation.digonebank

import java.math.BigDecimal //Importa da biblioteca Java Math o tipo de vriável BigDecimal

abstract class Funcionario ( //Classe abstrata ou classe mãe. A referida classe não instancia.
    name: String,
    cpf: String,
    val salario: BigDecimal
    ) : Pessoa(name, cpf) {
        abstract fun calculoAuxilio()
}