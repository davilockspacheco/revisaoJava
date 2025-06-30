public class Tecnico extends Funcionarios {
    protected String tipo;
    private double salarioFinal;

    public Tecnico(String matricula, String nome, String sexo, int idade, double salario, String tipo) {
        super(matricula, nome, sexo, idade, salario);
        this.tipo = tipo;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("\nMatrícula: " + matricula + "\nNome: " + nome + "\nSexo: " + sexo + "\nIdade: " + idade + "\nSalário base: " + salario + "\nSalário final(+ 10%): " + salarioFinal + "\nTipo de técnico: " + tipo);
    }

    @Override
    public void calcularSalarios() {
        salarioFinal = salario * 1.10;
    }
}