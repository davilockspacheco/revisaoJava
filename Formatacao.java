package Questao2Tecnica;

import javax.swing.JOptionPane;

public class Formatacao extends Servicos{
    String formato;
    double valorHora;
    public Formatacao(int codigo, String descricao, String tecnico, int tempoDuracao, String formato, double valorHora) {
        super(codigo, descricao, tecnico, tempoDuracao);
        this.formato = formato;
        this.valorHora = valorHora;
    }
    public String getformato() {
        return formato;
    }
    public void setformato(String formato) {
        this.formato = formato;
    }
    public double getValorHora() {
        return valorHora;
    }
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    public static Formatacao cadastrarServicos(){
        JOptionPane.showMessageDialog(null,"CADASTRO Formatacao");
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("codigo: "));
        String descricao = JOptionPane.showInputDialog("descricao: ");
        String tecnico = JOptionPane.showInputDialog("tecnico: ");
        int tempoDuracao = Integer.parseInt(JOptionPane.showInputDialog("tempo Duracao: "));
        double valorHora = Double.parseDouble(JOptionPane.showInputDialog("valor hora: "));
        String formato = JOptionPane.showInputDialog("formato: ");
        Formatacao x = new Formatacao(codigo, descricao, tecnico, tempoDuracao, formato, valorHora);
        return x;
    }
}
