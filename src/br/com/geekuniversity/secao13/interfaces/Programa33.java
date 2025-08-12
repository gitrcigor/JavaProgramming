package src.br.com.geekuniversity.secao13.interfaces;
//Aula 72
//Interfaces
//Interfaces são conhecidas como contratos

public class Programa33 {
    public static void main(String[] args) {
        Ventilador ventilador01 = new Ventilador();

        System.out.println("Marca " + ventilador01.MARCA);

        ventilador01.desligar();
        ventilador01.ligar();
        ventilador01.desligar();
    }
}
