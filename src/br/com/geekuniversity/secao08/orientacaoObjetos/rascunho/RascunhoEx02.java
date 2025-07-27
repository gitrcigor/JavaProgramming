package rascunho;

public class RascunhoEx02 {

    public static void main(String[] args) {

        // Construtor da classe Livro
        LivroEx02 livroEx02 = new LivroEx02();

        livroEx02.autor = "Monteiro Lobato";
        livroEx02.categoria = "Infantil";
        livroEx02.paginas = 76;
        livroEx02.titulo = "Sitio do pica-pau amarelo";
        livroEx02.lido = true;

        //Exibindo sem passagem de parâmetro

        System.out.print("\n====== Livro 01 ======\n");
        System.out.println("Título: " + livroEx02.titulo);
        System.out.println("Autor: " + livroEx02.autor);
        System.out.println("Categoria: " + livroEx02.categoria);
        System.out.println("Páginas: " + livroEx02.paginas);
        System.out.println("Lido: " + livroEx02.lido);


        // Exibindo com passagem de parâmetro

        System.out.print("\n====== Livro 02 ======\n");
        LivroEx02 meuLivroEx02 = new LivroEx02("O diario de anne frank", "anne frank", "Drama", 320, false);

        meuLivroEx02.imprimeLivros();

    }
}
