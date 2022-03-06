package pt.ulusofona.cm.kotlin.challenge



class Posicao(var x: Int,var y: Int) {


    fun alterarPosicaoPara(x: Int, y: Int) {

        this.x = x
        this.y = y

    }

    override fun toString(): String {
        return "${Posicao::class.simpleName?.capitalize()} | x:$x | y:$y"
    }


}