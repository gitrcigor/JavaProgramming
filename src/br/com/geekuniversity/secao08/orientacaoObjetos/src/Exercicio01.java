package src;

/*
05/04/2025 - Sábado - Noite

1. Crie uma classe para representar um contato, com os atributos privados de nome, email e
telefone. Crie os métodos públicos necessários para sets e gets e também um método para
imprimir os dados de uma pessoa. Crie também um programa, instancie um objeto desta classe
e imprima os dados do objeto.
 */

public class Exercicio01 {

    public static void main(String[] args) {

        //ContatoExe01 contato = new ContatoExe01("Igor", "igorrc23@live.com", "31996165651");

        //contato.imprimirDados();

        // ======= ou também pode ser usado a forma abaixo =======

        ContatoExe01 contato = new ContatoExe01();

        contato.setNome("Igor");
        contato.setEmail("Igorrc23@live.com");
        contato.setTelefone("319966165651");

        contato.imprimirDados();

    }

}
