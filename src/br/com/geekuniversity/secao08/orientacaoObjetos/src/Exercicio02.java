package src;

/*
2. Crie uma classe Agenda que pode armazenar contatos, podendo realizar as seguintes
operações:
- void armazenarContato(Contato contato);
- void removeContato(Contato contato);
- int buscaContato(String nome); // Informa em que posição da agenda está o contato.
- void imprimeAgenda(); // Imprime os dados de todos os contatos da agenda.
- void imprimeContato(int index); // Imprime os dados do contato que está no índice informado.
 */


public class Exercicio02 {
    public static void main(String[] args) {

        //Construtor
        AgendaExe02 minhaAgendaExe02 = new AgendaExe02();

        Contato contato1 = new Contato();
        contato1.setNome("Igor Calixto");
        contato1.setEmail("igorrc23@live.com");
        contato1.setTelefone("1234-5678");

        Contato contato2 = new Contato();
        contato2.setNome("Tester testador");
        contato2.setEmail("igorrc@gmail.com");
        contato2.setTelefone("1234-5678");

        Contato contato3 = new Contato();
        contato3.setNome("QA engineer");
        contato3.setEmail("qa@hotmail.com");
        contato3.setTelefone("8888-9999");

        //- armazenarContato
        minhaAgendaExe02.armazenarContato(contato1);
        minhaAgendaExe02.armazenarContato(contato2);
        minhaAgendaExe02.armazenarContato(contato3);

        //- imprimeAgenda
        minhaAgendaExe02.imprimeAgenda();

        //- imprimeContato
        minhaAgendaExe02.imprimeContato(2);   //qa engineer

        //- buscaContato
        minhaAgendaExe02.buscaContato("Tester testador"); // indice 1

        //- removeContato
        minhaAgendaExe02.removeContato(contato3);

        //- imprimeAgenda novamente
        minhaAgendaExe02.imprimeAgenda();
    }

}
