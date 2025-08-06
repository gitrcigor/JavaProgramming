package src.br.com.geekuniversity.secao11.exercitando.exercicio01;

public class Assistente extends Funcionario {

    private int numeroMatricula;

    public Assistente(String nome, double salario, int numeroMatricula){
        super(nome, salario);
        this.numeroMatricula = numeroMatricula;
    }

    public int getNumeroMatricula(){
        return this.numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula){
        this.numeroMatricula = numeroMatricula;
    }





}
