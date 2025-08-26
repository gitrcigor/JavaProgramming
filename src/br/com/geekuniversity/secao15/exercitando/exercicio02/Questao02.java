package src.br.com.geekuniversity.secao15.exercitando.exercicio02;
//Exercício sobre tratamento de erros
//Obtido em: https://docentes.ifrn.edu.br/nickersonferreira/disciplinas/programacao-estruturada-e-orientada-a-objetos/lista-de-exercicios-excecoes/view
//Corrigir a implementação abaixo com o objetivo de não parar sua execução.


import java.util.Scanner;

public class Questao02 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double resultado = 0;
        boolean valido = false;

        System.out.print("\nEu sei dividir!");
        System.out.print("\nInforme o primeiro número: ");
        int num1 = teclado.nextInt();

        while (!valido) {
            System.out.print("\nInforme o segundo número: ");
            int num2 = teclado.nextInt();
            try {
                resultado = num1 / num2;
                valido = true;
            } catch (ArithmeticException e) {
                System.out.print("\nImpossível dividir por zero!");
            }

        }
        System.out.print("\nResultado da divisão é: " + resultado);

    }


}
