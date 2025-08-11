package src.br.com.geekuniversity.secao12.classesAbstratas;

public class Funcionario extends Usuario {

    private String cargo;

    public Funcionario(String nome, String email, int idade, String cargo){
        super(nome, email, idade);
        this.cargo = cargo;
    }

    @Override
    public void imprimirDados() {
        System.out.print("\nFuncionário Nome: " + this.getNome());
        System.out.print("\nFuncionário Email: " + this.getEmail());
        System.out.print("\nFuncionário Idade: " + this.getIdade());
        System.out.print("\nFuncionário Cargo: " + this.getCargo());
        System.out.print("\n");
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
