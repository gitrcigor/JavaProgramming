
// Arrays (vetores uni-dimensionais)
//
// Vetor[indice]
// numeros[0] = 1;       //primeiro elemento
//
//Parte 02
// Vetores/Arrays têm tamanhos fixos;
// Vetores/Arrays têm tipos fixos de dados.

public class vetoresParte2 {

    public static void main(String[] args) {

        //Declaração e definição de tamanho
        int numeros[] = new int[10];

        System.out.print("\nTamanho do array igual a " + numeros.length + " posições.\n");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 3;

        }

        System.out.print("\nPrimeiro elemento + 3 = " + numeros[0]);    //Primeiro elemento
        System.out.print("\nSegundo elemento + 3 = " + numeros[9]);    //Segundo elemento



    }

}
