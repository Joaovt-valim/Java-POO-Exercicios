import java.util.Scanner;

public class Conta_Poupanca extends Conta{
    @Override
    public void depositar() {
        super.depositar();
    }

    @Override
    public void sacar() {
            Scanner scanner = new Scanner(System.in);

            System.out.println(getSaldo()+ "]\nQuanto o usuario deseja sacar?");
            double ValorSaque= scanner.nextDouble();
            if(getSaldo()<ValorSaque ){
                System.out.println("Saldo insuficiente");
                return;
            }
            setSaldo(getSaldo()-ValorSaque);
            System.out.println(getSaldo() );
    }

    @Override
    public void calcularRendimento() {

      setSaldo(getSaldo()*1.005);
        System.out.printf("O rendimento da Poupanca foi de %.2f%n", getSaldo()%1.005);
    }
}
