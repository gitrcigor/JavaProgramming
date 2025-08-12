package src.br.com.geekuniversity.secao12.templateMethod;
//Aula 69
//Template Method
//Fonte para consulta: https://refactoring.guru/pt-br/design-patterns/template-method
//Modificador final faz com que o elemento que esteja utilizando, não possa ser extendido/reescrito.

public abstract class Treinamento {

    //Template Method
    public final void treinoDiario(){
        preparoFisico();
        jogoTreino();
        treinoTatico();
    }

    public abstract void preparoFisico();

    public abstract void jogoTreino();

    public final void treinoTatico(){
        System.out.print("\nTreino tático...");
    }

}
