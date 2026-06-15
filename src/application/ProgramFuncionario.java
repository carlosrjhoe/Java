package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class ProgramFuncionario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario obj = new Funcionario();

        System.out.print("Nome: ");
        obj.nome = sc.nextLine();
        System.out.print("Salario bruto: ");
        obj.salarioBruto = sc.nextDouble();
        System.out.print("Taxa: ");
        obj.taxa = sc.nextDouble();

        System.out.println();
        System.out.println("Funcionário: " + obj);

        System.out.print("Qual porcentagem do aumento o salárial: ");
        double value = sc.nextDouble();
        obj.aumentoSalario(value);

        System.out.println();
        System.out.println("Dados atualizados: " + obj);

        sc.close();
    }
}
