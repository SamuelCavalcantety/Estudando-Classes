package classes

 class Cliente{

     val nome: String = "Samuel"

 }

fun main (){

    val c: Cliente = Cliente()
    c.nome

    println("Olá, ${c.nome}")
}
    /*Comecei declarando uma classe com o nome Cliente e, dentro do seu escopo,
    defini uma constante chamada nome do tipo String.
    Em seguida, tentei inicializar essa constante com um valor.
    O foco não é entender os construtores, mas sim o conceito de objeto.
    Ao criar uma classe, para usá-la efetivamente,
    foi necessário instanciá-la, ou seja, criar um objeto baseado nessa classe.

    Para isso, declarei uma constante c e atribuí a ela um valor do tipo Cliente.
    Dessa forma, a constante c se tornou um objeto da classe Cliente. Com isso,
    percebi que estou, na prática, criando meu próprio tipo por meio da classe, e através
    desse tipo consigo acessar os atributos e comportamentos definidos dentro da classe
    utilizando o operador ponto (.). */


