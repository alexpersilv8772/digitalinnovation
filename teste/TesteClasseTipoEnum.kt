package one.digitalinnovation.digonebank.teste

import one.digitalinnovation.digonebank.ClienteTipo

fun main(){
    ClienteTipo.values().forEach { elemento -> //-> Separador de código
        println("${elemento.name} - ${elemento.toString()}")
    }

    ClienteTipo.values().forEach {
        println("${it.name} - ${it.toString()}")
    }

}