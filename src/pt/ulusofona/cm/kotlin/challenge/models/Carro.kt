package pt.ulusofona.cm.kotlin.challenge.models

class Carro(var identificador: String, var motor: Motor) {

    var posicao = Posicao(0,0)
    var veiculo = Veiculo("audi", Posicao(0,0))

    override fun toString(): String {
        return "${Carro::class.simpleName?.capitalize()} | $identificador | ${veiculo.dataDeAquisicao} | $posicao"
    }

}