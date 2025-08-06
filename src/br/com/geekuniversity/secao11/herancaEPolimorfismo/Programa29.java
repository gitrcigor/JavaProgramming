package src.br.com.geekuniversity.secao11.herancaEPolimorfismo;
// Aula 63
// Sobrecarga de método
// Overloading
// Ocorre quando sobrescrevemos um método na mesma classe de declaração

public class Programa29 {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        p1.mensagem();

        p1.mensagem("\nTeste método 2, mensagem passada por parâmetro.");

        p1.mensagem("\nTeste método 3 + número qualquer = ", 58);


    }
}
