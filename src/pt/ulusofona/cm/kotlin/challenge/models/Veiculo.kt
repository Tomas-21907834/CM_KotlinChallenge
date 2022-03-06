package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.Posicao

class Veiculo(var identificador: String,var posicao: Posicao) {


       var dataDeAquisicao : Date = Date()


    fun requerCarta(): Boolean {
        return false
    }

}