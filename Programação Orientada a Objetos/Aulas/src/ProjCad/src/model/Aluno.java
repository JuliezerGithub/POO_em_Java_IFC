package model;

public class Aluno {
	
	//Registro Acadêmico = ra
	private int ra;
	private String nome;
	private String curso;
	//Construtor:
	public Aluno(int ra, String nome, String curso) {
		super();
		this.ra = ra;
		this.nome = nome;
		this.curso = curso;
	}
	
	//Get e Set
	public int getRa() {
		return ra;
	}
	public void setRa(int ra) {
		this.ra = ra;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCurso() {
		return curso;
	}
	
	//Polimorfismo do toString
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String toString() {
		return Integer.toString(ra)+";"+nome+";"+curso;
	}
	//Cria um vetor para receber os dados do aluno:
	public Object[] toObject() {
		Object[] vetor = new Object [] {ra,nome,curso};
		return vetor;
	}
	
}
