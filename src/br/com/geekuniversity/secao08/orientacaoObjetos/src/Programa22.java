package src.br.com.geekuniversity.secao08.orientacaoObjetos.src;

/*
- Objetos são produtos/instâncias da classe;

 */

import src.Produto;

public class Programa22 {

    public static void main(String[] args) {

        int numero = 4;

        // Declaração e instaciação do objeto
        // p1 -> instância do objeto ou objeto da classe produto

        Produto p1 = new Produto(); // Construtor

        p1.nome = "Notebook";
        p1.preco = 2.367f;
        p1.desconto = 15.0f;

        System.out.print("====== Produtos ========");
        System.out.print("\n" + p1.nome + "\n");
        System.out.print("R$ " + p1.preco + "\n");
        System.out.print(p1.desconto + "%\n");

        // =================================================================

        Produto p0 = new Produto(); // Construtor

        p0.nome = "\nCaneta Bic";
        p0.preco = 2.45f;
        p0.desconto = 5;

        System.out.print("====== Produtos ========");
        System.out.print(p0.nome + "\n");
        System.out.print("R$ " + p0.preco + "\n");
        System.out.print(p0.desconto + "%\n");


        // =================================================================

        src.PessoaPrograma22 pessoaPrograma221 = new src.PessoaPrograma22(); // Construtor

        pessoaPrograma221.nome = "Igor";
        pessoaPrograma221.email = "igorrc23@live.com";
        pessoaPrograma221.ano_nascimento = 1995;

        System.out.print("\n====== Pessoas ======");
        System.out.println("\nNome: " + pessoaPrograma221.nome);
        System.out.println("Email: " + pessoaPrograma221.email);
        System.out.println("Nascimento: " + pessoaPrograma221.ano_nascimento);

    }
}
