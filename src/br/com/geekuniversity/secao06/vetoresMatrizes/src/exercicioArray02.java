package src.br.com.geekuniversity.secao06.vetoresMatrizes.src;

import java.util.Arrays;
import java.util.Scanner;

// Exercício 02
// https://ramonrdm.wordpress.com/wp-content/uploads/2011/09/lista6-ine5402-ine5603.pdf

//Escreva um programa que solicita 8 inteiros ao usuário e guarda esses valores em um array. Depois o
//programa deve descobrir e exibir qual a posição do elemento de maior valor.

//Foi usado solução de pesquisa binária para retornar o index do array uma vez que  indexOf não foi possível.
//Fonte: https://docs.oracle.com/javase/8/docs/api/?java/util/Arrays.html
//binarySearch(byte[] a, byte key)


public class exercicioArray02 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);


        int vetInteiros[] = new int[7];
        int maior = 0;


        for (int i = 0; i < vetInteiros.length; i++) {

            System.out.print("\nInsira um valor inteiro para ser alocado no array: ");
            vetInteiros[i] = keyboard.nextInt();


            if (vetInteiros[i] > maior) {
                maior = vetInteiros[i];

            }

        }
        System.out.print("\nO maior valor no array é " + maior + "\n");
        System.out.print("\nA posição do maior valor no array é " + Arrays.binarySearch(vetInteiros, maior) + "\n");


    }
}
