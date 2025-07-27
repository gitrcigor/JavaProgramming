package src.br.com.geekuniversity.secao06.vetoresMatrizes.src;
// Estudos sobre arrays multidimensionais

// Cheatsheet programação Java
// https://books.goalkicker.com/JavaBook/

// Conteudo e exercicios
// https://www.javatpoint.com/array-in-java 

import java.util.Arrays;

public class arrayMulti02 {
    public static void main(String[] args) {

        // 03 Linhas e 03 Colunas
        int numeros[][] = new int[3][3];

        numeros[0][0] = 1;
        numeros[0][1] = 3;
        numeros[0][2] = 5;

        numeros[1][0] = 7;
        numeros[1][1] = 9;
        numeros[1][2] = 11;

        numeros[2][0] = 13;
        numeros[2][1] = 15;
        numeros[2][2] = 17;


        //System.out.println(numeros[1][2]);


        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = i + j * 2;
            }
        }

//        for (int i = 0; i < numeros.length; i++) {
//            for (int j = 0; j < numeros[i].length; j++) {
//                System.out.println("numeros[" + i + "][" + j + "] = " + numeros[i][j]);
//            }
//        }


        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }


    }
}
