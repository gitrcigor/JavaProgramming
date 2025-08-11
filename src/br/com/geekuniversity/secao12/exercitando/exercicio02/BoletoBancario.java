package src.br.com.geekuniversity.secao12.exercitando.exercicio02;

public class BoletoBancario extends Pagamento {

    private int vencimento;

    public BoletoBancario(int valor, String titular){
        super(valor, titular);
        this.vencimento = vencimento;
    }

    public int getVencimento(int vencimento){
        return vencimento;
    }

    @Override
    public int processarPagamento(){
    }

}
