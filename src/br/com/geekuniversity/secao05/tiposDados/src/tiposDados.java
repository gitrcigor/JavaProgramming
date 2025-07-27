package src.br.com.geekuniversity.secao05.tiposDados.src;

import java.sql.SQLOutput;

public class tiposDados {

    public static void main(String[] args) {

        //Tipos primários/primitivos
        long num0 = 99;     // Inteiro 9999999999999999999999
        int num1 = 4;       // Inteiro 99999999999
        short num2 = 4;     // Inteiro (curto/menor) 999999
        byte num3 = 4;      // Inteiro
        char num8 = 34;


        //Tipos não primários/primitivos
        Integer num4 = 99;
        Short num5 = 7;
        Byte num6 = 9;
        Long num7 = (long) 99999999;
        Character num9 = 35;


        System.out.print("\nlong >> Num0 = " + num0);
        System.out.print("\nint >> Num1 = " + num1);
        System.out.print("\nshort >> Num2 = " + num2);
        System.out.print("\nbyte >> Num3 = " + num3);
        System.out.print("\nchar >> Num8 = " + num8);

        System.out.print("\n\n");

        System.out.print("\nInteger >> Num4 = " + num4);
        System.out.print("\nShort >> Numb5 = " + num5);
        System.out.print("\nByte >> Num6 = " + num6);
        System.out.print("\nLong >> Num7 = " + num7);
        System.out.print("\nCharacter >> Num9 = " + num9);

        System.out.print("\n\n");

        System.out.print("\nUma variável do tipo long/Long ocupa [" + Long.SIZE + " bits] em memória!");
        System.out.print("\nUma variável do tipo int/Integer ocupa [" + Integer.SIZE + " bits] em memória!");
        System.out.print("\nUma variável do tipo short/Short ocupa [" + Short.SIZE + " bits] em memória!");
        System.out.print("\nUma variável do tipo byte/Byte ocupa [" + Byte.SIZE + " bits] em memória!");
        System.out.print("\nUma variável do tipo char/Character ocupa [" + Character.SIZE + " bits] em memória!");

        System.out.print("\n\n");

        System.out.print("\n>> Valor min long/Long [" + Long.MIN_VALUE + "]");
        System.out.print("\n>> Valor max long/Long [" + Long.MAX_VALUE + "]");

        System.out.print("\n>> Valor min int/Integer [" + Integer.MIN_VALUE + "]");
        System.out.print("\n>> Valor max int/Integer [" + Integer.MAX_VALUE + "]");

        System.out.print("\n>> Valor min short/Short [" + Short.MIN_VALUE + "]");
        System.out.print("\n>> Valor max short/Short [" + Short.MAX_VALUE + "]");

        System.out.print("\n>> Valor min byte/Byte [" + Byte.MIN_VALUE + "]");
        System.out.print("\n>> Valor max byte/Byte [" + Byte.MAX_VALUE + "]");

        System.out.print("\n>> Valor min char/Character [" + Character.MIN_VALUE + "]");
        System.out.print("\n>> Valor max char/Character [" + Character.MAX_VALUE + "]");


        System.out.print("\n\n");
    }

}
