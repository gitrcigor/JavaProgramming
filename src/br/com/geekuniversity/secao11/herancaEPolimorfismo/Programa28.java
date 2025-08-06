package src.br.com.geekuniversity.secao11.herancaEPolimorfismo;

//Aula 61 - Herança e Polimorfismo


public class Programa28 {

    public static void main(String[] args) {

        //Aulas sobre Herança

        Pessoa p1 = new Pessoa("Igor", 1995, "aluno@live.com");

        Aluno a1 = new Aluno("Isa", 1996, "aluno@outlook.com", "123456");

        Professor prof1 = new Professor("João", 1980, "prof@gmail.com", "ABC999");

        Zelador zelador = new Zelador("Zé Caderudo", 1955, "jose@zelador.com", "Zelador");

        System.out.print("\nPessoa 01: \n" + p1.getNome() + "\nAno de Nascimento: " + p1.getAnoNascimento() + "\nEmail: " + p1.getEmail());
        System.out.print("\n\nAluno 01: \n" + a1.getNome() + " \nAno de Nascimento: " + a1.getAnoNascimento() + "\nEmail: " + a1.getEmail() + " \nRegistro Acadêmico: " + a1.getRa());
        System.out.print("\n\nProfessor 01: \n" + prof1.getNome() + "\nAno de Nascimento: " + prof1.getAnoNascimento() + "\nEmail: " + prof1.getEmail() + "\nMatrícula: " + prof1.getMatricula());
        System.out.print("\n\n\n");






    }

}
