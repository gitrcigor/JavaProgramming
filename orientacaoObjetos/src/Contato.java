package src;

public class Contato {

    //Atributos
    private String email;
    private String nome;
    private String telefone;

    //Construtores
    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public String getTelefone() {return telefone;}

    public void setTelefone(String telefone) {this.telefone = telefone;}

    //Métodos
    void imprime_informacoes(){
        System.out.print("\n");
        System.out.println("\nNome: " + this.nome);
        System.out.println("E-mail: " + this.email);
        System.out.println("Telefone: " + this.telefone);
        System.out.print("\n");
    }



}
