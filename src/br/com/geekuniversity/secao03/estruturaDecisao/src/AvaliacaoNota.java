package src.br.com.geekuniversity.secao03.estruturaDecisao.src;

import java.util.Scanner;

/*
 * Estrutura de decisão compreende conceitos relacionados a
 * If, else, if-else-if e switch case
 *
 * Exercício 02
 *
 *
 * */


public class AvaliacaoNota {

    public static void main(String[] args) {

        double nota;


        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira sua nota de 0 a 100 para saber o conceito: ");
        nota = teclado.nextDouble();

        if ((nota >= 0) && (nota <= 100)){

            if (nota >= 90)
                System.out.println("Nota excelente!");
            else if (nota >= 70)
                System.out.println("Conceito bom!");
            else if (nota >= 50)
                System.out.println("Conceito regular!");
            else if (nota >= 0)
                System.out.println("Nota insuficiente!");


        }
        else {
        System.out.println("Nota inválida!");
        AvaliacaoNota.main(null);

        }

    }


}
