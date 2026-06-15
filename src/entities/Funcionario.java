package entities;

public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double taxa;

    public double descontoSalario() {
        return salarioBruto - taxa;
    }

    public void aumentoSalario(double valor) {
        salarioBruto += salarioBruto * valor / 100.0;
    }

    @Override
    public String toString() {
        return nome + ", "
                + "salário: R$ "
                + String.format("%.2f", descontoSalario());
    }
}
