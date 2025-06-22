

class DescontoCliente(val desconto: Double){

    private var valordacompra: Double = 0.0

    fun infoinput(){

        print("Digite o valor total da compra:")
        val valorinput = readLine()?.toDouble()?: 0.0
        valordacompra = valorinput
    }

    fun matematicadesconto(){

        val matematica = valordacompra * (desconto/100)
        val descontofinal = valordacompra - matematica

        if (valordacompra >= 100.00){

            println("O valor total é: ${descontofinal}")
        }else {
            println("O valor é: ${valordacompra}")
        }
    }
}

fun main(){

    val valordacomprafinal = DescontoCliente(15.0)
    valordacomprafinal.infoinput()
    valordacomprafinal.matematicadesconto()

}