package application;

import entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class ProgramPessoa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Pessoa objPessoa1 = lerPessoa(sc, "Pessoa 1");
        Pessoa objPessoa2 = lerPessoa(sc, "Pessoa 2");

        double idadeMedia = (objPessoa1.idade + objPessoa2.idade) / 2;

        System.out.printf("A idade média de %s e %s é de %.2f%n",
                objPessoa1.nome, objPessoa2.nome, idadeMedia);

        sc.close();
    }

    private static Pessoa lerPessoa(Scanner sc, String titulo) {
        Pessoa pessoa = new Pessoa();

        System.out.println("Dados da " + titulo + ": ");
        System.out.print("Nome: ");
        pessoa.nome = sc.nextLine();
        System.out.print("Idade: ");
        pessoa.idade = sc.nextInt();
        System.out.print("Nota: ");
        pessoa.nota = sc.nextDouble();
        sc.nextLine();

        return pessoa;
    }
}
