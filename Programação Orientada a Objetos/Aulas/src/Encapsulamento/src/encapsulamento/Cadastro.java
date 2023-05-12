package encapsulamento;
import java.util.ArrayList;
import java.util.List;

public class Cadastro {
    
    private List<Aluno> alunos;//Criando o Array
    
    public Cadastro() {
        this.alunos = new ArrayList<Aluno>();//Craindo lista para cadastrar alunos
    }
    
    public void cadastrar(Aluno aluno) {
        this.alunos.add(aluno);
    }
    
    public Aluno consultar(int matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula() == matricula) {
                return aluno;
            }
        }
        return null;
    }
    
    public void alterar(Aluno aluno) {
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getMatricula() == aluno.getMatricula()) {
                alunos.set(i, aluno);
                break;
            }
        }
    }
    
    public void excluir(int matricula) {
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getMatricula() == matricula) {
                alunos.remove(i);
                break;
            }
        }
    }
    
    public void listar() {
        for (Aluno aluno : alunos) {
            System.out.println("Matrícula: " + aluno.getMatricula()	);
            System.out.println("Nome: " + aluno.getNome()			);
            System.out.println("Curso: " + aluno.getCurso()			);
            System.out.println("Telefone: " + aluno.getTelefone()	);
            System.out.println("---------------------------"		);
        }
    }
}

