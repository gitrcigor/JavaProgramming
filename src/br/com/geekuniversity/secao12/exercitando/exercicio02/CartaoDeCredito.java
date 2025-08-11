package src.br.com.geekuniversity.secao12.exercitando.exercicio02;

public class CartaoDeCredito extends Pagamento {

    private int quantidadeParcelas;

    public CartaoDeCredito(int valor, String titular, int quantidadeParcelas){
        super(valor, titular);
        this.quantidadeParcelas = quantidadeParcelas;
    }

    @Override
    public double processarPagamento(){
        return this.valor / this.quantidadeParcelas;
    }

    public int getQuantidadeParcelas (){
        return quantidadeParcelas;
    }

}
