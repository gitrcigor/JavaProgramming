package src.br.com.geekuniversity.secao07.funcoes.src;// Estudando sobre o conceito de funções em Java

// Chamada de um função simples com passagem de mais de um parâmetro

// Fonte:
// https://www.w3schools.com/java/java_methods_param.asp

public class funcaoComVariosParam {

    static void exibirNomeIdade(String nome, int idade) {

        System.out.println(nome + " tem " + idade + " de idade!");

    }

    public static void main(String[] args) {

        exibirNomeIdade("Isadora", 25);
        exibirNomeIdade("Igor", 29);
        exibirNomeIdade("Isaac", 16);

    }

}
