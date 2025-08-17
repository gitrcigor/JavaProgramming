package src.br.com.geekuniversity.secao15.exercitando.exercicio02;
//Exercício sobre tratamento de erros
//Obtido em: https://docentes.ifrn.edu.br/nickersonferreira/disciplinas/programacao-estruturada-e-orientada-a-objetos/lista-de-exercicios-excecoes/view
//Corrigir a implementação abaixo com o objetivo de não parar sua execução.


import java.util.Scanner;

public class Questao02 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Eu sei dividir!");
        System.out.println("Informe o primeiro número: ");
        int num1 = teclado.nextInt();

        System.out.println("Informe o segundo número: ");
        int num2 = teclado.nextInt();


        double resultado = (num1 / num2);

        try {
            if (num2 == 0) {
                throw new ArithmeticException("Divisão por zero não é permitida.");
            }
        } catch (ArithmeticException e) {
            System.out.println("Não é possível efetuar divisão por zero!");
        } finally {
            System.out.println("Informe o segundo número: ");
            num2 = teclado.nextInt();

        }

        System.out.println("O resultado da divisão é: " + resultado);


    }


}
