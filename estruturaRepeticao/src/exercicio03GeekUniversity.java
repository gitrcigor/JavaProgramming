
/*
Data: 05/10/2024
Autor: Igor Rayfran Calixto

Estrutura de repetição compreende conceitos relacionados a
while, Do-While, For e Foreach

Exercício:
3. Faça um programa que declara um valor inteiro, inicialize-o com 0, incremente-o de 1000 em
1000, imprimindo seu valor na tela, até que seu valor seja 100000 (cem mil).

*/

public class exercicio03GeekUniversity {

    public static void main(String[] args) {

        int inteiro = 0;
        int inteiroSomado = 0;

        for (inteiro = 0; inteiro < 100; inteiro++) {


             inteiroSomado = inteiroSomado + 1000;

            System.out.print("\nValor = " + inteiroSomado);
        }


    }

}
