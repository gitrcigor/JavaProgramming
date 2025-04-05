package src;

/*
- Objetos são produtos/instâncias da classe;

 */

public class Programa22 {

    public static void main(String[] args) {

        int numero = 4;

        // Declaração e instaciação do objeto
        // p1 -> instância do objeto ou objeto da classe produto
        Produto p0 = new Produto(); // Construtor
        Produto p1 = new Produto(); // Construtor

        p1.nome = "Notebook";
        p1.preco = 2.367f;
        p1.desconto = 15.0f;

        System.out.print("======Produtos========");
        System.out.print("\n" + p1.nome + "\n");
        System.out.print("R$ " + p1.preco + "\n");
        System.out.print(p1.desconto + "%\n");

        p0.nome = "\nCaneta Bic";
        p0.preco = 2.45f;
        p0.desconto = 5;

        System.out.print(p0.nome + "\n");
        System.out.print("R$ " + p0.preco + "\n");
        System.out.print(p0.desconto + "%\n");

        Pessoa pessoa1 = new Pessoa(); // Construtor

        pessoa1.nome = "Igor";
        pessoa1.email = "igorrc23@live.com";
        pessoa1.ano_nascimento = 1995;

        System.out.print("\n======Pessoas======");
        System.out.println("\nNome: " + pessoa1.nome);
        System.out.println("Email: " + pessoa1.email);
        System.out.println("Nascimento: " + pessoa1.ano_nascimento);

    }
}
