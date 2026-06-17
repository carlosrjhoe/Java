package application;

import util.Calculadora;

import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class ProgramCalulosPI {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio: ");
        double raio = sc.nextDouble();

        double circunferencia = Calculadora.valorCircuferencia(raio);
        double volume = Calculadora.valorVolume(raio);

        System.out.printf("Circunferencia: %.2f%n", circunferencia);
        System.out.printf("Volume: %.2f%n", volume);
        System.out.printf("PI: %.2f%n", Calculadora.PI);

        sc.close();
    }
}
