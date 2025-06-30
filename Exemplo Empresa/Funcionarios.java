// Classe pai(Questão 1[Empresa])
import javax.swing.JOptionPane;

public class Funcionarios {
    private int matricula,idade;
    private String nome,sexo;
    private double salarioBase;

    public Funcionarios(int matricula, String nome, String sexo, int idade, double salarioBase){
        this.idade = idade;
        this.matricula = matricula;
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public void mostrarInformações(){
        JOptionPane.showMessageDialog(null,"Matricula:     "+matricula);
        JOptionPane.showMessageDialog(null,"Nome:          "+nome+"\nSexo:          "+sexo);
        JOptionPane.showMessageDialog(null,"Idade:         "+idade+"\nSalário base:  "+salarioBase);
    }
}