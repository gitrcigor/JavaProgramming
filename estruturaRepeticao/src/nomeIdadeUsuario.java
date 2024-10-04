import java.util.Scanner;

/*
 * Estrutura de repetição compreende conceitos relacionados a
 * while, Do-While, For e Foreach
 *
 * Exercício 02
 * Utilizando While
 *
 * */

public class nomeIdadeUsuario {

    public static void main(String[] args) {

        String nome;
        int idade = 1;

        Scanner teclado = new Scanner(System.in);

        while (idade > 0) {


            System.out.print("\nInforme seu nome: ");
            nome = teclado.nextLine();

            System.out.print("\nInforme sua idade: ");
            idade = Integer.parseInt(teclado.nextLine());


            if (idade > 0)
                System.out.print(nome + " tem " + idade + " anos de idade!\n");
            else
                System.out.println("\nIdade incorreta!");

        }


        teclado.close();
    }


}
