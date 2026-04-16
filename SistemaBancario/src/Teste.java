public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Conta_Corrente cc = new Conta_Corrente();
    Conta_Poupanca ccp = new Conta_Poupanca();
    System.out.println("BEM VINDO AO SISTEMA DO BANCO");
    System.out.println("1- CONSULTAR A CONTA CORRENTE");
    System.out.println("2- CONSULTAR A CONTA POUPANCA");
    System.out.println("DIGITE O NUMERO QUE DESEJA: ");
    int NumInterface = scanner.nextInt();
    switch (NumInterface) {
        case 1:
            System.out.println("Bem vindo a conta corrente o usuario pode:");
            System.out.println("1-Consultar o saldo");
            System.out.println("2-depositar");
            System.out.println("3-Sacar");
            System.out.println("Escolha uma das opcoes:");
            int InteConCorrente = scanner.nextInt();
            switch (InteConCorrente) {
                case 1:
                   cc.getSaldo();
                    break;
                case 2:
                    cc.depositar();
                    break;
                case 3:
                    cc.sacar();
                    break;
                default:
                    System.out.print("Opcap nao disponivel");
            }
            break;
        case 2:
            System.out.println("Bem vindo a conta poupanca o usuario pode:");
            System.out.println("1-depositar");
            System.out.println("2-Sacar");
            System.out.println("3- consultar rendimento");

            System.out.println("Escolha uma das opcoes:");
            int InteConPoupanca = scanner.nextInt();
            switch (InteConPoupanca) {

                case 1:
                    ccp.depositar();
                    break;
                case 2:
                    ccp.sacar();
                    break;
                case 3:
                    ccp.calcularRendimento();
                    break;
                default:
                    System.out.print("Opcap nao disponivel");

            }
            break;
        default:
            System.out.printf("Coloque um numero valido");
    }
}