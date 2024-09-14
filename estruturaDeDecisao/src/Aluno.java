import java.util.Scanner;


public class Aluno {

    public static void main(String[] args) {
        final double numero_avaliacoes = 4;

        double nota1, nota2, nota3, nota4;
        double media;


        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe a primeira nota: ");
        nota1 = teclado.nextDouble();

        System.out.println("Informe a segunda nota: ");
        nota2 = teclado.nextDouble();

        System.out.println("Informe a terceira nota: ");
        nota3 = teclado.nextDouble();

        System.out.println("Informe a quarta nota: ");
        nota4 = teclado.nextDouble();


        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média aritmética das notas é de: " + media);

        if (media > 5)
            System.out.println("Aluno aprovado!");
        else
            System.out.println("Aluno reprovado!");


    }


}