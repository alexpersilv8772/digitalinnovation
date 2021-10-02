package one.digitalinnovation.digonebank.teste

import one.digitalinnovation.digonebank.ClienteTipo

fun main(){
    ClienteTipo.values().forEach { elemento -> //-> Separador de código
        println("${elemento.name} - ${elemento.descricao}")
    }

    ClienteTipo.values().forEach {
        println("${it.name} - ${it.descricao}") //it: nome implícito de um único parâmetro
    }

    val pf = ClienteTipo.PF
    println(">>${pf.name} - ${pf.descricao}")

    val pj = ClienteTipo.PJ
    println(">>${pj.name} - ${pj.descricao}")


}