public class Supervisor extends Funcionarios {
    public String setor;
    private double salarioFinal;

    public Supervisor(String matricula, String nome, String sexo, int idade, double salario, String setor) {
        super(matricula, nome, sexo, idade, salario);
        this.setor = setor;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("\nMatrícula: " + matricula + "\nNome: " + nome + "\nSexo: " + sexo + "\nIdade: " + idade + "\nSalário base: " + salario + "\nSalário final(+ 20%): " + salarioFinal + "\nSetor: " + setor);
    }

    @Override
    public void calcularSalarios() {
        salarioFinal = salario * 1.20;
    }
}