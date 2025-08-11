package src.br.com.geekuniversity.secao12.classesAbstratas;
//Aula 68
//Classes abstratas
//É um recurso que proporciona um bloqueio na criação de objetos.
//Não conseguimos instanciar objetos de uma classe abstrata.

public abstract class Usuario {

    private int idade;
    private String nome;
    private String email;

    public Usuario(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    //Classes abstratas tem métodos abstratos, que não têm implementação, apenas declaração
    public abstract void imprimirDados();






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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
