import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

// Estudando sobre o conceito de funções em Java

// Chamada de um função simples matemática para soma de 2 valores fornecidos pelo usuário

// Fonte:
// https://www.w3schools.com/java/java_methods_param.asp

// Como é uma função que retorna um valor, ela não é mais do tipo VOID, além de usar a palabra return

public class funcaoMat02 {

    static double soma2valores(double primeiroValor, double segundoValor) {

        return primeiroValor + segundoValor;

    }

    static double subtrair2valores(double primeiroValor, double segundoValor) {

        return primeiroValor - segundoValor;

    }

    static double produto2valores(double primeiroValor, double segundoValor) {

        return primeiroValor * segundoValor;

    }

    static double quociente2valores(double primeiroValor, double segundoValor) {

        if (segundoValor != 0) {
            return primeiroValor / segundoValor;
        }

    }


    public static void main(String[] args) {

        double valor1;
        double valor2;

        Scanner keyboard = new Scanner(System.in);


        System.out.println("Informe o primeiro valor para soma: ");
        valor1 = keyboard.nextDouble();
        System.out.println("Informe o segundo valor para soma: ");
        valor2 = keyboard.nextDouble();


        System.out.println("Soma igual a : " + soma2valores(valor1, valor2));
        System.out.println("Subtração igual a : " + subtrair2valores(valor1, valor2));
        System.out.println("Produto igual a : " + produto2valores(valor1, valor2));
        System.out.println("Quociente igual a : " + quociente2valores(valor1, valor2));


        keyboard.close();
    }


}
