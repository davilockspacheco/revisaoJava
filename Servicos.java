// Classe pai(Questão 2[tecnica de celulares])
package Questao2Tecnica;

import javax.swing.JOptionPane;

public class Servicos {
    private int codigo,tempoDuracao;
    private String descricao,tecnico;

    public Servicos(int codigo, String descricao, String tecnico, int tempoDuracao){
        this.tempoDuracao = tempoDuracao;
        this.codigo = codigo;
        this.descricao = descricao;
        this.tecnico = tecnico;
    }

    public int getTempoDuracao() {
        return tempoDuracao;
    }
    public void setTempoDuracao(int tempoDuracao) {
        this.tempoDuracao = tempoDuracao;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getTecnico() {
        return tecnico;
    }
    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }
    public void calcularCustoServico(double valorHora,int tempoDuracao){
        double custo = (valorHora * tempoDuracao);
        JOptionPane.showMessageDialog(null,"custo:  R$"+custo);
    }
}

