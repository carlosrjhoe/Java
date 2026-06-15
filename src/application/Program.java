package application;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC;

        System.out.println("Enter the measures of triangle X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double pA = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(pA * (pA - xA) * (pA - xB) * (pA - xC));

        double pB = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(pB * (pB - yA) * (pB - xB) * (pB - xC));

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