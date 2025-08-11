package src.br.com.geekuniversity.secao12.exercitando.exercicio02;

public class TransferenciaBancaria extends Pagamento {

    private double desconto = 0.95;

    public TransferenciaBancaria(int valor, String titular) {
        super(valor, titular);
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    @Override
    public double processarPagamento() {
        return this.valor * this.desconto;
    }

}
