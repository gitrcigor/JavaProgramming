package src.br.com.geekuniversity.secao12.classesAbstratas;

public class Gerente extends Usuario {

    private String credencial;

    public Gerente (String nome, String email, int idade, String credencial){
        super(nome, email, idade);
        this.credencial = credencial;
    }

    @Override
    public void imprimirDados(String nome, String email, int idade){

    }

}
