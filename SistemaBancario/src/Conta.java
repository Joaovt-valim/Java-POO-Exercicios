import java.util.Scanner;

public abstract class Conta {
    private double numero;

    private double saldo;

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getNumero() {
        return numero;
    }

    public void setSaldo(double saldo) {
        if(saldo < 0){
            System.out.println("Saldo nao pode ser negativo");
            return;
        } this.saldo = saldo;
    }

    public double getSaldo() {
            return saldo;
    }

    public void depositar(){
       Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um Valor para depositar:");
       double ValorDepositar = scanner.nextDouble();
        setSaldo(saldo+ ValorDepositar);
        System.out.println("Deposito feito com sucesso!!! ");
    };
    public abstract void sacar();
    public abstract void calcularRendimento();


}
