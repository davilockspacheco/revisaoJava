package ex1;

public class engenheiro extends Funcionarios {
    protected String areaAtuacao;
    protected double salarioFinal;

    public engenheiro(String matricula, String nome, String sexo, int idade, double salario, String areaAtuacao){
        super(matricula, nome, sexo, idade, salario);
        this.areaAtuacao = areaAtuacao;
    }

    @Override
    public void calcularSalarios(){
        salarioFinal = salario * 1.15;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("\nMatrícula: " + matricula + "\nNome: " + nome + "\nSexo: " + sexo + "\nIdade: " + idade + "\nSalário base: " + salario + "\nSalário final(+ 15%): " + salarioFinal + "\nSetor: " + areaAtuacao);
    }
}
