package src.br.com.geekuniversity.secao11.herancaEPolimorfismo;
// Aula 61 - Herança e Polimorfismo
// Aluno é uma Pessoa
// Aluno herda de Pessoa
// Aluno é uma subclasse de Pessoa
// Pessoa é uma superclasse de Aluno
// Aluno é uma classe filha de Pessoa
// Pessoa é uma classe pai de Aluno

//Pode-se usar a herança para instanciar uma nova pessoa que tenha nome e ano de nascimento mas não tenha RA


public class Pessoa {

    //Atributos
    private String nome;
    private int anoNascimento;
    private String email;

    //Construtor
    public Pessoa (String nome, int anoNascimento, String email){
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.email = email;
    }

    //Encapsulamento (Getter e Setter)
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return this.anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
