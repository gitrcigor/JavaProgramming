package src.br.com.geekuniversity.secao11.herancaEPolimorfismo.ExerciciosGeekUniversity.Exercicio02;

/*
* 2. Escreva um código Java que apresente a classe Moto, com atributos marca, modelo, cor e
marcha e os métodos imprimir e trocarMarcha. O método imprimir deve mostrar na tela os
valores de todos os atributos. O método trocarMarcha deverá aumentar ou diminuir a marcha de
acordo com um valor informado. O atributo marcha indica em que marcha a Moto encontra-se no
momento, sendo representado de forma inteira, onde 0 – neutro, 1 – primeira, 2 – segunda, etc.
Adicione um método construtor que permita a definição de todos os atributos no momento da
instanciação do objeto. Crie um construtor para a classe permitindo a definição de todos os
atributos.
*
* */

import java.util.Scanner;

public class ExercicioGeekUniversity02 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String opcao;

        Moto moto1 = new Moto("Honda", "CB500x", "Azul", 6);

        System.out.print("\n--- Dados da Moto ---");

        moto1.imprimir();

        System.out.print("\n");
        System.out.print("\n--- Alterando marcha atual da moto ---");
        moto1.aumentarMarchaDaMoto(moto1.getMarcha());

        System.out.print("\n--- Alterando marcha atual da moto ---");
        moto1.diminuirMarchaDaMoto(moto1.getMarcha());
        System.out.print("\n");

    }
}
