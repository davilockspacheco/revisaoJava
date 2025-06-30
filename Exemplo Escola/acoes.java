package quest01;

import java.util.*;
import javax.swing.JOptionPane;

public class acoes {
	//Array
	static ArrayList<Alunos> alunos = new ArrayList<Alunos>();
	
	// ------------- CADASTRAR -------------
	public static void cadastrar(){
		boolean matriculaExiste = false; //Vari�vel para verificar se a matr�cula j� existe
		JOptionPane.showMessageDialog(null, "CADASTRO DE ALUNOS");
		
		int matricula = Integer.parseInt(JOptionPane.showInputDialog("Matr�cula do Aluno \nN�O PODE HAVER MATR�CULAS IGUAIS: "));
		
		for (Alunos aluno : alunos){
			if(aluno.matricula == matricula){
				matriculaExiste = true;
			}
		}
		
		if(matriculaExiste = false){ //Uma condi��o para n�o repetir a mesma matr�cula
			//Se n�o tiver nenhuma matr�cula igual, o sistema pede o resto das informa��es
			String nome = JOptionPane.showInputDialog("Nome do Aluno: ");
			String cidade = JOptionPane.showInputDialog("Cidade do Aluno: ");
			int telefone = Integer.parseInt(JOptionPane.showInputDialog("Telefone do Aluno: \nAPENAS OS N�MEROS "));
			String curso = JOptionPane.showInputDialog("Curso do Aluno: ");
			int fase = Integer.parseInt(JOptionPane.showInputDialog("Fase do Aluno: \nColocar apenas os n�meros: 1(1�fase), 2(2�fase)... "));
			float mensalidadeBase = Float.parseFloat(JOptionPane.showInputDialog("Mensalidade Base do Aluno: "));

			//Pergunta o tipo
			int tipo = Integer.parseInt(JOptionPane.showInputDialog("O aluno �: \n1 - Presencial \n2 - Dist�ncia \n3 - H�brido"));
			
			//PRESENCIAL
			if(tipo == 1){
				String disciplina = JOptionPane.showInputDialog("Disciplina: ");
				int nrAulas = Integer.parseInt(JOptionPane.showInputDialog("N�mero de Aulas: "));
				
				Presencial presenciais = new Presencial(matricula, nome, cidade, telefone, curso, fase,
						mensalidadeBase, disciplina, nrAulas);
				alunos.add(presenciais);
				
			//DIST�NCIA
			} else if(tipo == 2){
				String disciplina = JOptionPane.showInputDialog("Disciplina: ");
				int nrAulas = Integer.parseInt(JOptionPane.showInputDialog("N�mero de Aulas: "));
				
				Distancia distancias = new Distancia(matricula, nome, cidade, telefone, curso, fase,
						mensalidadeBase, disciplina, nrAulas);
				alunos.add(distancias);
				
			//H�BRIDO
			} else if(tipo == 3){
				String disciplina = JOptionPane.showInputDialog("Disciplina: ");
				int nrAulas = Integer.parseInt(JOptionPane.showInputDialog("N�mero de Aulas: "));
				
				Hibrido hibridos = new Hibrido(matricula, nome, cidade, telefone, curso, fase,
						mensalidadeBase, disciplina, nrAulas);
				alunos.add(hibridos);
				
			} else{
				JOptionPane.showMessageDialog(null, "OP��O INV�LIDA!");
			}
		} else { //Mensagem de erro caso a matr�cula j� exista
			JOptionPane.showMessageDialog(null, "Essa matr�cula j� existe!");
		}
		
	}

	// ------------- CALCULAR MENSALIDADE -------------
	public static void calcularMensalidade(){
		
		if(alunos.isEmpty()){ //Uma condi��o para verificar se h� algum aluno cadastrado e mostrar uma mensagem
			JOptionPane.showMessageDialog(null, "C�LCULO DE MENSALIDADE \n\nN�o h� alunos cadastrados at� o momento!");
			
		} else{
		
			int tipo = Integer.parseInt(JOptionPane.showInputDialog("C�LCULO DE MENSALIDADE \n\nO aluno �: \n1 - Presencial \n2 - Dist�ncia "
					+ "\n3 - H�brido"));
	
			//Calcular a mensalidade de um aluno por vez (n�o foi especificado ent�o decidi fazer assim)
			int matricula = Integer.parseInt(JOptionPane.showInputDialog("Matr�cula do aluno do qual deseja calcular: "));
			
			//PRESENCIAL
			if(tipo == 1){
				for (Alunos aluno : alunos){
					if(aluno.matricula == matricula){ //condi��o para verificar se o servi�o � o desejado
						float mensalidadeFinal = (float)(aluno.mensalidadeBase * 1.2);
						aluno.setMensalidadeFinal(mensalidadeFinal);
						
						//Mostrando apenas a mensalidade final para n�o deixar o usu�rio sem resposta
						JOptionPane.showMessageDialog(null, "Mensalidade calculada! \nTotal: R$" + mensalidadeFinal);
					}
				}
			
			//DIST�NCIA
			} else if(tipo == 2){
				for (Alunos aluno : alunos){
					if(aluno.matricula == matricula){ //condi��o para verificar se o servi�o � o desejado
						float mensalidadeFinal = (float)(aluno.mensalidadeBase * 1.1);
						aluno.setMensalidadeFinal(mensalidadeFinal);
						
						//Mostrando apenas a mensalidade final
						JOptionPane.showMessageDialog(null, "Mensalidade calculada! \nTotal: R$" + mensalidadeFinal);
					}
				}
			
			//H�BRIDO
			} else if(tipo == 3){
				for (Alunos aluno : alunos){
					if(aluno.matricula == matricula){ //condi��o para verificar se o servi�o � o desejado
						float mensalidadeFinal = (float)(aluno.mensalidadeBase * 1.15);
						aluno.setMensalidadeFinal(mensalidadeFinal);
						
						//Mostrando apenas a mensalidade final
						JOptionPane.showMessageDialog(null, "Mensalidade calculada! \nTotal: R$" + mensalidadeFinal);
					}
				}
				
			} else{
				JOptionPane.showMessageDialog(null, "OP��O INV�LIDA!");
			}
		}
	}
	
	// ------------- MOSTRAR INFORMA��ES -------------
	public static void mostrarInformacoes(){
		
		if(alunos.isEmpty()){ //Uma condi��o para verificar se h� algum aluno cadastrado e mostrar uma mensagem
			JOptionPane.showMessageDialog(null, "INFORMA��ES \n\nN�o h� alunos cadastrados at� o momento!");
			
		} else{

			int op = Integer.parseInt(JOptionPane.showInputDialog("INFORMA��ES \n\nDeseja mostrar por: \n1 - Aluno Espec�fico "
					+ "(necessita da matr�cula) \n2 - Todos os alunos"));
			
			if(op == 1){
				int matricula = Integer.parseInt(JOptionPane.showInputDialog("Matr�cula do aluno do qual deseja calcular: "));
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
				JOptionPane.showMessageDialog(null, "OP��O INV�LIDA!");
			}
		}
		
	}
	
	
}
