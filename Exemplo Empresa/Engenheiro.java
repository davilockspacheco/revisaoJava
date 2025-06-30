import javax.swing.JOptionPane;

public class Engenheiro extends Funcionarios{
    String areaAtuacao;
    public Engenheiro(int matricula, String nome, String sexo, int idade, double salarioBase,String areaAtuacao) {
        super(matricula, nome, sexo, idade, salarioBase);
        this.areaAtuacao = areaAtuacao;
    }
    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }
    public String getAreaAtuacao() {
        return areaAtuacao;
    }
    public static Engenheiro cadastrarFuncionarios(){
        JOptionPane.showMessageDialog(null,"CADASTRO ENGENHEIRO");
        int matricula = Integer.parseInt(JOptionPane.showInputDialog("Matricula: "));
        String nome = JOptionPane.showInputDialog("Nome: ");
        String sexo = JOptionPane.showInputDialog("Sexo: ");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
        double salarioBase = Double.parseDouble(JOptionPane.showInputDialog("Salário base: "));
        String areaAtuacao = JOptionPane.showInputDialog("Área de atuação: ");
        Engenheiro x = new Engenheiro(matricula, nome, sexo, idade, salarioBase, areaAtuacao);
        return x;
    }
    public void calcularSalario(double salarioBase){
        double salarioFinal = (salarioBase* 1.15);
        JOptionPane.showMessageDialog(null,"Calculando salário do último Engenheiro cadastrado...");
        JOptionPane.showMessageDialog(null,"Salário base:  R$"+salarioBase+"\n*Salário final*:  R$"+salarioFinal);
    }
    public void mostrarInformações(){
        super.mostrarInformações();
        JOptionPane.showMessageDialog(null,"Funcionário:        Engenheiro\nÁrea de atuação:      "+areaAtuacao);
    }
    
}
    
