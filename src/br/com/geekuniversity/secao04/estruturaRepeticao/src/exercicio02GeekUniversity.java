package src.br.com.geekuniversity.secao04.estruturaRepeticao.src;/*
Data: 04/10/2024
Autor: Igor Rayfran Calixto

Estrutura de repetição compreende conceitos relacionados a
while, Do-While, For e Foreach

Exercício:
2. Escreva um programa que escreva na tela, de 1 até 100, de 1 em 1, 3 vezes. A primeira vez,
deve usar a estrutura de repetição for, a segunda while e a terceira do while.

*/


public class exercicio02GeekUniversity {


    public static void main(String[] args) {

        // Utilizando FOR
        for (int i = 0; i <= 100; i++){

            System.out.print("\n i = " + i);

        }

        System.out.print("\n\n");

        // Utilizando While
        int numeroInteiro = 0;

        while (numeroInteiro <= 100) {

            System.out.print("\nInteiro = " + numeroInteiro++);

        }

        System.out.print("\n\n");

        // Utilizando Do-While
        int contator = 0;
        do {

            System.out.print("\nContador = " + contator++);

        } while (contator < 101);


    }

}
