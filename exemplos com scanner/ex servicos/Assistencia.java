import java.util.Scanner;
import java.util.ArrayList;

public class Assistencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Servicos> listaServicos = new ArrayList<>();

        boolean programa = true;

        while (programa) {
            System.out.print("\n--- Menu de serviços ---\n1 - Cadastrar serviço\n2 - Mostrar informações dos serviços\n3 - Sair do programa\nEscolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o código do serviço: ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Digite a descrição do serviço: ");
                    String descricao = scanner.nextLine();

                    System.out.print("Digite o nome do técnico: ");
                    String tecnico = scanner.nextLine();

                    System.out.print("Digite o tempo de duração do serviço: ");
                    double duracao = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Escolha o tipo de serviço:\n1 - Limpeza\n2 - Formatação\n3 - Atualização\nEscolha uma opção: ");
                    int servico = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Digite o valor do serviço por hora: ");
                    double valor = scanner.nextInt();
                    scanner.nextLine();

                    Servicos newServico = null;

                    if (servico == 1) {
                        System.out.print("Digite o tipo de limpeza: ");
                        String tipo = scanner.nextLine();
                        newServico = new Limpeza(codigo, descricao, tecnico, duracao, valor, tipo);
                    } else if(servico == 2) {
                        System.out.print("Digite o formato de formatação: ");
                        String formato = scanner.nextLine();
                        newServico = new Formatacao(codigo, descricao, tecnico, duracao, valor, formato);
                    } else if (servico == 3) {
                        System.out.print("Digite a versão para atualização: ");
                        String versao = scanner.nextLine();
                        newServico= new Atualizacao(codigo, descricao, tecnico, duracao, valor, versao);
                    } else {
                        System.out.println("Cargo inválido!");
                        break;
                    }

                    listaServicos.add(newServico); 
                    System.out.println("\nServiço adicionado com sucesso!");
                    break;

                case 2:
                    System.out.println("\n--- Informações dos serviços ---");
                    for (Servicos servicos : listaServicos) {
                        servicos.calcularCustos();
                        servicos.mostrarInfo();
                    }
                    break;

                case 3:
                    programa = false;
                    break;

                default:
                    System.out.println("Opção inválida!");
            }   
        }
        scanner.close();

        System.out.println("Programa encerrado!");
    }
}
