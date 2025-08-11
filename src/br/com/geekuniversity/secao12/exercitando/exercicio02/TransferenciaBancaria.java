package src.br.com.geekuniversity.secao12.exercitando.exercicio02;

public class TransferenciaBancaria extends Pagamento {

    private int desconto;

    public TransferenciaBancaria(int valor, int vencimento, String titular){
        super(valor, vencimento, titular);
        this.desconto = desconto;
    }

    public int getDesconto(){
        return desconto;
    }

    @Override
    public int processarPagamento(){

    }

}
