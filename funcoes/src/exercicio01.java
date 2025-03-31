import java.util.Scanner;


public class exercicio01 {

// Estudando sobre o conceito de funções em Java

// Excercício 01. Faça um programa que possua uma função que recebe como parâmetro um número inteiro e devolve seu dobro.


    static int dobrarInteiro(int valorRecebido) {

        return valorRecebido * 2;
    }

    public static void main(String[] args) {

        int inteiroInformado = 10;


        System.out.print("\nO dobro vale: " + dobrarInteiro(inteiroInformado));


    }


}


