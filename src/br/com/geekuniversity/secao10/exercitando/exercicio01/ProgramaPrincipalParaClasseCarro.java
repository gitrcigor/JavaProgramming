package src.br.com.geekuniversity.secao10.exercitando.exercicio01;

public class ProgramaPrincipalParaClasseCarro {
    public static void main(String[] args) {

        //Instanciando a classe Carro
        Carro carro01 = new Carro("Ford", "Fiesta", 2011, "Preto", 160);
        Carro carro02 = new Carro("GM", "Vectra", 2015, "Prata", 120);
        Carro carro03 = new Carro("Fiat", "Pulse", 2022, "Branco", 80);
        Carro carro04 = new Carro("Volks", "T-Cross", 2023, "Azul", 100);

        /*
        System.out.println("\n--- Carro 01 --- \nMarca: " + carro01.getMarca() + "\nModelo: " + carro01.getModelo() + "\nAno: " + carro01.getAno() + "\nCor: " + carro01.getCor() + "\nVelocidade atual: " + carro01.getVelocidadeAtual());
        System.out.println("\n--- Carro 02 --- \nMarca: " + carro02.getMarca() + "\nModelo: " + carro02.getModelo() + "\nAno: " + carro02.getAno() + "\nCor: " + carro02.getCor() + "\nVelocidade atual: " + carro02.getVelocidadeAtual());
        System.out.println("\n--- Carro 03 --- \nMarca: " + carro03.getMarca() + "\nModelo: " + carro03.getModelo() + "\nAno: " + carro03.getAno() + "\nCor: " + carro03.getCor() + "\nVelocidade atual: " + carro03.getVelocidadeAtual());
        System.out.println("\n--- Carro 04 --- \nMarca: " + carro04.getMarca() + "\nModelo: " + carro04.getModelo() + "\nAno: " + carro04.getAno() + "\nCor: " + carro04.getCor() + "\nVelocidade atual: " + carro04.getVelocidadeAtual());
*/
        carro01.exibirInformacoesSobreOCarro("Ford", "Fiesta", 2011, "Preto", 160);


    }
}
