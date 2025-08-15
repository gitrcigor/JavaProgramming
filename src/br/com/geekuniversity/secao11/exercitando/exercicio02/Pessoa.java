package src.br.com.geekuniversity.secao11.exercitando.exercicio02;

public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa (String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(){
        this.nome = nome;
    }

    public int getIdade(){
       return this.idade;
    }

    public void setIdade(){
        this.idade = idade;
    }

}
