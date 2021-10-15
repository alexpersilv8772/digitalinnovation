package one.digitalinnovation.digonebank.teste

import one.digitalinnovation.digonebank.Cliente
import one.digitalinnovation.digonebank.ClienteTipo

fun main() {
    val jose = Cliente(
        name = "José da Silva",
        Cpf = "0102030405-17",
        ClienteTipo = ClienteTipo.PF,
        senha = "123456"
    )

    println(jose)

    TesteAutenticacao().Autenticar(jose)
}