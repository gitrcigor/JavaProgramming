package src.br.com.geekuniversity.secao14.atributosEMetodosEstaticos;
//Aula 75 - 12/08/2025
//Atributos estáticos são atributos onde os valores
//são compartilhados entre as instâncias da classe
public class Programa34 {

    public static void main(String[] args) {

        Conta conta01 = new Conta( "Michael Jordan");

        System.out.print(conta01.getNumero());
        System.out.println(conta01.getCliente());

        Conta conta02 = new Conta("Alexa amazon");

        System.out.print(conta02.getNumero());
        System.out.println(conta02.getCliente());

        Conta conta03 = new Conta("Robô aspirador");

        System.out.print(conta03.getNumero());
        System.out.println(conta03.getCliente());


        //Se quiser saber somente o valor do contador
        System.out.println(conta01.getNumero());
        System.out.println(conta02.getNumero());
        System.out.println(conta03.getNumero());
    }




}
