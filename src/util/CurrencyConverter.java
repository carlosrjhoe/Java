package util;

public class CurrencyConverter {
    public static final double IOF = 0.06;

    public static double converterComIof(double cotacaoDolar, double quantidadeDolares) {
        double valorBase = cotacaoDolar * quantidadeDolares;
        double imposto = valorBase * IOF;
        return valorBase + imposto;
    }

}
