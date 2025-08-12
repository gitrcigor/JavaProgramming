package src.br.com.geekuniversity.secao12.templateMethod;
//Aula 69
//Template Method
//Fonte para consulta: https://refactoring.guru/pt-br/design-patterns/template-method

public class TreinamentoInicioTemporada extends Treinamento {


    @Override
    public void preparoFisico() {
        System.out.print("\nPreparo físico de início de temporada...");
    }

    @Override
    public void jogoTreino() {
        System.out.print("\nJogo treino de início de temporada...");
    }
}
