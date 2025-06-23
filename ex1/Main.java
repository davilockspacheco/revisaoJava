package ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<supervisor.supervisor> funcionario = new ArrayList<>();
        String nome = "";
        double salario = 0;

        System.out.print("Número de numeros a ser inserido: ");
        int num = sc.nextInt();

        System.out.println("Insira os numeros: ");
        for(int i=0; i<num; i++){
            funcionario.add(sc.nextInt());
        }

        boolean sair = false;
        do{
            System.out.println("1 - Cadastrar Funcionario"+ "\n 2 - Mostrar Dados" + "\n3 - Sair"+ "\n Escolha uma opção: ");
            int op = sc.nextInt();
            if(op == 0){
                sair = true;
            }
            else if(op == 1) {
                System.out.print("Nome: ");
                System.out.print("Sálario Base: ");
                System.out.print("Tipo: " + "1 - Supervisor" + "\n 2 - Engenheiro" + "\n3 - Técnico" + "\n Escolha uma opção: ");
                int tipo = sc.nextInt();
                if (tipo == 1) {
                    funcionario.add(new supervisor(nome, salario_base));
                } else if (tipo == 2) {
                    funcionario.add(new engenheiro(nome, salario_base));
                } else if (tipo == 3) {
                    funcionario.add(new tecnico(nome, salario_base));
                }
            else if (op == 2){
                System.out.println(funcionario);
                }
                else{
                    System.out.println("Funcionário não encontrado no array");
                }
            }
            else{
                System.out.println("Opção inválida...");
            }
        }while(!sair);

        sc.close();
    }


}