import java.util.Scanner;

public class manipulandoArray01 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);


        int arrayDeInteiros[] = new int[5];


        for (int i = 0; i < arrayDeInteiros.length; i++) {

            System.out.print("\nInsira um valor inteiro para ser alocado no array: ");
            arrayDeInteiros[i] = teclado.nextInt();

        }

        System.out.print("\n\n");
        //System.out.print("\nArray com valores informados pelo usuário: \n" + arrayDeInteiros[i]);

    }
}
