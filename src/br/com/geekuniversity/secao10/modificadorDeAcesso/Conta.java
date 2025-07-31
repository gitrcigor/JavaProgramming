package src.br.com.geekuniversity.secao10.modificadorDeAcesso;

// Aula 55 Encapsulamento
// Getters e Setters
// Getter: é um método público que serve para consultar dados;
// A nomenclatura desses métodos é get_Nomedoatributo()

public class Conta {

    //Atributos
    private int numero;
    private float saldo;
    private Cliente cliente;

    //Construtor
    public Conta(int numero, float saldo, Cliente cliente) {

        this.numero = numero;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    //Métodos
    boolean sacar(float valor) {
        if (valor > this.saldo) {
            System.out.print("\nO saldo desejado é insuficiente!");
            return false;
        } else {
            this.saldo = this.saldo - valor;
            return true;
        }
    }

    void depositar(float valor) {

        this.saldo = this.saldo + valor;
    }

    //Instanciando modificadores de acesso dos atributos private (Getters e Setters)
    public int getNumero() {
        return this.numero;
    }

    public float getSaldo() {
        return this.saldo;
    }


}
