import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        int idade;
        double salario;
        double altura;
        char genero;
        String nome;

        idade = 39;
        salario = 5800.5;
        genero = 'M';
        nome = "carlos Junior";
        altura = 1.81;

        System.out.println("NOME = " + nome);
        System.out.println("SALARIO = " + String.format("%.2f", salario));
        System.out.println("GENERO = " + genero);
        System.out.println("IDADE = " + idade);
        System.out.printf("ALTURA = " + String.format("%.2f", altura));

    }
}