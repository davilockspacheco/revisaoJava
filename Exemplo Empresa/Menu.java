import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Menu {
    public static void main(String[] args) {
        ArrayList<Engenheiro> engenheiros = new ArrayList<>();
        ArrayList<Supervisor> supervisores = new ArrayList<>();
        ArrayList<Tecnico> tecnicos = new ArrayList<>();
        while (true) {
            JOptionPane.showMessageDialog(null, "---MENU---");
            int opcao = Integer.parseInt(JOptionPane.showInputDialog( "O que deseja fazer?\n1-   Cadastrar funcionário\n2-   Calcular salário\n3-   Mostrar informações\n4-   Sair"));
            if (opcao == 4) {
                JOptionPane.showMessageDialog(null,"Encerrando programa");
                break;
            }
            //cadastro
            if (opcao ==1) {
                int op = Integer.parseInt(JOptionPane.showInputDialog( "Que funcionário deseja cadastrar?\n1-   Supervisor\n2-   Engenheiro\n3-   Técnico"));
                if (op == 1) {
                    supervisores.add(Supervisor.cadastrarFuncionarios());
                    JOptionPane.showMessageDialog(null, "Supervisor cadastrado");
                }
                else if (op == 2) {
                    engenheiros.add(Engenheiro.cadastrarFuncionarios());
                    JOptionPane.showMessageDialog(null, "Engenheiro cadastrado");
                }
                else if (op == 3) {
                    tecnicos.add(Tecnico.cadastrarFuncionarios());
                    JOptionPane.showMessageDialog(null, "Técnico cadastrado");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Digite uma opção válida");
                }
            }
            //salario
            else if (opcao == 2) {
                int op = Integer.parseInt(JOptionPane.showInputDialog( "De que funcionário deseja calcular o salário?\n1-   Supervisor\n2-   Engenheiro\n3-   Técnico"));
                if (op == 1) {
                    if (supervisores.size()<=0) {
                        JOptionPane.showMessageDialog(null, "cadastre um supervisor primeiro");
                    }
                    else{
                        Supervisor x = supervisores.getLast();
                        x.calcularSalario(x.getSalarioBase());
                    }
                    
                }
                else if (op == 2) {
                    if (engenheiros.size()<=0) {
                        JOptionPane.showMessageDialog(null, "cadastre um engenheiro primeiro");
                    }
                    else{
                        Engenheiro x = engenheiros.getLast();
                        x.calcularSalario(x.getSalarioBase());
                    }
                    
                }
                else if (op == 3) {
                    if (tecnicos.size()<=0) {
                        JOptionPane.showMessageDialog(null, "cadastre um técnico primeiro");
                    }
                    else{
                        Tecnico x = tecnicos.getLast();
                        x.calcularSalario(x.getSalarioBase());
                    }
                    
                }
                else{
                    JOptionPane.showMessageDialog(null, "Digite uma opção válida");
                }
            }
            //informaçoes
            else if (opcao == 3) {
                int op = Integer.parseInt(JOptionPane.showInputDialog( "De quais funcionários deseja ver as informações\n1-   Supervisor\n2-   Engenheiro\n3-   Técnico"));
                if (op == 1) {
                    if (supervisores.size()<=0) {
                        JOptionPane.showMessageDialog(null, "nenhuma informação encontrada");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Informações supervisores");
                        for (int i = 0; i < supervisores.size(); i++) {
                            supervisores.get(i).mostrarInformações();
                            JOptionPane.showMessageDialog(null, "-------------------");
                        }
                    }
                    
                }
                else if (op == 2) {
                    if (engenheiros.size()<=0) {
                        JOptionPane.showMessageDialog(null, "nenhuma informação encontrada");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Informações engenheiros");
                        for (int i = 0; i < engenheiros.size(); i++) {
                            engenheiros.get(i).mostrarInformações();
                            JOptionPane.showMessageDialog(null, "-------------------");
                        }
                    }
                    
                }
                else if (op == 3) {
                    if (tecnicos.size()<=0) {
                        JOptionPane.showMessageDialog(null, "nenhuma informação encontrada");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Informações técnicos");
                        for (int i = 0; i < tecnicos.size(); i++) {
                            tecnicos.get(i).mostrarInformações();
                            JOptionPane.showMessageDialog(null, "-------------------");
                        }
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
