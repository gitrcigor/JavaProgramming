package src.br.com.geekuniversity.secao11.herancaEPolimorfismo;
// Aula 62
// Polimorfismo = muitas formas
// Objetos do mesmo tipo podem agir de formas diferentes
// Aprendendo a usar o método toString()

public class ClasseTemporaria {
    public static void main(String[] args) {

        //Polimorfismo - Aula 62
        Pessoa p1 = new Pessoa("Igor", 1995, "aluno@live.com");
        System.out.println(p1);

        Aluno a1 = new Aluno("Isa", 1996, "aluno@outlook.com", "123456");
        System.out.println(a1);

        Professor prof1 = new Professor("João", 1980, "prof@gmail.com", "ABC999");
        System.out.println(prof1);

        Zelador zelador = new Zelador("Zé Caderudo", 1955, "jose@zelador.com", "Zelador");
        System.out.println(zelador);
    }

}
