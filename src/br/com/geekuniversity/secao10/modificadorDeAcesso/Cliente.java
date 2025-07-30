// Aula 55 Encapsulamento
// Public pode ser utilizado em todo o projeto;

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

//    public void setNome(String nome) {
//        this.nome = nome;
//    }

    public String getEndereco(){
        return this.endereco;
    }

}
