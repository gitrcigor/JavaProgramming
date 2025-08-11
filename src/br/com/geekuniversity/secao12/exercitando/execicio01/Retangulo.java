package src.br.com.geekuniversity.secao12.exercitando.execicio01;

public class Retangulo extends Figura {

    public Retangulo(int base, int altura){
        super(base, altura);

    }

    @Override
    public int calcularArea() {
        return this.getBase() * this.getAltura();

    }
}
