import java.util.Locale;

public class Dados {

    public static void main(String[] args){

        // Mudar o separador de casas decimais
        Locale.setDefault(Locale.US);

        // variável INT
        int x, y;
        x = 10;
        y = 20;

        // variavel double
        double z;
        z = 3319.50;

        // variaveis diversas
        int idade;
        double salario, altura;
        char genero;
        String nome;

        idade = 39;
        salario = 5800.5;
        altura = 1.81;
        genero = 'M';
        nome = "Carlos Junior";

        System.out.println(x);
        System.out.println(y);
        System.out.println(x + y);

        // Imprimir com duas casas decimais
        System.out.printf("%.2f", z);
        System.out.println();

        // Imprimir frase inteira
        System.out.println("O funcionário " + nome + " , sexo " + genero + ", ganha: R$ "
            + String.format("%.2f", salario) + ", tem " + idade + " anos. e mede " + altura + " de altura.");
    }

}
