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

        System.out.print("\n--- Cliente ---");
        Cliente cliente01 = new Cliente("Jesus", "jesus@gmail.com", 30, "3537");
        cliente01.imprimirDados();

        System.out.print("\n--- Funcionário ---");
        Funcionario funcionario01 = new Funcionario("Amaral", "amaral@gmail.com", 20, "Almoxarifado");
        funcionario01.imprimirDados();

    }

}
