package one.digitalinnovation.digonebank


//ENUM -> É um tipo de classe que tem um conjunto de valores constantes.
//Pode ter construtor. Pode ter funções e propriedades.
//Não pode herdar de classes, apenas de interfaces.

enum class ClienteTipo (descricao: String) {
    PJ("Pessoa Física"), //Criou objetos com seus tipos dentro da ENUM
    PF("Pessoa Jurídica"); //Criou objetos com seus tipos dentro da ENUM

}