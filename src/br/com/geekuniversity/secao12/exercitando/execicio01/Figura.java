package src.br.com.geekuniversity.secao12.exercitando.execicio01;

public abstract class Figura {

    private int base;
    private int altura;

    public Figura(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public abstract int calcularArea();


    public int getBase(){
        return base;
    }

    public void setBase(int base){
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

}
