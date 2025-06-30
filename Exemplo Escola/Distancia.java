package quest01;

import javax.swing.JOptionPane;

public class Distancia extends Alunos{
	
	//Atributos
	private String plataforma;
	private int nrHoras;

	public Distancia(int matricula, String nome, String cidade, int telefone,
			String curso, int fase, float mensalidadeBase, String plataforma, int nrHoras) {
		super(matricula, nome, cidade, telefone, curso, fase, mensalidadeBase);
		
		this.plataforma = plataforma;
		this.nrHoras = nrHoras;
	}
	
	//GETs
	public String getPlataforma(){
		return plataforma;
	}
	public int getNrHoras(){
		return nrHoras;
	}
	
	//SETs
	public void setPlataforma(String plataforma){
		this.plataforma = plataforma;
	}
	public void setNrHoras(int nrHoras){
		this.nrHoras = nrHoras;
	}

	//PRINT DADOS
	public void printDados(){
		JOptionPane.showMessageDialog(null, "ALUNO DISTÂNCIA: \nMatrícula: " + matricula + "\nNome: " + nome 
				+ "\nCidade: " + cidade + "\nCurso: " + curso + "\nFase: " + fase + "ª fase \nPlataforma: " 
				+ plataforma + "\nNúmero de Horas: " + nrHoras + "\nMensalidade Base: R$" + mensalidadeBase 
				+ "\nMensalidade Final: R$" + mensalidadeFinal);
	}
}
