package application;

import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class ProgramCalulosPI {

    public static final double PI = 3.14159;

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio: ");
        double raio = sc.nextDouble();

        double circunferencia = valorCircuferencia(raio);
        double volume = valorVolume(raio);

        System.out.printf("Circunferencia: %.2f%n", circunferencia);
        System.out.printf("Volume: %.2f%n", volume);
        System.out.printf("PI: %.2f%n", PI);

        sc.close();
    }

    public static double valorCircuferencia(double raio) {
        return 2.0 * PI * raio;
    }

    public static double valorVolume(double raio) {
        return 4.0 * PI * Math.pow(raio, 3) / 3.0;
    }
}
