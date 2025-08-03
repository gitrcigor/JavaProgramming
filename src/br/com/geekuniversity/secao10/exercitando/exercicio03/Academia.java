package src.br.com.geekuniversity.secao10.exercitando.exercicio03;

public class Academia {

    //Atributos
    private String aluno;
    private int inscricao;
    private float pesoDoAluno;
    private float valorMensalidade;
    private float alturaDoAluno;
    protected double calculoIMC;


    //Constutor
    public Academia(String aluno, float pesoDoAluno, float alturaDoAluno, int inscricao, float valorMensalidade) {
        this.aluno = aluno;
        this.pesoDoAluno = pesoDoAluno;
        this.inscricao = inscricao;
        this.valorMensalidade = valorMensalidade;

    }

    //Métodos
    public void calcularIMC(String aluno, float pesoDoAluno, float alturaDoAluno) {

        calculoIMC = (pesoDoAluno / (alturaDoAluno * alturaDoAluno));

        //return calculoIMC;
        System.out.print("\n O IMC do aluno " + this.aluno + " é: " + calculoIMC);
    }

    void ajusteMensalidade(float valorMensalidade) {

    }


    //Encapsulamento (Getter e Setter)
    public String getAluno(){
        return this.aluno;
    }

    public float getPesoDoAluno(){
        return this.pesoDoAluno;
    }

    public float getValorMensalidade(){
        return this.valorMensalidade;
    }

    public float getAlturaDoAluno() {
        return this.alturaDoAluno;
    }



}
