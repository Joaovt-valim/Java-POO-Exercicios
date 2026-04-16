import java.util.Scanner;

public class aluno extends Pessoas{
   Scanner scanner = new Scanner(System.in);
    @Override
    public void apresentar() {
        System.out.println("informe seu nome: ");
        String nomeAluno = scanner.next();
        setNome(nomeAluno);
        System.out.println("Informe sua idade: ");
        int idadeAluno = scanner.nextInt();
        setIdade(idadeAluno);
        System.out.println("informe sua matricula: ");
        String matriculaAluno= scanner.next();
        set
        System.out.println("Sou o aluno %s, e tenho $s anos e minha matricula e %s",getNome(),getIdade(), );
    }
}
