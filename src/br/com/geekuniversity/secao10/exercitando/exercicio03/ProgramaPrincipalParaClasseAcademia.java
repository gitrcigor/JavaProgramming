package src.br.com.geekuniversity.secao10.exercitando.exercicio03;

import java.util.Scanner;

public class ProgramaPrincipalParaClasseAcademia {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        
        System.out.print("\n--- Cálculo IMC ---");
        System.out.print("\nInforme o nome do aluno: ");
        String nome = teclado.nextLine();
        
        System.out.print("\nInforme o peso do aluno: ");
        float peso = teclado.nextFloat();
        
        System.out.print("\nInforme a altura do aluno: ");
        float altura = teclado.nextFloat();
        
        Academia academia = new Academia("Igor", 77, 1.73f, 12345, 150);

        academia.calcularIMC(nome, peso, altura);
        
        
    }
    
    
}
