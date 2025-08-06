package src.br.com.geekuniversity.secao11.herancaEPolimorfismo;

public class Zelador extends Pessoa {

    //Atributos
    private String profissao;

    //Construtor
    public Zelador (String nome, int anoNascimento, String email, String profissao){
        super(nome, anoNascimento, email);
        this.profissao = profissao;
    }

    //Encapsulamento (Getter e Setter)
    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }


    //Polimorfismo - Aula 62   || Overriding
//    @Override
//    public String toString() {
//        return super.toString() + " | Profissão: " + this.profissao;
//    }

    public String toString() {
        return super.toString() + " | Profissão: " + profissao;
    }

}
