import java.util.ArrayList;
import java.util.Scanner;

public abstract class Pessoas {

    private String nome;
    private int idade;
    private String matricula;
    private String disciplina;
    private String tempoGestao;

    public void setIdade(int idade) {this.idade = idade;}
    public int getIdade() {return idade;}

    public void setNome(String nome) {this.nome = nome;}
    public String getNome() {return nome;}

    public void setMatricula(String matricula) {this.matricula = matricula;}
    public String getMatricula() {return matricula;}

    public void setDisciplina(String disciplina) {this.disciplina = disciplina;}
    public String getDisciplina() {return disciplina;}

    

    public abstract void apresentar();
}
