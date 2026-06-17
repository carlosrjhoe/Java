package application;

import util.Calculadora;

import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class ProgramCalulosPI {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Calculadora calc = new Calculadora();

        System.out.print("Digite o raio: ");
        double raio = sc.nextDouble();

        double circunferencia = calc.valorCircuferencia(raio);
        double volume = calc.valorVolume(raio);

        System.out.printf("Circunferencia: %.2f%n", circunferencia);
        System.out.printf("Volume: %.2f%n", volume);
        System.out.printf("PI: %.2f%n", calc.PI);

        sc.close();
    }
}
