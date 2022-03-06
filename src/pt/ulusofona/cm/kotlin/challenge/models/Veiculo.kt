package pt.ulusofona.cm.kotlin.challenge.models

class Veiculo(var identificador: String,var posicao: Posicao) {


       var dataDeAquisicao : Date = Date()


    fun requerCarta(): Boolean {
        return false
    }

}