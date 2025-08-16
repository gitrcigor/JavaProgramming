package src.br.com.geekuniversity.secao15.tratamentoDeErros;

import java.util.Scanner;

public class Programa38 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("\nInforme o primeiro número: ");
        int n1 = teclado.nextInt();

        System.out.print("\nInforme o primeiro número: ");
        int n2 = teclado.nextInt();

        try {

            System.out.println(divisao(n1, n2));

        } catch (Exception e) {

            System.out.print("\nNão foi possível executar a divisão!");

        }

        teclado.close();
    }

    //Função que avisa se tem possibilidade de lançar uma exceção do tipo Exception
    public static int divisao(int n1, int n2) throws Exception {
        return n1 / n2;
    }

}
