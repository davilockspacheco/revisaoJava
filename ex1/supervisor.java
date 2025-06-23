package ex1;

public class supervisor extends Funcionarios {
    protected String setor;
    private double salarioFinal;

    public supervisor(String matricula, String nome, String sexo, int idade, double salario, String setor) {
        super(matricula, nome, sexo, idade, salario);
        this.setor = setor;
    }

    @Override
    public void calcularSalarios() {
        salarioFinal = salario * 1.15;
    }


    @Override
    public void mostrarInfo() {
        System.out.println("\nMatrícula: " + matricula + "\nNome: " + nome + "\nSexo: " + sexo + "\nIdade: " + idade + "\nSalário base: " + salario + "\nSalário final(+ 15%): " + salarioFinal + "\nSetor: " + setor);
    }

}