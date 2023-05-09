package ExerciciosAula;

public class Cadastro {
	
	Aluno[] Alunos;
	public Cadastro()
	{
		this.Alunos = new Aluno[100];	
	}
	
	public void cadastrar(Aluno aluno)
	{
		for (int i = 0; i < Alunos.length; i++) {
            if (Alunos[i] == null) {
                Alunos[i] = aluno;
                break;
            }
        }
	}
	
	
	public void consultar()
	{
		
		
	}
	
	public void alterar()
	{
		
		
	}
	
	public void excluir()
	{
		
		
	}
	
	public void listar()
	{
		
		
	}

}
