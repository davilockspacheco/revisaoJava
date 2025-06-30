package quest01;

import javax.swing.JOptionPane;

public class Alunos {
	//Atributos
	protected int matricula;
	protected String nome;
	protected String cidade;
	protected int telefone;
	protected String curso;
	protected int fase;
	protected float mensalidadeBase;
	protected float mensalidadeFinal;
	
	public Alunos(int matricula, String nome, String cidade, int telefone, String curso, int fase,
			float mensalidadeBase){
		this.matricula = matricula;
		this.nome = nome;
		this.cidade = cidade;
		this.telefone = telefone;
		this.curso = curso;
		this.fase = fase;
		this.mensalidadeBase = mensalidadeBase;
		this.mensalidadeFinal = 0;
	}
	
	
	//GETs
	public int getMatricula(){
		return matricula;
	}
	public String getNome(){
		return nome;
	}
	public String getCidade(){
		return cidade;
	}
	public int getTelefone(){
		return telefone;
	}
	public String getCurso(){
		return curso;
	}
	public int getFase(){
		return fase;
	}
	public float getMensalidadeBase(){
		return mensalidadeBase;
	}
	public float getMensalidadeFinal(){
		return mensalidadeFinal;
	}
	
	//SETs
	public void setMatricula(int matricula){
		this.matricula = matricula;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public void setCidade(String cidade){
		this.cidade = cidade;
	}
	public void setTelefone(int telefone){
		this.telefone = telefone;
	}
	public void setCurso(String curso){
		this.curso = curso;
	}
	public void setFase(int fase){
		this.fase = fase;
	}
	public void setMensalidadeBase(float mensalidadeBase){
		this.mensalidadeBase = mensalidadeBase;
	}
	public void setMensalidadeFinal(float mensalidadeFinal){
		this.mensalidadeFinal = mensalidadeFinal;
	}

	//PRINT DADOS
	public void printDados(){
		JOptionPane.showMessageDialog(null, "ALUNO: \nMatrícula: " + matricula + "\nNome: " + nome 
				+ "\nCidade: " + cidade + "\nCurso: " + curso + "\nFase: " + fase + "ª fase "
				+ "\nMensalidade Base: R$" + mensalidadeBase + "\nMensalidade Final: R$" + mensalidadeFinal);
	}
}
