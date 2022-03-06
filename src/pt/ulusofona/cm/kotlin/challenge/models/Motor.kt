package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.Pessoa

class Motor(var cavalos: Int,var cilindrada: Int) {


    override fun toString(): String {
        return "${Motor::class.simpleName?.capitalize()} | $cavalos | $cilindrada"
    }

}