package src.br.com.geekuniversity.secao13.interfaces;

public class Ventilador implements IEletronico {

    private boolean ligado = false;

    @Override
    public void ligar() {
        if (!this.ligado) {
            this.ligado = true;
            System.out.println("\nEstá ligado!");
        }
    }

    @Override
    public void desligar() {
        if (this.ligado) {
            this.ligado = false;
            System.out.println("\nEstá desligado!");
        }
    }
}
