package src.br.com.geekuniversity.secao12.classesAbstratas;
//Aula 68
//Classes abstratas
//É um recurso que proporciona um bloqueio na criação de objetos.
//Não conseguimos instanciar objetos de uma classe abstrata.

public abstract class Usuario {
    private String nome;
    private String email;
    private int idade;

    public Usuario(String nome, String email, int idade){
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public abstract void imprimirDados(String nome, String email, int idade);


    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

}
