package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.Posicao

class Bicicleta(var identificador: String) {

    var veiculo = Veiculo("renault twingo", Posicao(0,0))
    var posicao = Posicao(0,0)


    override fun toString(): String {
        return "${Bicicleta::class.simpleName?.capitalize()} | $identificador | ${veiculo.dataDeAquisicao} | $posicao"
    }
}