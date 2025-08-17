package src.br.com.geekuniversity.secao15.tratamentoDeErros;

import java.util.Scanner;

public class Programa37 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("\nInforme o primeiro número para divisão: ");
        int num1 = teclado.nextInt();

        System.out.print("\nInforme o segundo número para divisão: ");
        int num2 = teclado.nextInt();

        try {
            System.out.print("\nA divisão do primeiro número pelo segundo vale: " + num1 / num2);

        } catch (ArithmeticException e) {

            System.out.print("\nO dividendo não pode ser zero!");

        } finally {
            System.out.print("\nAqui vai alguma instrução.");
        }




        teclado.close();
    }
}
