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

        PessoaPrograma22 pessoaPrograma221 = new PessoaPrograma22(); // Construtor

        pessoaPrograma221.nome = "Testador QA";
        pessoaPrograma221.email = "tester@gmail.com";
        pessoaPrograma221.ano_nascimento = 1995;

        System.out.println("\nNome: " + pessoaPrograma221.nome);
        System.out.println("Email: " + pessoaPrograma221.email);
        System.out.println("Ano Nascimento: " + pessoaPrograma221.ano_nascimento);

        // ================ Construtor com parâmetro ===================
        // ================ Imprimindo usando método ===================

        PessoaPrograma22 pessoaPrograma222 = new PessoaPrograma22("Igor Tester", "qa@live.com", 1995);

        pessoaPrograma222.imprime_info();

    }

}
