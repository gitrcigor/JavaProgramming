package src.br.com.geekuniversity.secao11.herancaEPolimorfismo.ExerciciosGeekUniversity.Exercicio02;

import java.util.Scanner;

public class ExercicioGeekUniversity02 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Moto moto1 = new Moto("Honda", "CB500x", "Azul", 6);

        System.out.print("\n--- Exercício Moto ---");

        moto1.imprimir(moto1.getMarca(), moto1.getModelo(),moto1.getCor(), moto1.getMarcha());

    }
}
