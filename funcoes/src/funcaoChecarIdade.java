import java.util.Scanner;

// Estudando sobre o conceito de funções em Java

// Chamada de um função simples com passagem de mais de um parâmetro e estrura de decisão

// Fonte:
// https://www.w3schools.com/java/java_methods_param.asp

public class funcaoChecarIdade {

    static void checarIdade (int idade) {

        if (idade < 18 && idade >= 1){
            System.out.println("Você ainda é menor de idade!"); }
        else if (idade == 0) {
            System.out.println("Idade incorreta!"); }
        else {
            System.out.println("Você já é maior de idade!"); }

    }

    public static void main(String[] args) {

        int idadeDoUsuario;
        Scanner keyboard = new Scanner(System.in);


        System.out.print("\nInforme sua idade: ");
        idadeDoUsuario = keyboard.nextInt();


        checarIdade(idadeDoUsuario);

    }
}
