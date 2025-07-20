package rascunho;

public class RascunhoEx01 {

    public static void main(String[] args) {

        CarroEx01 carroEx01 = new CarroEx01();

        carroEx01.marca = "Ford";
        carroEx01.modelo = "Fiesta";
        carroEx01.cor = "Preto";
        carroEx01.ano = 2011;
        carroEx01.preco = 19000;

        System.out.println("\n");
        System.out.println("Carro: " + carroEx01.marca);
        System.out.println("Modelo: " + carroEx01.modelo);
        System.out.println("Cor: " + carroEx01.cor);
        System.out.println("ano: " + carroEx01.ano);
        System.out.println("preco: " + carroEx01.preco);


        // ==== Construtor com parametros ====

        CarroEx01 meuCarroEx01 = new CarroEx01("Ford", "Fiesta", "Preto", 2011, 30000);

        meuCarroEx01.imprimeAtributos();

    }

}
