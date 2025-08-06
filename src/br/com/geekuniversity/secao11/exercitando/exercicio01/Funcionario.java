package src.br.com.geekuniversity.secao11.exercitando.exercicio01;

public class Funcionario {

    private String nome;
    private double salario;

    public Funcionario (String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public void addAumento(double valor){
        this.salario = this.salario + valor;
    }

    public void ganhoAtual(){

        System.out.print("\nGanho atual: ");
    }

    public void exibeDados(){
        System.out.print("\nDados: ");
        System.out.print("\nNome: " + this.nome);
        System.out.print("\nSalário: " + this.salario);
        System.out.print("\n\n");
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getSalario(){
        return this.salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }


}
