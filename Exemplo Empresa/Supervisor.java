import javax.swing.JOptionPane;

public class Supervisor extends Funcionarios {
    String setor;
    public Supervisor(int matricula, String nome, String sexo, int idade, double salarioBase,String setor) {
        super(matricula, nome, sexo, idade, salarioBase);
        this.setor = setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    public String getSetor() {
        return setor;
    }
    public static Supervisor cadastrarFuncionarios(){
        JOptionPane.showMessageDialog(null,"CADASTRO SUPERVISOR");
        int matricula = Integer.parseInt(JOptionPane.showInputDialog("Matricula: "));
        String nome = JOptionPane.showInputDialog("Nome: ");
        String sexo = JOptionPane.showInputDialog("Sexo: ");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
        double salarioBase = Double.parseDouble(JOptionPane.showInputDialog("Salário base: "));
        String setor = JOptionPane.showInputDialog("setor: ");
        Supervisor x = new Supervisor(matricula, nome, sexo, idade, salarioBase, setor);
        return x;
    }
    public void calcularSalario(double salarioBase){
        double salarioFinal = (salarioBase* 1.20);
        JOptionPane.showMessageDialog(null,"Calculando salário do último supervisor cadastrado...");
        JOptionPane.showMessageDialog(null,"Salário base:  R$"+salarioBase+"\n*Salário final*:  R$"+salarioFinal);
    }
    public void mostrarInformações(){
        super.mostrarInformações();
        JOptionPane.showMessageDialog(null,"Funcionário:        Supervisor\nSetor:      "+setor);
    }

}
