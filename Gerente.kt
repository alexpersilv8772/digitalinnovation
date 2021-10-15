package one.digitalinnovation.digonebank

class Gerente (name: String,
              cpf: String,
              salario: Double,
              val senha: String
) : Funcionario (name, cpf, salario), Logavel { //:Funcionario ((name, cpf, salario)) Herança da classe abstrata Funcionario.
    override fun calculoAuxilio(): Double = salario * 0.4

    override fun login(): Boolean = "senha123" == senha //Booleano (falso ou verdadeiro)

}
