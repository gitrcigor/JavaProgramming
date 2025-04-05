package src;

// Construtor

/*
- O construtor da classe sempre tem o mesmo nome da classe;
- Por padrão, a JVM, cria em tempo de execução um construtor padrão - um construtor vazio;
- Podemos ter mais de um construtor na classe;
 */

public class Programa24 {

    public static void main(String[] args) {

        // ================ Construtor sem parâmetro ===================

        Pessoa pessoa1 = new Pessoa(); // Construtor

        pessoa1.nome = "Testador QA";
        pessoa1.email = "tester@gmail.com";
        pessoa1.ano_nascimento = 1995;

        System.out.println("\nNome: " + pessoa1.nome);
        System.out.println("Email: " + pessoa1.email);
        System.out.println("Ano Nascimento: " + pessoa1.ano_nascimento);

        // ================ Construtor com parâmetro ===================
        // ================ Imprimindo usando método ===================

        Pessoa pessoa2 = new Pessoa("Igor Tester", "qa@live.com", 1995);

        pessoa2.imprime_info();

    }

}
