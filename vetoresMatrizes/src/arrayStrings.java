import java.util.Scanner;

public class arrayStrings {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);


        String arrayStrings[] = new String[2];

        for (int i = 0; i < arrayStrings.length; i++){

            System.out.print("\nInforme os nomes dos alunos: ");
            arrayStrings[i] = keyboard.next();


            if (arrayStrings[i].length() == 5){
                System.out.print("\nNomes informados: " + arrayStrings[i].toUpperCase());
            }
        }





    }

}
