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

    void diminuirMarchaDaMoto(int marcha){
        this.marcha += -1;
        System.out.print("\nMarcha atual: " + this.getMarcha());
    }

    void aumentarMarchaDaMoto(int marcha){
        if (this.getMarcha() == 6){
            System.out.print("\nJá está na última marcha!");
        }else {
            this.marcha += +1;
            System.out.print("\nMarcha atual: " + this.getMarcha());
        }

    }

    public void imprimir(){
        System.out.print("\nMarca: " + this.marca);
        System.out.print("\nModelo: " + this.modelo);
        System.out.print("\nCor: " + this.cor);
        System.out.print("\nMarcha atual: " + this.marcha);
    }


}
