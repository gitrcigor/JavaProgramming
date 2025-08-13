package src.br.com.geekuniversity.secao14.atributosEMetodosEstaticos;
//Aula 75 - 12/08/2025

public class Conta {
    private int numero;
    private String cliente;

    public static int contador = 1;

    public Conta (String cliente){
        this.numero = contador;
        this.cliente = cliente;
        Conta.contador = Conta.contador +1;
    }

    //Aula 76 - Métodos Estáticos
    public static int proximaConta(){
        return Conta.contador;
    }


    public int getNumero(){
        return this.numero;
    }

    public String getCliente(){
        return this.cliente;
    }

}
