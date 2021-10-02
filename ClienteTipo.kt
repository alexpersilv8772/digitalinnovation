package one.digitalinnovation.digonebank


//ENUM -> É um tipo de classe que tem um conjunto de valores constantes.
//Pode ter construtor. Pode ter funções e propriedades.
//Não pode herdar de classes, apenas de interfaces.

enum class ClienteTipo (val descricao: String) {
    PF("Pessoa Física"), //Criou objetos com seus tipos dentro da ENUM
    PJ("Pessoa Jurídica"); //Criou objetos com seus tipos dentro da ENUM

}