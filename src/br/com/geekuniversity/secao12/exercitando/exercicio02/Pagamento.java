package src.br.com.geekuniversity.secao12.exercitando.exercicio02;

public abstract class Pagamento {

    public int valor;
    public String titular;

    public Pagamento(int valor, String titular){
        this.valor = valor;
        this.titular = titular;
    }

    public abstract double processarPagamento();

}
