package Questao2Tecnica;

import javax.swing.JOptionPane;

public class Limpeza extends Servicos{
    String tipo;
    double valorHora;
    public Limpeza(int codigo, String descricao, String tecnico, int tempoDuracao, String tipo, double valorHora) {
        super(codigo, descricao, tecnico, tempoDuracao);
        this.tipo = tipo;
        this.valorHora = valorHora;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public double getValorHora() {
        return valorHora;
    }
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    public static Limpeza cadastrarServicos(){
        JOptionPane.showMessageDialog(null,"CADASTRO Limpeza");
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("codigo: "));
        String descricao = JOptionPane.showInputDialog("descricao: ");
        String tecnico = JOptionPane.showInputDialog("tecnico: ");
        int tempoDuracao = Integer.parseInt(JOptionPane.showInputDialog("tempo Duracao: "));
        double valorHora = Double.parseDouble(JOptionPane.showInputDialog("valor hora: "));
        String tipo = JOptionPane.showInputDialog("tipo: ");
        Limpeza x = new Limpeza(codigo, descricao, tecnico, tempoDuracao, tipo, valorHora);
        return x;
    }
    
}
