package ex1;
public class Funcionarios {
    protected String matricula;
    protected String nome;
    protected String sexo;
    protected int idade;
    protected double salario;
    protected double salarioFinal;

    public Funcionarios(String matricula, String nome, String sexo, int idade, double salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.salario = salario;
    }

    public void calcularSalarios() {
        salarioFinal = salario * 1.15;
    }

    public void mostrarInfo() {
        System.out.println(">>>Informações aqui<<<");
        System.out.println("\nMatrícula: " + matricula + "\nNome: " + nome + "\nSexo: " + sexo + "\nIdade: " + idade + "\nSalário base: " + salario + "\nSalário final(+ 15%): " + salarioFinal + "\nSetor: " + setor);
    }
}