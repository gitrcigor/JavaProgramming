import java.util.Scanner;

/*
 * Estrutura de decisão compreende conceitos relacionados a
 * If, else, if-else-if e switch case
 *
 * Exercício 05
 *
 *
 * */


public class numParOuImpar {

    public static void main(String[] args) {

    int numeroDigitado;

    Scanner teclado = new Scanner(System.in);

        System.out.print("\nDigite um número positivo: ");
        numeroDigitado = teclado.nextInt();


        if (numeroDigitado % 2 == 0)
            System.out.println("O número é par!");
        else
            System.out.println("O número é ímpar!");



    }


}
