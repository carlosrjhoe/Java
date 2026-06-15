package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;


public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double pA = (x.a + x.b + x.c) / 2.0;
        double areaX = Math.sqrt(pA * (pA - x.a) * (pA - x.b) * (pA - x.c));

        double pB = (y.a + y.b + y.c) / 2.0;
        double areaY = Math.sqrt(pB * (pB - y.a) * (pB - x.b) * (pB - x.c));

        System.out.print("Area of triangle X: " + String.format("%.4f%n", areaX));
        System.out.print("Area of triangle Y: " + String.format("%.4f%n", areaY));

        if (areaX > areaY) {
            System.out.println("Larger area is X");
        } else {
            System.out.println("Larger area is Y");
        }
        sc.close();
    }
}