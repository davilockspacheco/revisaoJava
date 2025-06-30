package quest01;

import java.util.*;
import javax.swing.JOptionPane;

public class acoes {
	//Array
	static ArrayList<Alunos> alunos = new ArrayList<Alunos>();
	
	// ------------- CADASTRAR -------------
	public static void cadastrar(){
		boolean matriculaExiste = false; //Variável para verificar se a matrícula já existe
		JOptionPane.showMessageDialog(null, "CADASTRO DE ALUNOS");
		
		int matricula = Integer.parseInt(JOptionPane.showInputDialog("Matrícula do Aluno \nNÃO PODE HAVER MATRÍCULAS IGUAIS: "));
		
		for (Alunos aluno : alunos){
			if(aluno.matricula == matricula){
				matriculaExiste = true;
			}
		}
		
		if(matriculaExiste = false){ //Uma condição para não repetir a mesma matrícula
			//Se não tiver nenhuma matrícula igual, o sistema pede o resto das informações
			String nome = JOptionPane.showInputDialog("Nome do Aluno: ");
			String cidade = JOptionPane.showInputDialog("Cidade do Aluno: ");
			int telefone = Integer.parseInt(JOptionPane.showInputDialog("Telefone do Aluno: \nAPENAS OS NÚMEROS "));
			String curso = JOptionPane.showInputDialog("Curso do Aluno: ");
			int fase = Integer.parseInt(JOptionPane.showInputDialog("Fase do Aluno: \nColocar apenas os números: 1(1ªfase), 2(2ªfase)... "));
			float mensalidadeBase = Float.parseFloat(JOptionPane.showInputDialog("Mensalidade Base do Aluno: "));

			//Pergunta o tipo
			int tipo = Integer.parseInt(JOptionPane.showInputDialog("O aluno é: \n1 - Presencial \n2 - Distância \n3 - Híbrido"));
			
			//PRESENCIAL
			if(tipo == 1){
				String disciplina = JOptionPane.showInputDialog("Disciplina: ");
				int nrAulas = Integer.parseInt(JOptionPane.showInputDialog("Número de Aulas: "));
				
				Presencial presenciais = new Presencial(matricula, nome, cidade, telefone, curso, fase,
						mensalidadeBase, disciplina, nrAulas);
				alunos.add(presenciais);
				
			//DISTÂNCIA
			} else if(tipo == 2){
				String disciplina = JOptionPane.showInputDialog("Disciplina: ");
				int nrAulas = Integer.parseInt(JOptionPane.showInputDialog("Número de Aulas: "));
				
				Distancia distancias = new Distancia(matricula, nome, cidade, telefone, curso, fase,
						mensalidadeBase, disciplina, nrAulas);
				alunos.add(distancias);
				
			//HÍBRIDO
			} else if(tipo == 3){
				String disciplina = JOptionPane.showInputDialog("Disciplina: ");
				int nrAulas = Integer.parseInt(JOptionPane.showInputDialog("Número de Aulas: "));
				
				Hibrido hibridos = new Hibrido(matricula, nome, cidade, telefone, curso, fase,
						mensalidadeBase, disciplina, nrAulas);
				alunos.add(hibridos);
				
			} else{
				JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA!");
			}
		} else { //Mensagem de erro caso a matrícula já exista
			JOptionPane.showMessageDialog(null, "Essa matrícula já existe!");
		}
		
	}

	// ------------- CALCULAR MENSALIDADE -------------
	public static void calcularMensalidade(){
		
		if(alunos.isEmpty()){ //Uma condição para verificar se há algum aluno cadastrado e mostrar uma mensagem
			JOptionPane.showMessageDialog(null, "CÁLCULO DE MENSALIDADE \n\nNão há alunos cadastrados até o momento!");
			
		} else{
		
			int tipo = Integer.parseInt(JOptionPane.showInputDialog("CÁLCULO DE MENSALIDADE \n\nO aluno é: \n1 - Presencial \n2 - Distância "
					+ "\n3 - Híbrido"));
	
			//Calcular a mensalidade de um aluno por vez (não foi especificado então decidi fazer assim)
			int matricula = Integer.parseInt(JOptionPane.showInputDialog("Matrícula do aluno do qual deseja calcular: "));
			
			//PRESENCIAL
			if(tipo == 1){
				for (Alunos aluno : alunos){
					if(aluno.matricula == matricula){ //condição para verificar se o serviço é o desejado
						float mensalidadeFinal = (float)(aluno.mensalidadeBase * 1.2);
						aluno.setMensalidadeFinal(mensalidadeFinal);
						
						//Mostrando apenas a mensalidade final para não deixar o usuário sem resposta
						JOptionPane.showMessageDialog(null, "Mensalidade calculada! \nTotal: R$" + mensalidadeFinal);
					}
				}
			
			//DISTÂNCIA
			} else if(tipo == 2){
				for (Alunos aluno : alunos){
					if(aluno.matricula == matricula){ //condição para verificar se o serviço é o desejado
						float mensalidadeFinal = (float)(aluno.mensalidadeBase * 1.1);
						aluno.setMensalidadeFinal(mensalidadeFinal);
						
						//Mostrando apenas a mensalidade final
						JOptionPane.showMessageDialog(null, "Mensalidade calculada! \nTotal: R$" + mensalidadeFinal);
					}
				}
			
			//HÍBRIDO
			} else if(tipo == 3){
				for (Alunos aluno : alunos){
					if(aluno.matricula == matricula){ //condição para verificar se o serviço é o desejado
						float mensalidadeFinal = (float)(aluno.mensalidadeBase * 1.15);
						aluno.setMensalidadeFinal(mensalidadeFinal);
						
						//Mostrando apenas a mensalidade final
						JOptionPane.showMessageDialog(null, "Mensalidade calculada! \nTotal: R$" + mensalidadeFinal);
					}
				}
				
			} else{
				JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA!");
			}
		}
	}
	
	// ------------- MOSTRAR INFORMAÇÕES -------------
	public static void mostrarInformacoes(){
		
		if(alunos.isEmpty()){ //Uma condição para verificar se há algum aluno cadastrado e mostrar uma mensagem
			JOptionPane.showMessageDialog(null, "INFORMAÇÕES \n\nNão há alunos cadastrados até o momento!");
			
		} else{

			int op = Integer.parseInt(JOptionPane.showInputDialog("INFORMAÇÕES \n\nDeseja mostrar por: \n1 - Aluno Específico "
					+ "(necessita da matrícula) \n2 - Todos os alunos"));
			
			if(op == 1){
				int matricula = Integer.parseInt(JOptionPane.showInputDialog("Matrícula do aluno do qual deseja calcular: "));
				for (Alunos aluno : alunos){
					if(aluno.matricula == matricula){
						aluno.printDados();
					}
				}
				
			} else if(op == 2){
				for (Alunos aluno : alunos){
					aluno.printDados();
				}
			} else{
				JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA!");
			}
		}
		
	}
	
	
}
