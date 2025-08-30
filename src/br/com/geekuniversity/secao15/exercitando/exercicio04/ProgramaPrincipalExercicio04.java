package src.br.com.geekuniversity.secao15.exercitando.exercicio04;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
* Exercício 04
* Fornecido pelo GPT
* Receber um valor em inteiro e tentar converter para string com Integer.parseInt()
* Usar try/catch para tratar a possível exceção
* Usar loop até que seja fornecido um valor válido
* */

public class ProgramaPrincipalExercicio04 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String numeroInteiro = "";


        System.out.println("\n--- Exercício 04 ---\n");

        do {
            try {
                System.out.print("\n> Digite um número inteiro: ");
                numeroInteiro = teclado.nextLine();
                Integer.parseInt(numeroInteiro);
                if (Integer.parseInt(numeroInteiro) != 0){
                    System.out.print("\n> Número fornecido: " + numeroInteiro);
                    break;
                }
            }
            catch (InputMismatchException | NumberFormatException e){
                System.out.print("\n> Formato incorreto do dado solicitado, favor inserir corretamente!\n");
            }
//            finally {
//                    System.out.print("\nNúmero fornecido: " + numeroInteiro);
//            }
        } while(numeroInteiro != "0");

        teclado.close();
    }

}
