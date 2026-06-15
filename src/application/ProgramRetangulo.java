package application;
import entities.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class ProgramRetangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo obj = new Retangulo();

        System.out.println("Digite a largura e a altura do retângulo: ");
        obj.largura = sc.nextDouble();
        obj.altura = sc.nextDouble();

        System.out.println("AREA = " + String.format("%.2f", obj.calcularArea()));
        System.out.println("PERÍMETRO = " + String.format("%.2f", obj.calcularPerimetro()));
        System.out.println("DIAGONAL = " + String.format("%.2f", obj.calcularDiagonal()));

        sc.close();
    }
}
