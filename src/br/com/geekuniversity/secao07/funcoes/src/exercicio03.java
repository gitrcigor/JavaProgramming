package src.br.com.geekuniversity.secao07.funcoes.src;

import java.util.Scanner;

// Estudando sobre o conceito de funções em Java

// 3. Escreva um programa que tenha uma função que recebe dois valores inteiros e retorna o maior.

public class exercicio03 {

    static int retornarMaiorInteiro(int valor1, int valor2) {

        int maior = 0;

        if (valor1 <= valor2)
            maior = valor2;
        else
            maior = valor1;

        return maior;
    }

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int valorPrimario;
        int valorSecundario;


        System.out.print("\nInforme o primeiro valor inteiro: ");
        valorPrimario = keyboard.nextInt();

        System.out.print("\nInforme o segundo valor inteiro: ");
        valorSecundario = keyboard.nextInt();



        System.out.print("\n\nO maior valor informado é: " + retornarMaiorInteiro(valorPrimario, valorSecundario));
    }
}
