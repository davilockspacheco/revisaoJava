package ex1;

public class tecnico extends Funcionarios {
    protected String tipo;
    protected double salarioFinal;

    public void tecnico(String matricula, String nome, String sexo, int idade, double salario, String tipo){
        super(matricula, nome, sexo, idade, salario);
        this.tipo = tipo;
    }
    //Substitui as referencias da classe pai
    @Override
    public void calcularSalarios(){
        salarioFinal = salario * 1.10;
    }

    @Override
    public void mostrarInfo(){
        System.out.println("\nMatrícula: " + matricula + "\nNome: " + nome + "\nSexo: " + sexo + "\nIdade: " + idade + "\nSalário base: " + salario + "\nSalário final(+ 15%): " + salarioFinal + "\nSetor: " + tipo);
    }
}
