package src.br.com.geekuniversity.secao07.funcoes.src;

import java.util.Scanner;
// Estudando sobre o conceito de funções em Java

// Create a function that takes a number as an argument, increments the number by +1 and returns the result.

// Data: 01/03/2025
// Autor: Igor R Calixto

public class nextNumber {

    static double nextNumber(double inicialNumber) {

        double nextValue = inicialNumber + (+1);


        return nextValue;
    }

    public static void main(String[] args) {


        Scanner keyboard = new Scanner(System.in);


        System.out.print("\nInforme o valor inicial para receber seu sucessor: ");
        double valorInicial = keyboard.nextDouble();


        System.out.print("\nPróximo valor é: " + nextNumber(valorInicial));


    }


}
