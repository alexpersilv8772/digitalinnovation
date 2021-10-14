package one.digitalinnovation.digonebank

class Gerente (name: String,
              cpf: String,
              salario: Double
) : Funcionario (name, cpf, salario) {
    override fun calculoAuxilio(): Double = salario * 0.4
}