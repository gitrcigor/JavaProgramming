package src.br.com.geekuniversity.secao14.atributosEMetodosEstaticos;
//Aula 76 Métodos Estáticos
//Um método estático não depende de uma instância da classe
//para ser utilizado.
//Pode-se utilizar conforme:
//NomeDaClasse.metodo();
public class Programa35 {
    public static void main(String[] args) {

        Conta conta01 = new Conta("Akon Jamaica");
        System.out.print("\nNúmero da conta: " + conta01.getNumero());
        System.out.print("\nCliente: " + conta01.getCliente());

        System.out.print("\nA próxima conta será: " + Conta.proximaConta());
    }

}
