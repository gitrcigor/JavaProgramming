package src;

// Aula sobre orientação a objetos
// Aula 44 Seção 8

// Construtores

/*
- Sempre um construtor vazio tem a seguinte forma
public NomeDaClasse(){
}

 */

public class PessoaPrograma22 {

    String nome;
    String email;
    int ano_nascimento;

    //Construtor vazio
    public PessoaPrograma22(){

    }

    //Construtor com parâmetros
    public PessoaPrograma22(String nome, String email, int ano_nascimento){
        //this == este objeto
        this.nome = nome;
        this.email = email;
        this.ano_nascimento = ano_nascimento;
    }

    void imprime_info(){
        System.out.println("\nNome: " + this.nome);
        System.out.println("Email: " + this.email);
        System.out.println("Ano Nascimento: " + this.ano_nascimento);
    }

}
