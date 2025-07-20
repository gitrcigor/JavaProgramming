package src;

//Classe
public class ContatoExe01 {

    //Atributos da classe
    private String nome;
    private String email;
    private String telefone;

    //Com métodos públicos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    //Construtor se no programa principal estiver usando construtor com passagem de parâmetros
//    public ContatoExe01 (String nome, String email, String telefone){
//
//        this.nome = nome;
//        this.email = email;
//        this.telefone = telefone;
//    }

    //Método da classe
    void imprimirDados(){
        System.out.print("\nNome: " + this.nome);
        System.out.print("Email: " + this.email);
        System.out.print("Telefone: " + this.telefone);
    }

}
