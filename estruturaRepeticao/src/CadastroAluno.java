import java.util.Scanner;

/*
 * Estrutura de repetição compreende conceitos relacionados a
 * while, Do-While, For e Foreach
 *
 * Exercício 01
 *
 *
 * */


public class CadastroAluno {

    public static void main(String[] args) {

        String nome;
        String endereco;
        String telefone;
        int matricula;
        int cont = 0;


        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira a matrícula do aluno: ");
        matricula = teclado.nextInt();


        while (matricula != 0) {

            System.out.println("Nome do aluno: ");
            nome = teclado.next();

            System.out.println("Endereço do aluno: ");
            endereco = teclado.next();

            System.out.println("Telefone do aluno: ");
            telefone = teclado.next();


            cont++;

            System.out.println("Matrícula do próximo aluno: ");
            matricula = teclado.nextInt();
        }

        teclado.close();

    }
}
