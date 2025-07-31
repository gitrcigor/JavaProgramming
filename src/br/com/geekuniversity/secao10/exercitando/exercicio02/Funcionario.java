package src.br.com.geekuniversity.secao10.exercitando.exercicio02;

public class Funcionario {

    //Atributos
    private String nome;
    private String cargo;
    private float salario;
    private String departamento;

    //Construtor
    public Funcionario(String nome, String cargo, float salario, String departamento){
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.departamento = departamento;
    }

    //Métodos
    protected void reajusteSalarioEm20Porcento(String nome, String cargo, float salario, String departamento) {

        this.salario = salario * 1.20f;
    }


    //Encapsulamento (Getters e Setters)
    public String getNome() {
        return this.nome;
    }

    public String getCargo() {
        return this.cargo;
    }

    public float getSalario() {
        return this.salario;
    }

    public String getDepartamento() {
        return this.departamento;
    }


}
