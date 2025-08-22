package src.br.com.geekuniversity.secao15.exercitando.exercicio03;
//Exercício sobre tratamento de erros - Exercício 03
//Obtido em: https://docentes.ifrn.edu.br/nickersonferreira/disciplinas/programacao-estruturada-e-orientada-a-objetos/lista-de-exercicios-excecoes/view
//Ler o enunciado e efetuar o que se pede.

public class Conta {

    double deposita;
    double saca;
    private double saldoConta;
    private double limite;

    public Conta(double deposita, double saca, double saldoConta, double limite){
        this.deposita = deposita;
        this.saca = saca;
        this.saldoConta = saldoConta;
        this.limite = limite;
    }

    public double getSaldoConta(){
        return saldoConta;
    }

    public void setLimite(double limite){
        this.limite = limite;
    }

    public double deposita(double valorADepositar){
        return getSaldoConta() + valorADepositar;

    }

    public double saca(double valorASacar){
        return getSaldoConta() - valorASacar;
    }

}
