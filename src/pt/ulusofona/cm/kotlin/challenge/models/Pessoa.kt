package pt.ulusofona.cm.kotlin.challenge.models


class Pessoa(var nome: String, var dataDeNascimento: Date) {


    var veiculos = mutableListOf<Veiculo>()

    var posicao = Veiculo("BIMA", Posicao(0,0))
    var temCarta = false;
    var idade: Int = 18




    fun comprarVeiculo(veiculo: Veiculo) {
       veiculos.add(veiculo)

    }

    fun pesquisarVeiculo(idenficador: String): Veiculo? {
        for (veiculo in veiculos) {
            if (idenficador == veiculo.identificador) {
                return veiculo
            }
        }

        return null

    }

    fun venderVeiculo(idenficador: String, comprador: Pessoa) {
        for (veiculo in veiculos) {
            if (idenficador == veiculo.identificador) {
                comprador.comprarVeiculo(veiculo)
                veiculos.remove(veiculo)
            }
        }

    }

    fun moverVeiculoPara(idenficador: String, x: Int, y: Int) {

    }

    fun temCarta(): Boolean {
       return temCarta
    }

    fun tirarCarta(): Boolean {
        if (idade < 18) {
            return false
        }
        return true
    }


    override fun toString(): String {
        return "${Pessoa::class.simpleName?.capitalize()} | $nome | idk | ${posicao.dataDeAquisicao}"
    }


}







