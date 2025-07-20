package rascunho;

/*
Write a Java program where the "Cat" class includes a method to set a cat's breed.
Write a Java program where the "Cat" class supports a method to determine if a cat is a kitten (age < 1 year).
Write a Java program where the "Cat" class allows setting and getting the cat’s weight.
Write a Java program where the "Cat" class includes a method to compare the ages of two cats.
Resource: https://www.w3resource.com/java-exercises/constructor/java-constructor-exercise-1.php
 */

public class CatEx03 {

    //Atributos
    String nome;
    int idade;
    int idadeSegundoGato;
    String breed;
    private float weight;

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }



    public void setBreed(String breed) {
        this.breed = breed;
    }

    //Construtor vazio
    public CatEx03() {

    }

    //Construtor
//    public CatEx03 () {
//        this.nome = "unknow";
//        this.idade = 0;
//        }

    //Construtor com parâmetro
    public CatEx03(String breed) {
        this.breed = breed;
    }


    // Métodos da classe
    // Método pra imprimir nome e idade
    void imprimeCat() {
        System.out.print("\n");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);

    }

    // Método pra imprimir raça
    void setCatsBreed(String breed) {
        System.out.print("\nRaça: " + breed);

    }

    // Método pra dizer se filhote, coletando idade no programa principal
    void determineIsKitten(int idade) {
        if (idade < 1) {
            System.out.print("\nO gato é filhote!");
        } else
            System.out.print("\nO gato é adulto!");

    }

    void compararIdadeDoisGatos(int idade, int idadeSegundoGato) {

        this.idade = idade;
        this.idadeSegundoGato = idadeSegundoGato;

        if (this.idade < this.idadeSegundoGato)
            System.out.print("\nO gato mais velho tem " + this.idadeSegundoGato + " anos de idade.");
        else
            System.out.print("\nO gato mais velho tem " + this.idade + " anos de idade.");

    }

}
