package src.br.com.geekuniversity.secao12.exercitando.execicio01;

public class Retangulo extends Figura {

    public Retangulo(int base, int altura){
        super(base, altura);

    }

    //A anotação @Override serve para indicar ao compilador que um método de uma classe filha tem a intenção de sobrescrever um método da super classe.
    @Override
    public int calcularArea() {
        return this.getBase() * this.getAltura();

    }

    @Override
    public int calcularPerimetro(){
        return this.getBase() * 2 + this.getAltura() * 2;
    }



}
