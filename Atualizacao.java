package Questao2Tecnica;

import javax.swing.JOptionPane;

public class Atualizacao extends Servicos {
    String versao;
    double valorHora;
    public Atualizacao(int codigo, String descricao, String tecnico, int tempoDuracao, String versao, double valorHora) {
        super(codigo, descricao, tecnico, tempoDuracao);
        this.versao = versao;
        this.valorHora = valorHora;
    }
    public String getversao() {
        return versao;
    }
    public void setversao(String versao) {
        this.versao = versao;
    }
    public double getValorHora() {
        return valorHora;
    }
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    public static Atualizacao cadastrarServicos(){
        JOptionPane.showMessageDialog(null,"CADASTRO Atualizacao");
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("codigo: "));
        String descricao = JOptionPane.showInputDialog("descricao: ");
        String tecnico = JOptionPane.showInputDialog("tecnico: ");
        int tempoDuracao = Integer.parseInt(JOptionPane.showInputDialog("tempo Duracao: "));
        double valorHora = Double.parseDouble(JOptionPane.showInputDialog("valor hora: "));
        String versao = JOptionPane.showInputDialog("versao: ");
        Atualizacao x = new Atualizacao(codigo, descricao, tecnico, tempoDuracao, versao, valorHora);
        return x;
    }
}
