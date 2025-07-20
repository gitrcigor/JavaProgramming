package rascunho;
import java.util.Scanner;

// 12/04/2025 - Igor
// Java Constructor - Exercises, Practice, Solution
// https://www.w3resource.com/java-exercises/constructor/java-constructors.php
// 1. Default Constructor:
// Write a Java program to create a class called "Cat" with instance variables name and age.
// Implement a default constructor that initializes the name to "Unknown" and the age to 0.
// Print the values of the variables.


public class RascunhoEx03 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int idadeAnimal = 0;
        int idadeSegundoGato = 0;

        //Construtor
        CatEx03 meuCatEx03 = new CatEx03();

        //Chama método
        meuCatEx03.imprimeCat();

        //Definir raça do gato
        CatEx03 racaGato = new CatEx03();

        System.out.print("\n");
        System.out.print("====== Raça ======");
        racaGato.setCatsBreed("Agora");

        //Verificar se é filhote ou adulto
        CatEx03 kitten = new CatEx03();

        System.out.print("\n");
        System.out.print("====== Idade ======");
        System.out.print("\nInsira a idade do animal: ");
        idadeAnimal = teclado.nextInt();
        kitten.determineIsKitten(idadeAnimal);

        //Setar peso
        CatEx03 setarPesoGato = new CatEx03();
        setarPesoGato.setWeight(4);    // atribuindo valor do peso do gato
        System.out.print("\n");
        System.out.print("====== Peso ======");
        System.out.print("\nO peso do animal é : " + setarPesoGato.getWeight());    // Obtendo o peso do gato
        System.out.print("\n");

        //Comparar idade dois gatos
        CatEx03 compararMeuGato = new CatEx03();
        compararMeuGato.idade = 2;
        compararMeuGato.idadeSegundoGato = 0;

        System.out.print("\n====== Comparar idades ======");
        compararMeuGato.compararIdadeDoisGatos(idadeAnimal, idadeSegundoGato);
    }
}
