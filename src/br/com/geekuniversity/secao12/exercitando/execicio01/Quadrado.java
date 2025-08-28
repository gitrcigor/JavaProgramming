package src.br.com.geekuniversity.secao12.exercitando.execicio01;

public class Quadrado extends Figura {

    public Quadrado(int base, int altura){
        super (base, altura);
    }

    @Override
    public int calcularArea() {
        return (this.getBase() * this.getAltura());

    }

    public int calcularPerimetro(){
        return this.getBase() * 4;
    }

}
