package src.br.com.geekuniversity.secao12.classesAbstratas;

public class Cliente extends Usuario{

    private String codigoCliente;

    public Cliente (String nome, String email, int idade, String codigoCliente){
        super(nome, email, idade);
        this.codigoCliente = codigoCliente;
    }

    @Override
    public void imprimirDados(String nome, String email, int idade){

    }


}
