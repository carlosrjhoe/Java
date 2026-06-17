package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class ProgramCurrency {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o valor do dolar? ");
        double cotacaoDolar = sc.nextDouble();

        System.out.print("Quantos dolares vai comprar? ");
        double quantidadeDolares = sc.nextDouble();

        double valorTotalEmReais = CurrencyConverter.converterComIof(cotacaoDolar, quantidadeDolares);

        System.out.print("Voce vai pagar R$ "
                + String.format("%.2f", valorTotalEmReais));
    }
}
