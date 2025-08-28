package src.br.com.geekuniversity.secao12.exercitando.execicio01;

public abstract class Figura {

    private int base;
    private int altura;

    public Figura(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    //Aqui o método calcularArea é instanciado porém não tem implementação, quem faz a implementação são as classes filhas, ou seja, quem herda essa classe abstrata.
    public abstract int calcularArea();

    public abstract int calcularPerimetro();


    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

}
