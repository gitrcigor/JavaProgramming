package src.br.com.geekuniversity.secao12.exercitando.execicio01;
/*
Exercício retirado do google
* 1. Figuras Geométricas:
Crie uma classe abstrata Figura com um método abstrato calcular_area().
Crie subclasses concretas como Retangulo, Circulo e Triangulo que herdam de Figura e implementam o método calcular_area() de acordo com suas fórmulas específicas.
*
*
* */
public class ProgramaPrincipalParaClasseFigura {
    public static void main(String[] args) {
        System.out.print("\n--- Figura Retângulo ---");
        Retangulo retangulo01 = new Retangulo(4,7);
        System.out.println("\nÁrea é igual a: " + retangulo01.calcularArea() + "m²");
        System.out.println("Perímetro é igual a: " + retangulo01.calcularPerimetro() + "m");

        System.out.print("\n--- Figura Quadrado ---");
        Quadrado quadrado01 = new Quadrado(4,4);
        System.out.println("\nÁrea é igual a: " + quadrado01.calcularArea() + "m²");
        System.out.println("Perímetro é igual a: " + quadrado01.calcularPerimetro() + "m");



    }
}

