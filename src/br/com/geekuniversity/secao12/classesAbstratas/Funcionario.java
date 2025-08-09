package src.br.com.geekuniversity.secao12.classesAbstratas;

public class Funcionario extends Usuario {

    private String cargo;

    public Funcionario(String nome, String email, int idade, String cargo){
        super(nome, email, idade);
        this.cargo = cargo;
    }

    @Override
    public void imprimirDados(String nome, String email, int idade) {

    }

}
