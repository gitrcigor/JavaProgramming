package src.br.com.geekuniversity.secao11.herancaEPolimorfismo.ExerciciosGeekUniversity.Exercicio01;

public class Quadrado {

    //Atributos
    private int lado;
    private int area;
    private int perimetro;

    //Construtor
    public Quadrado (int lado){
        this.lado = lado;
        this.area = area;
        this.perimetro = perimetro;
    }

//    public Quadrado (){
//        this.area = area;
//        this.perimetro = perimetro;
//    }

    //Encapsulamento (Getter e Setter)
    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int getArea() {
        return area;
    }

    public int getPerimetro() {
        return perimetro;
    }

    //Métodos
    public int calculaArea(int lado){
        return this.area = lado * lado;
    }

    public int calculaPerimetro(int lado){
        return this.perimetro = (lado * 4);
    }

    public void imprimir(){
        System.out.println("\nÁrea: " + calculaArea(this.lado));
        System.out.println("\nPerimetro: " + calculaPerimetro(this.lado));
    }

}
