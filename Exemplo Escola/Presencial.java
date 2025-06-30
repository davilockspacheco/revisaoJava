package quest01;

import javax.swing.JOptionPane;

public class Presencial extends Alunos{
	
	//Atributos
	private String disciplina;
	private int nrAulas;

	public Presencial(int matricula, String nome, String cidade, int telefone,
			String curso, int fase, float mensalidadeBase, String disciplina, int nrAulas) {
		super(matricula, nome, cidade, telefone, curso, fase, mensalidadeBase);
		
		this.disciplina = disciplina;
		this.nrAulas = nrAulas;
	}
	
	//GETs
	public String getDisciplina(){
		return disciplina;
	}
	public int getNrAulas(){
		return nrAulas;
	}
	
	//SETs
	public void setDisciplina(String disciplina){
		this.disciplina = disciplina;
	}
	public void setNrAulas(int nrAulas){
		this.nrAulas = nrAulas;
	}

	//PRINT DADOS
	public void printDados(){
		JOptionPane.showMessageDialog(null, "ALUNO PRESENCIAL: \nMatrícula: " + matricula + "\nNome: " + nome 
				+ "\nCidade: " + cidade + "\nCurso: " + curso + "\nFase: " + fase + "ª fase \nDisciplina: " 
				+ disciplina + "\nNúmero de Aulas: " + nrAulas + "\nMensalidade Base: R$" + mensalidadeBase 
				+ "\nMensalidade Final: R$" + mensalidadeFinal);
	}
}
