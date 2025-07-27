package src.br.com.geekuniversity.secao03.estruturaDecisao.src;

import java.util.Scanner;



 /*
  * Estrutura de decisão compreende conceitos relacionados a
  * If, else, if-else-if e switch case
  *
  * Exercício 03
  *
  *
  * */

public class numeroMaiorEMenor {


    public static void main(String[] args) {

        double primeiroNumero, segundoNumero;

        Scanner teclado = new Scanner(System.in);

        System.out.print("\nInsira o valor do primeiro número: ");
        primeiroNumero = teclado.nextDouble();

        System.out.print("\nInsira o valor do segundo número: ");
        segundoNumero = teclado.nextDouble();


        if (primeiroNumero > segundoNumero)
            System.out.print("\nO maior número informado foi o primeiro que é igual a: " + primeiroNumero);
        else if (segundoNumero > primeiroNumero)
            System.out.print("\nO maior número informado foi o segundo que é igual a: " + segundoNumero);
        else if (primeiroNumero == segundoNumero)
            System.out.print("\nOs valores informados são iguais, não foi possível comparar!");




    }

}
