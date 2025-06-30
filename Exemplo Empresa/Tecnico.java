import javax.swing.JOptionPane;

public class Tecnico extends Funcionarios{
    String tipo;
    public Tecnico(int matricula, String nome, String sexo, int idade, double salarioBase,String tipo) {
        super(matricula, nome, sexo, idade, salarioBase);
        this.tipo = tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }
    public static Tecnico cadastrarFuncionarios(){
        JOptionPane.showMessageDialog(null,"CADASTRO TÉCNICO");
        int matricula = Integer.parseInt(JOptionPane.showInputDialog("Matricula: "));
        String nome = JOptionPane.showInputDialog("Nome: ");
        String sexo = JOptionPane.showInputDialog("Sexo: ");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
        double salarioBase = Double.parseDouble(JOptionPane.showInputDialog("Salário base: "));
        String tipo = JOptionPane.showInputDialog("Tipo: ");
        Tecnico x = new Tecnico(matricula, nome, sexo, idade, salarioBase, tipo);
        return x;
    }
    public void calcularSalario(double salarioBase){
        double salarioFinal = (salarioBase* 1.10);
        JOptionPane.showMessageDialog(null,"Calculando salário do último Técnico cadastrado...");
        JOptionPane.showMessageDialog(null,"Salário base:  R$"+salarioBase+"\n*Salário final*:  R$"+salarioFinal);
    }
    public void mostrarInformações(){
        super.mostrarInformações();
        JOptionPane.showMessageDialog(null,"Funcionário:        Tecnico\nTipo:      "+tipo);
    }
}
