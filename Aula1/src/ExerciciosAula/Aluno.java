package ExerciciosAula;

public class Aluno {
	
	private int matricula;
	
	private String nome;
	
	private String curso;
	
	private String telefone;

	
	public Aluno(int matricula, String nome, String curso, String telefone) {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
        this.telefone = telefone;
	}
	
	public int getMatricula()
	{
		return this.matricula;
	}
	public void setMatricula(int matricula)
	{
		this.matricula = matricula;
	}
	
	
	public String getNome()
	{
		return this.nome;
	}
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	
	public String getCurso()
	{
		return this.curso;
	}
	public void setCurso(String curso)
	{
		this.curso = curso;
	}
	
	
	public String getTelefone()
	{
		return this.telefone;
	}
	public void setTelefone(String telefone)
	{
		this.telefone = telefone;
	}
	
	
	
}
