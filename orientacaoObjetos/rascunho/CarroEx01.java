package rascunho;

//Classe
public class CarroEx01 {

    //Atributos
    String marca;
    String modelo;
    String cor;
    int ano;
    double preco;

    //Construtor da classe
    public CarroEx01(){
    }

    public CarroEx01(String marca, String modelo, String cor, int ano, double preco){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.preco = preco;
    }

    //Metódo
    void imprimeAtributos() {
        System.out.print("\nMarca: " + this.marca);
        System.out.print("Modelo: " + this.modelo);
        System.out.print("Cor: " + this.cor);
        System.out.print("Ano: " + this.ano);
        System.out.print("Preco: " + this.preco);

    }

}
