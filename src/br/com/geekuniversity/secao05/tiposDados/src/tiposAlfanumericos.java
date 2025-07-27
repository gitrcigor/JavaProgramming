package src.br.com.geekuniversity.secao05.tiposDados.src;

public class tiposAlfanumericos {

    public static void main(String[] args) {

        //tipos primitivos
        char letra1 = 'a';      //Aspas simples
        char letra2 = 97;       //97 em decimal == 'a'

        System.out.print("\nLetra2 " + letra2);

        letra2 = (char) (letra2 + 1);       //cast

        System.out.print("\nLetra1 " + letra1);
        System.out.print("\nLetra2 " + letra2);


        //tipos não primitivos
        Character letra3 = 'A';
        String nome = "Geek University";

        System.out.print("\nLetra3 " + letra3);

        System.out.print("\n\n");

        System.out.print("\nchar/Character tem [" + Character.SIZE + " bits] em memória.");

        System.out.print("\n\n");

        System.out.print("\n>> Valor min char/Character [" + Character.MIN_VALUE + "]");
        System.out.print("\n>> Valor max char/Character [" + Character.MAX_VALUE + "]");

        System.out.print("\n");

        System.out.print("\nNome + " + nome);

        System.out.print("\nTamanho da string: " + nome.length());

        System.out.print("\nString: " + (Character.SIZE * nome.length()) + " bits");


        System.out.print("\n\n");

    }

}
