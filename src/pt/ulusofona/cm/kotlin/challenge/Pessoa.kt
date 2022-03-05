package pt.ulusofona.cm.kotlin.challenge


class Pessoa(var nome: String,var dataDeNascimento: String){





    override fun toString(): String {
        return "${Pessoa::class.simpleName?.capitalize()} | $nome | $dataDeNascimento."
    }







}







