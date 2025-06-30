import java.util.Scanner;
import java.util.ArrayList;

public class Pagamentos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Funcionarios> listaFuncionarios = new ArrayList<>();

        boolean programa = true;

        while (programa) {
            System.out.print("\n--- Menu da empresa ---\n1 - Cadastrar funcionário\n2 - Mostrar informações dos funcionários\n3 - Sair do programa\nEscolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a matrícula do funcionário: ");
                    String matricula = scanner.nextLine();

                    System.out.print("Digite o nome do funcionário: ");
                    String nome = scanner.nextLine();

                    System.out.print("Digite o sexo do funcionário: ");
                    String sexo = scanner.nextLine();

                    System.out.print("Digite a idade do funcionário: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Digite o salário do funcionário: ");
                    double salario = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Escolha o cargo do funcionário:\n1 - Supervisor\n2 - Engenheiro\n3 - Técnico\nEscolha uma opção: ");
                    int cargo = scanner.nextInt();
                    scanner.nextLine();

                    Funcionarios newFuncionario = null;

                    if (cargo == 1) {
                        System.out.print("Digite o setor do supervisor: ");
                        String setor = scanner.nextLine();
                        newFuncionario = new Supervisor(matricula, nome, sexo, idade, salario, setor);
                    } else if(cargo == 2) {
                        System.out.print("Digite a área de atuação do engenheiro: ");
                        String areaAtuacao = scanner.nextLine();
                        newFuncionario = new Engenheiro(matricula, nome, sexo, idade, salario, areaAtuacao);
                    } else if (cargo == 3) {
                        System.out.print("Digite o tipo de técnico: ");
                        String tipo = scanner.nextLine();
                        newFuncionario = new Tecnico(matricula, nome, sexo, idade, salario, tipo);
                    } else {
                        System.out.println("Cargo inválido!");
                        break;
                    }

                    listaFuncionarios.add(newFuncionario); 
                    System.out.println("\nFuncionário adicionado com sucesso!");
                    break;

                case 2:
                    System.out.println("\n--- Informações dos funcionários ---");
                    for (Funcionarios funcionarios : listaFuncionarios) {
                        funcionarios.calcularSalarios();
                        funcionarios.mostrarInfo();
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