package src.br.com.geekuniversity.secao12.classesAbstratas;

public class Cliente extends Usuario{

    private String codigoCliente;

    public Cliente (String nome, String email, int idade, String codigoCliente){
        super(nome, email, idade);
        this.codigoCliente = codigoCliente;
    }

    @Override
    public void imprimirDados(){
        System.out.print("\nCliente Nome: " + this.getNome());
        System.out.print("\nCliente Email: " + this.getEmail());
        System.out.print("\nCliente Idade: " + this.getIdade());
        System.out.print("\nCliente Cargo: " + this.getCodigoCliente());
        System.out.print("\n");
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }
    
}
