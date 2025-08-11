package src.br.com.geekuniversity.secao12.exercitando.exercicio02;

public class BoletoBancario extends Pagamento {

    private double juros = 1.1;

    public BoletoBancario(int valor, String titular){
        super(valor, titular);
        this.juros = juros;
    }

    public double getVencimento(int vencimento){
        return vencimento;
    }

    @Override
    public double processarPagamento(){
        return this.valor * this.juros;
    }

    public double getJuros(){
        return juros;
    }

}
