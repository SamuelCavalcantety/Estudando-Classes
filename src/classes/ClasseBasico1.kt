package classes



class Pessoa (nomeinicial: String){

    val nome: String = nomeinicial


    /*
        O fato do nomeinicial de não ter sido inicializado como val ou var
        faz com que ele não se torne um atributo de instância.
        Ou seja, ele não fica disponível quando um objeto é criado.
        O atributo estará disponível apenas internamente no construtor
        ou no processo de inicialização. Para acessá-lo,
        é necessário o uso do bloco init.

         */
}

fun main(){

    val p = Pessoa("Samuel")


}