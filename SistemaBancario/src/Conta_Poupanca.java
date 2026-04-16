import java.util.Scanner;

public class Conta_Poupanca extends Conta{
    @Override
    public void sacar() {
            Scanner scanner = new Scanner(System.in);
            double taxa = 2;
            System.out.println("Quanto o usuario deseja sacar?: ");
            double ValorSaque= scanner.nextDouble();
            if(getSaldo()- taxa<0 ){
                System.out.println("Saldo insuficiente");
                return;
            }
            setSaldo(getSaldo()-ValorSaque);
            System.out.println(getSaldo() );
    }

    @Override
    public void calcularRendimento() {

      setSaldo(getSaldo()*1.005);
        System.out.println("O rendimento da Poupanca foi de "+ getSaldo()%1.005);
    }
}
