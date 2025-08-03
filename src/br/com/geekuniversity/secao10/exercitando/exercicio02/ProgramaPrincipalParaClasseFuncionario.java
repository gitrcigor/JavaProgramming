package src.br.com.geekuniversity.secao10.exercitando.exercicio02;

public class ProgramaPrincipalParaClasseFuncionario {
    public static void main(String[] args) {

        float novoSalario = 0;

        Funcionario funcionario01 = new Funcionario("Igor", "QA", 25000.f, "TI");

        funcionario01.reajusteSalarioEm20Porcento(funcionario01.getNome(), funcionario01.getCargo(), funcionario01.getSalario(), funcionario01.getDepartamento());


        System.out.println("\nNovo salário do funcionário " + funcionario01.getNome() + " é de: R$" + funcionario01.getSalario());



    }


}
