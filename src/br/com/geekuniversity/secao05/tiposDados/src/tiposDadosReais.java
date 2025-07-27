package src.br.com.geekuniversity.secao05.tiposDados.src;

public class tiposDadosReais {

    public static void main(String[] args) {

        //Tipos primários/primitivos
        float preco1 = 23.4f;     // 23.40
        double preco2 = 23.4;     // 23.4343

        //Tipos não primários/primitivos
        Float preco3 = 44.5f;
        Double preco4 = 44.5;

        System.out.print("\nfloat >> preco1 = " + preco1);
        System.out.print("\ndouble >> preco2 = " + preco2);
        System.out.print("\nFloat >> preco3 = " + preco3);
        System.out.print("\nDouble >> preco4 = " + preco4);

        System.out.print("\n\n");

        System.out.print("\nUma variável do tipo float/Float ocupa [" + Float.SIZE + " bits] em memória!");
        System.out.print("\nUma variável do tipo double/Double ocupa [" + Double.SIZE + " bits] em memória!");

        System.out.print("\n\n");

        System.out.print("\n>> Valor min float/Float [" + Float.MIN_VALUE + "]");
        System.out.print("\n>> Valor max float/Float [" + Float.MAX_VALUE + "]");

        System.out.print("\n>> Valor min double/Double [" + Double.MIN_VALUE + "]");
        System.out.print("\n>> Valor max double/Double [" + Double.MAX_VALUE + "]");

        System.out.print("\n\n");

    }

}
