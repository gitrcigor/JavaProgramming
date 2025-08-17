package src.br.com.geekuniversity.secao15.exercitando.exercicio01;
//Exercício sobre tratamento de erros
//Obtido em: https://docentes.ifrn.edu.br/nickersonferreira/disciplinas/programacao-estruturada-e-orientada-a-objetos/lista-de-exercicios-excecoes/view
//Corrigir a implementação abaixo com o objetivo de não parar sua execução.

public class TesteException {

    public static void main(String[] args) {
        System.out.print("\nInício do main");
        metodo1();
        System.out.print("\nFim do main");
    }

    static void metodo1(){
        System.out.print("\nInício do método 1");
        metodo2();
        System.out.print("\nFim do método 1");
    }

    static void metodo2(){
        System.out.print("\nInício do método 2");
        int[] array = new int[10];
        int[] array2 = new int[16];


        for (int i = 0; i <= 15; i++){
            try{
                array[i] = i;
            }
            catch(ArrayIndexOutOfBoundsException e){
                //Não colocar nenhum system.out.println aqui, pois isso irá gerar um loop desnecessário de mensagens de erro.
            }
            finally {

                array2[i] = i;
            }
            System.out.print("\t | " + array2[i]);
        }
        System.out.print("\nFim do método 2.");
    }

}
