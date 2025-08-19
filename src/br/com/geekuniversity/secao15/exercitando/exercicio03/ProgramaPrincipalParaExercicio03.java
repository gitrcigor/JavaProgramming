package src.br.com.geekuniversity.secao15.exercitando.exercicio03;

public class ProgramaPrincipalParaExercicio03 {


    public static void main(String[] args) {

        Conta minhaConta = new Conta(100, 1000, 0, 100);

        minhaConta.setLimite(100);
        minhaConta.deposita(100);
        minhaConta.saca(1000);

    }


}
