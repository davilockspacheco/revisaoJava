package Questao2Tecnica;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Controle {
    public static void main(String[] args) {
        ArrayList<Limpeza> Limpezas = new ArrayList<>();
        ArrayList<Formatacao> Formatacaoes = new ArrayList<>();
        ArrayList<Atualizacao> Atualizacaos = new ArrayList<>();
        while (true) {
            JOptionPane.showMessageDialog(null, "---CONTROLE---");
            int opcao = Integer.parseInt(JOptionPane.showInputDialog( "O que deseja fazer?\n1-   Cadastrar serviço\n2-   Calcular custo\n3-  Sair"));
            if (opcao == 3) {
                JOptionPane.showMessageDialog(null,"Encerrando programa");
                break;
            }
            //cadastro
            if (opcao ==1) {
                int op = Integer.parseInt(JOptionPane.showInputDialog( "Que serviço deseja cadastrar?\n1-   Formatacao\n2-   Limpeza\n3-   Atualização"));
                if (op == 1) {
                    Formatacaoes.add(Formatacao.cadastrarServicos());
                    JOptionPane.showMessageDialog(null, "Formatacao cadastrada");
                }
                else if (op == 2) {
                    Limpezas.add(Limpeza.cadastrarServicos());
                    JOptionPane.showMessageDialog(null, "Limpeza cadastrada");
                }
                else if (op == 3) {
                    Atualizacaos.add(Atualizacao.cadastrarServicos());
                    JOptionPane.showMessageDialog(null, "Atualização cadastrada");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Digite uma opção válida");
                }
            }
            //custo
            else if (opcao == 2) {
                int op = Integer.parseInt(JOptionPane.showInputDialog( "De que serviço deseja calcular o custo?\n1-   Formatacao\n2-   Limpeza\n3-   Atualização"));
                if (op == 1) {
                    if (Formatacaoes.size()<=0) {
                        JOptionPane.showMessageDialog(null, "cadastre uma Formatacao primeiro");
                    }
                    else{
                        Formatacao x = Formatacaoes.getLast();
                        x.calcularCustoServico(x.getValorHora(), x.getTempoDuracao());
                    }
                    
                }
                else if (op == 2) {
                    if (Limpezas.size()<=0) {
                        JOptionPane.showMessageDialog(null, "cadastre um Limpeza primeiro");
                    }
                    else{
                        Limpeza x = Limpezas.getLast();
                        x.calcularCustoServico(x.getValorHora(), x.getTempoDuracao());
                    }
                    
                }
                else if (op == 3) {
                    if (Atualizacaos.size()<=0) {
                        JOptionPane.showMessageDialog(null, "cadastre um técnico primeiro");
                    }
                    else{
                        Atualizacao x = Atualizacaos.getLast();
                        x.calcularCustoServico(x.getValorHora(), x.getTempoDuracao());
                    }
                    
                }
                else{
                    JOptionPane.showMessageDialog(null, "Digite uma opção válida");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Digite uma opção válida");
            }
        }
    }
}
