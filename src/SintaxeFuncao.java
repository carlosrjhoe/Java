import java.util.Scanner;

public class SintaxeFuncao {
    public static void main(String[] args) {
        /*
        double y = 25.0;
        double x = Math.sqrt(y);

        System.out.println(x);
        System.out.println(y);
        */

        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite treis números: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int valor = max(a, b, c);
        showResult(valor);

        sc.close();
    }

    public static int max(int a, int b, int c) {
        int variavel;
        if (a > b && a > c) {
            variavel = a;
        } else if (b > c) {
            variavel = b;
        } else {
            variavel = c;
        }
        return variavel;
    }

    public static void showResult(int value) {
        System.out.println("O maior é: " + value);
    }

    public static void showResult2(int value) {
        System.out.println("O maior é: " + value);
    }
}
