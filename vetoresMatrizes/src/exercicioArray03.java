import java.util.Arrays;
import java.util.Scanner;

// Exercício 03
// https://ramonrdm.wordpress.com/wp-content/uploads/2011/09/lista6-ine5402-ine5603.pdf

//
//Escreva um main Java que solicita 5 valores ao usuário, armazena esses valores em um array chamado
//vet1 de inteiros. Depois, copia o conteúdo desse array para um segundo array chamado vet1. O
//programa deve imprimir os dois arrays na tela.

// Doc sobre lib Arrays
// https://docs.oracle.com/javase/8/docs/api/?java/util/Arrays.html

// + exercícios sobre array
//https://www.javatpoint.com/array-in-java


public class exercicioArray03 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int vet1Inteiros[] = new int[4];
        int vet1[] = new int[4];


        for (int i = 0; i < vet1Inteiros.length; i++) {

            System.out.print("\nInsira valores para o primeiro vetor: ");
            vet1Inteiros[i] = keyboard.nextInt();

            for (int y = 0; y < vet1.length; y++) {

                vet1[y] = vet1Inteiros[i];

                if (vet1[y] == vet1Inteiros[i]) {
                    System.out.print("\nPrimeiro array: " + vet1Inteiros[i]);
                    System.out.print("\nSegundo array: " + vet1[y]);
                }

            }


        }


        System.out.print("\n\n");
    }

}
