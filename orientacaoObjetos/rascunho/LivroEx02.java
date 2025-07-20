package rascunho;

public class LivroEx02 {

    //Atributos
    String titulo;
    String autor;
    String categoria;
    float paginas;
    boolean lido;

    //Construtor da classe
    public LivroEx02(){

    }

    // =============== Construtor para o caso de no programa principal ser usado com passagem de parâmetros   =================

    public LivroEx02(String titulo, String autor, String categoria, int paginas, boolean lido){
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.paginas = paginas;
        this.lido = lido;

    }

    //Método da classe
    void imprimeLivros(){
        System.out.print("\nTítulo: " + this.titulo);
        System.out.print("\nAutor: " + this.autor);
        System.out.print("\nCategoria: " + this.categoria);
        System.out.print("\nPáginas: " + this.paginas);
        System.out.print("\nLido: " + this.lido);
    }


}
