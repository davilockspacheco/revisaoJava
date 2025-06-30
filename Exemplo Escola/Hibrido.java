package quest01;

import javax.swing.JOptionPane;

public class Hibrido extends Alunos{
	
	//Atributos
	private String orientador;
	private int nrHoras;

	public Hibrido(int matricula, String nome, String cidade, int telefone,
			String curso, int fase, float mensalidadeBase, String orientador, int nrHoras) {
		super(matricula, nome, cidade, telefone, curso, fase, mensalidadeBase);
		
		this.orientador = orientador;
		this.nrHoras = nrHoras;
	}
	
	//GETs
	public String getOrientador(){
		return orientador;
	}
	public int getNrHoras(){
		return nrHoras;
	}
	
	//SETs
	public void setOrientador(String orientador){
		this.orientador = orientador;
	}
	public void setNrHoras(int nrHoras){
		this.nrHoras = nrHoras;
	}

	//PRINT DADOS
	public void printDados(){
		JOptionPane.showMessageDialog(null, "ALUNO DISTÂNCIA: \nMatrícula: " + matricula + "\nNome: " + nome 
				+ "\nCidade: " + cidade + "\nCurso: " + curso + "\nFase: " + fase + "ª fase \nOrientador: " 
				+ orientador + "\nNúmero de Horas: " + nrHoras + "\nMensalidade Base: R$" + mensalidadeBase 
				+ "\nMensalidade Final: R$" + mensalidadeFinal);
	}
}
