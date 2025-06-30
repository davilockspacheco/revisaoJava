public class Funcionarios {

    protected String matricula;
    protected String nome;
    protected String sexo;
    protected int idade;
    protected double salario;

    public Funcionarios(String matricula, String nome, String sexo, int idade, double salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.salario = salario;
    }

    public void calcularSalarios() {
        //?????
    }

    public void mostrarInfo() {
        System.out.println(">>>Informações aqui<<<");
        //????
    }
}