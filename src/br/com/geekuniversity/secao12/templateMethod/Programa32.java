package src.br.com.geekuniversity.secao12.templateMethod;

//O padrão template method define o esqueleto de um algoritmo
//detro de um método, transferindo alguns de seus passos para
//as subclasses. O template method permite que as subclasses
//redefinam certos passos de um algoritmo sem alterar a
//estrutura do próprio algoritmo.

public class Programa32 {
    public static void main(String[] args) {

        TreinamentoInicioTemporada treinoInicio = new TreinamentoInicioTemporada();

        treinoInicio.treinoDiario();

        TreinamentoFimTemporada treinoFim = new TreinamentoFimTemporada();

        treinoFim.treinoDiario();
    }
}
