package src.br.com.geekuniversity.secao11.herancaEPolimorfismo;

// Aula 61 - Herança e Polimorfismo
// Aluno é uma Pessoa
// Aluno herda de Pessoa
// Aluno é uma subclasse de Pessoa
// Pessoa é uma superclasse de Aluno
// Aluno é uma classe filha de Pessoa
// Pessoa é uma classe pai de Aluno

public class Professor extends Pessoa {

    //Atributos
    private String matricula;

    //Construtor
    public Professor(String nome, int anoNascimento, String email, String matricula) {
        super(nome, anoNascimento, email);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    //Polimorfismo - Aula 62   || Overriding
    public String toString(){
        return super.toString() + " | Matricula: " + this.matricula;
    }

}
