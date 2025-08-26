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

    //Polimorfismo - Aula 62   || Overriding
    //Aqui o método toString da classe funciona como método de impressão
    public String toString(){
        return " | Matricula: " + this.matricula;
    }

}
