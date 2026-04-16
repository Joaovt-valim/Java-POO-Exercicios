import java.util.Scanner;

public class Conta_Corrente extends Conta {
    @Override
    public void depositar() {
    super.depositar();
    }

    @Override
    public void sacar() {
        Scanner scanner = new Scanner(System.in);
        double taxa = 2;
        System.out.println("Quanto o usuario deseja sacar?: ");
        double ValorSaque= scanner.nextDouble();

        if(getSaldo() <(ValorSaque+ taxa)){
            System.out.println("Saldo insuficiente");
            return;
        }
        setSaldo(getSaldo()-ValorSaque- taxa);
        System.out.println("Saque realizado! Novo saldo: " + getSaldo() );

    }

    @Override
    public double getSaldo() {
        return super.getSaldo();
    }

    @Override
    public void calcularRendimento() {
        getSaldo();
        System.out.println("\nA conta corrente nao possui rendimento!");

    }

}
