package src.br.com.geekuniversity.secao11.exercitando.exercicio03;

public class Cachorro extends Animal {

    private String raca;

    public Cachorro (String nome, double peso, String raca){
        super(nome, peso);
        this.raca = raca;
    }

    public String raca(){
        return raca;
    }

    @Override
    public String toString() {
        return super.toString() + "\nRaça do Cachorro: " + raca;
    }

}
