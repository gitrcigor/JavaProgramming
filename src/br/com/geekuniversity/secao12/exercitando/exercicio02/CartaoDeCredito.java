package src.br.com.geekuniversity.secao12.exercitando.exercicio02;

public class CartaoDeCredito extends Pagamento {

    private int quantidadeParcelas;

    public CartaoDeCredito(int valor, String titular){
        super(valor, titular);
        this.quantidadeParcelas = quantidadeParcelas;
    }

    @Override
    public int processarPagamento(){
        return valor / quantidadeParcelas;
    }
}
