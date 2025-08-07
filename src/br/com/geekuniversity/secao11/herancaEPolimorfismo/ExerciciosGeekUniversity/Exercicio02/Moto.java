package src.br.com.geekuniversity.secao11.herancaEPolimorfismo.ExerciciosGeekUniversity.Exercicio02;

public class Moto {

    private String marca;
    private String modelo;
    private String cor;
    private int marcha;

    public Moto (String marca, String modelo, String cor, int marcha){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.marcha = marcha;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public void trocarMarcha(int marcha){
        if (marcha > 0){
            this.marcha = this.marcha + 1;
        }
        else {
            this.marcha = this.marcha - 1;
        }
    }

    public void imprimir(String marca, String modelo, String cor, int marcha){
        System.out.print("\nMarca: " + marca);
        System.out.print("\nModelo: " + modelo);
        System.out.print("\nCor: " + cor);
        System.out.print("\nMarcha: " + marcha);
    }


}
