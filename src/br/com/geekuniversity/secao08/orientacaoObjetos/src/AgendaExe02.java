package src.br.com.geekuniversity.secao08.orientacaoObjetos.src;

import src.br.com.geekuniversity.secao08.orientacaoObjetos.src.Contato;

import java.util.ArrayList;

public class AgendaExe02 {

    //>>Atributos
    ArrayList<Contato> contatos = new ArrayList<Contato>();

    //>>Construtor
    public AgendaExe02() {
    }

    //>>Métodos
    public void armazenarContato(Contato contato) {
        this.contatos.add(contato);
    }

    public void removeContato(Contato contato) {
        this.contatos.remove(contato);
    }

    public int buscaContato(String nome) {
        // Informa em que posição da agenda está o contato.
        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).getNome() == nome) {
                return i;
            }

        }
        System.out.print("\n");
        System.out.print("Buscando contato escolhido: ");

        return -1;
    }

    public void imprimeAgenda() {
        // Imprime os dados de todos os contatos da agenda.
        System.out.print("======= Agenda =======");
        for (Contato contato : contatos) {
            contato.imprime_informacoes();
        }
        System.out.print("======= Fim =======");
    }

    public void imprimeContato(int index) {
        // Imprime os dados do contato que está no índice informado.
        System.out.print("\n");
        System.out.print("Imprimindo contato escolhido: ");
        contatos.get(index).imprime_informacoes();
    }
}
