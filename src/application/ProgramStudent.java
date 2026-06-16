package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class ProgramStudent {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student objStudent = new Student();

        System.out.print("Digite o seu nome: ");
        objStudent.name = sc.nextLine();
        System.out.println("Digite suas notas: ");
        objStudent.grade1 = sc.nextDouble();
        objStudent.grade2 = sc.nextDouble();
        objStudent.grade3 = sc.nextDouble();

        if (objStudent.finalGrade() < 60) {
            System.out.println("FAILED.");
            System.out.printf("%s MISSING %.2f POINT'S%n",
                    objStudent.name, objStudent.missinPoint());
        } else {
            System.out.println("PASSED.");
        }
        sc.close();
    }
}
