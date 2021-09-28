//TESTE
package one.digitalinnovation.diglonebank.teste

import one.digitalinnovation.diglonebank.Banco //Instancia a classe Banco com seus membros

fun main (){
    val digionebank = Banco(nome = "Digionebank",13)
    println(digionebank.nome)
    println(digionebank.numBco)

    //Um exemplo de alteração dos valores com a declaração VAL
    //val banco2 = digionebank.copy(nome = "DigioneBankCoop", numBco = 14)
    //println(banco2.nome)
    //println(banco2.numBco)

}