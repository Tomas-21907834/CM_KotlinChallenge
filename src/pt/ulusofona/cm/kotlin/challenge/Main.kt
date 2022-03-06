package pt.ulusofona.cm.kotlin.challenge

import pt.ulusofona.cm.kotlin.challenge.models.*


fun main() {



    val bicicleta = Bicicleta("troti")
    println(bicicleta.toString())

    val carro = Carro("merci", Motor(1200,6500))
    println(carro.toString())

    val pessoa = Pessoa("eu", Date())
    println(pessoa.toString())

    val posicao = Posicao(0,0)
    println(posicao.toString())

    val motor = Motor(95,1149)
    println(motor.toString())






}





