package src.br.com.geekuniversity.secao12.templateMethod;
//Aula 69
//Template Method
//Fonte para consulta: https://refactoring.guru/pt-br/design-patterns/template-method

public class TreinamentoFimTemporada extends Treinamento {


    @Override
    public void preparoFisico() {
        System.out.print("\nPreparo físico de fim de temporada...");
    }

    @Override
    public void jogoTreino() {
        System.out.print("\nJogo treino de fim de temporada...");
    }
}
