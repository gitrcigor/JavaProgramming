package src.br.com.geekuniversity.secao12.classesAbstratas;

//Aula 68
//Classes abstratas
//É um recurso que proporciona um bloqueio na criação de objetos.
//Não conseguimos instanciar objetos de uma classe abstrata.

import src.br.com.geekuniversity.secao11.herancaEPolimorfismo.Pessoa;

public class Programa31 {

    public static void main(String[] args) {

        //Conforme exemplo abaixo, uma classe abstrata não pode ser instanciada, ela, seus atributos e métodos servem
        //apenas como referência para ser utilizado pelas subclasses
        Usuario usuario = new Usuario("José", "zezin@hotmail.com", 76);

        usuario.imprimirDados("José", "zezin@hotmail.com", 76);


    }

}
