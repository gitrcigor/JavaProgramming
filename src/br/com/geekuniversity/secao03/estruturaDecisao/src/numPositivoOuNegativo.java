package src.br.com.geekuniversity.secao03.estruturaDecisao.src;

import java.util.Scanner;

/*
 * Estrutura de decisão compreende conceitos relacionados a
 * If, else, if-else-if e switch case
 *
 * Exercício 04
 *
 *
 * */

public class numPositivoOuNegativo {

    public static void main(String[] args) {

    int numeroInteiro;

    Scanner teclado = new Scanner(System.in);

        System.out.print("\nInsira um número inteiro para validar se positivo ou negativo: ");
        numeroInteiro = teclado.nextInt();


        if (numeroInteiro > 0)
            System.out.print("\nA raiz desse número é: " + Math.sqrt(numeroInteiro));
        else if (numeroInteiro < 0)
            System.out.print("\nO número é invalido!");
        else if (numeroInteiro == 0)
            System.out.print("\nO número só pode ser positivo ou negativo, não igual a zero!");

    }


}
