package application;
import entities.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class ProgramRetangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a largura e a altura do retângulo: ");
        double largura = sc.nextDouble();
        double altura = sc.nextDouble();

        Retangulo obj = new Retangulo(largura, altura);

        System.out.println("AREA = " + String.format("%.2f", obj.calcularArea()));
        System.out.println("PERÍMETRO = " + String.format("%.2f", obj.calcularPerimetro()));
        System.out.println("DIAGONAL = " + String.format("%.2f", obj.calcularDiagonal()));

        sc.close();
    }
}
