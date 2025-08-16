package src.br.com.geekuniversity.secao15.tratamentoDeErros;
//Aula 79
//Tratando excessões com Try-Catch
//Utilizamos o Try para tentar realizar algo; geralmente em algo que pode acarretar em problema.
//Utilizamos o Catch para capturar o erro e com isso oferecer ao usuário do sistema uma mensagem adequada sem que o sistema quebre.

public class Programa36 {
    public static void main(String[] args) {

        int numeros[] = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 3 * 2;
        }

        for (int i = 0; i <= numeros.length; i++) {
            try { //Tente fazer isso

                System.out.println(numeros[i]);

            } catch (ArrayIndexOutOfBoundsException e) {

                System.out.println("\nVocê está tentando acessar uma posição do array que não existe!");
            } finally {

                System.out.print("\nContinua o processo...");
            }

        }

    }

}
