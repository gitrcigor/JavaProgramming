package src.br.com.geekuniversity.secao11.herancaEPolimorfismo;

// Aula 61 - Herança e Polimorfismo
// Aluno é uma Pessoa
// Aluno herda de Pessoa
// Aluno é uma subclasse de Pessoa
// Pessoa é uma superclasse de Aluno
// Aluno é uma classe filha de Pessoa
// Pessoa é uma classe pai de Aluno

//Pode-se usar a herança para instanciar uma nova pessoa que tenha nome e ano de nascimento mas não tenha RA

public class Aluno extends Pessoa {

    //Atributos
    private String ra;

    //Construtor
    public Aluno (String nome, int anoNascimento, String email, String ra){
        super(nome, anoNascimento, email);
        this.ra = ra;
    }

    //Encapsulamento (Getter e Setter)
    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }


    //Polimorfismo - Aula 62     || Overriding
    public String toString (){
        return super.toString() + " | R.A.: " + this.ra;
    }

}
