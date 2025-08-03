package src.br.com.geekuniversity.secao10.exercitando.exercicio01;
//Exercitar os conhecimentos a seguir:
// 1. Trabalhar com Classe, atributos, construtores e métodos;
// 2. Utilizar modificadores de acesso (public, private, protected e default);
// 3. Utilizar encapsulamento (Getters e Setters);
// 4.


public class Carro {

    //Atributos
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private int velocidadeAtual;


    //Construtor
    public Carro(String marca, String modelo, int ano, String cor, int velocidadeAtual) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.velocidadeAtual = velocidadeAtual;
    }


    //Métodos
    protected void exibirInformacoesSobreOCarro(String marca, String modelo, int ano, String cor, int velocidadeAtual) {

        System.out.println("\nMarca: " + this.getMarca());
        System.out.println("\nModelo: " + this.getModelo());
        System.out.println("\nAno: " + this.getAno());
        System.out.println("\nCor: " + this.getCor());
        System.out.println("\nVelocidade: " + this.getVelocidadeAtual());
    }


    //Encapsulamento (Getters e Setters)
    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public int getAno() {
        return this.ano;
    }

    public String getCor() {
        return this.cor;
    }

    public int getVelocidadeAtual() {
        return this.velocidadeAtual;
    }

}
