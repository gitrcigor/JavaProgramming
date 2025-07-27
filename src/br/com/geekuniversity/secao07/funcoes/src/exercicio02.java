package src.br.com.geekuniversity.secao07.funcoes.src;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.lang.String;

// Estudando sobre o conceito de funções em Java

// Faça um programa que receba a data atual (dia, mês e ano) e exiba na tela no formato textual. Exemplo: Data 01/01/2024, Imprimir: 1 de janeiro de 2024.

public class exercicio02 {

    static String formatarData(String data){

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        formato.format(data);

        return data;
    }

    public static void main(String[] args) {

        String dataInformada;

        Scanner keyboard = new Scanner(System.in);


        System.out.print("\nInforme a data desejada no formato numérico: ");
        dataInformada = keyboard.toString();

        formatarData(dataInformada);

    }
}
