// Aula 55 Encapsulamento
// Public pode ser utilizado em todo o projeto;
// Private só pode ser utilizado dentro da classe;
// Protected só pode ser utilizado dentro da classe e nas classes filhas;
// Default só pode ser utilizado dentro do pacote (mesmo pacote).
// Getters e Setters são métodos públicos que permitem acessar atributos privados de uma classe.
// Getters são utilizados para consultar dados e Setters são utilizados para modificar dados.
// A nomenclatura dos métodos Getters é get_NomeDoAtributo() e
// a nomenclatura dos métodos Setters é set_NomeDoAtributo().
// É uma boa prática utilizar Getters e Setters para encapsular os dados de uma classe
// e evitar acesso direto aos atributos, garantindo maior controle sobre as operações realizadas.

package src.br.com.geekuniversity.secao10.modificadorDeAcesso;

public class Cliente {

        //Atributos
    private String nome;
    private String endereco;


    //Construtor
    public Cliente(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
    }


    //Métodos



    //Instanciando modificadores de acesso dos atributos private (Getters e Setters)
    public String getNome(String nome){
        return this.nome;
    }

    public String getEndereco(){
        return this.endereco;
    }

}
