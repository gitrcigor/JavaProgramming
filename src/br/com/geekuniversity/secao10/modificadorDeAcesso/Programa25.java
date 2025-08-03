package src.br.com.geekuniversity.secao10.modificadorDeAcesso;

//Aula 55 Encapsulamento
//

import java.util.Scanner;

public class Programa25 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        float valorASacar;

        //Instanciando clientes
        Cliente cliente01 = new Cliente("Igor", "Rua Marte, 130");

        Cliente cliente02 = new Cliente("Iva", "Rua Jupiter, 45");

        //Instanciando contas
        Conta conta01 = new Conta(0012, 1500.0f, cliente01);

        Conta conta02 = new Conta(0023, 3500.0f, cliente02);


        //Chamando métodos
        System.out.print("\nQual valor deseja sacar: ");
        valorASacar = teclado.nextInt();

        System.out.print("\n---- Primeiro Saque ----");
        if (conta01.sacar(valorASacar)){
            System.out.print("\nSaque efetuado no valor de: R$" + valorASacar + "\nSaldo restante de: R$" + conta01.getSaldo() + "\n");
        }

//        System.out.print("\n---- Segundo Saque ----");
//        conta02.sacar(500);
//        System.out.print("\nSaque de R$500 efetuado, valor restante: " + conta02.getSaldo() + "\n");
//
//
        System.out.print("\n---- Primeiro Depósito ----");
        conta01.depositar(399);
        System.out.print("\nDepósito efetuado no valor de R$399: " + "\nSaldo restante de: " + conta01.getSaldo() + "\n");
//
//
//        System.out.print("\n---- Consultando saldo ----");



    }


}
