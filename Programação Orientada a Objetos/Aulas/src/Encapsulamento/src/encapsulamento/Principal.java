package encapsulamento;

public class Principal {
    public static void main(String[] args) {
        // Criando objetos Aluno
        Aluno aluno1 = new Aluno();
        aluno1.setMatricula(111);
        aluno1.setNome("Juliezer da Silva");
        aluno1.setCurso("Engenharia de Controle e Automação");
        aluno1.setTelefone("(47) 99999-9999");

        Aluno aluno2 = new Aluno();
        aluno2.setMatricula(222);
        aluno2.setNome("Nayara G. da Rocha");
        aluno2.setCurso("Confeitaria e Culinária");
        aluno2.setTelefone("(47) 99999-9999");
        
        Aluno aluno3 = new Aluno();
        aluno3.setMatricula(333);
        aluno3.setNome("Juliana Maria dos Santos");
        aluno3.setCurso("Estética");
        aluno3.setTelefone("(47) 99999-9999");

        // Criando objeto Cadastro e cadastrando os alunos
        Cadastro cadastro = new Cadastro();//Objeto Cadastro
        cadastro.cadastrar(aluno1);
        cadastro.cadastrar(aluno2);
        cadastro.cadastrar(aluno3);

        // Lista os alunos cadastrados:
        System.out.println("Todos os alunos cadastrados:");
        cadastro.listar();

        // Consulta um aluno pelo número de matrícula:
        int matricula = 111;
        Aluno alunoEncontrado = cadastro.consultar(matricula);
        if (alunoEncontrado != null) {
        	//System.out.println("\n---------------------------");
            System.out.println("Aluno encontrado com a matrícula " + matricula + ":");
            System.out.println("Nome: " + alunoEncontrado.getNome());
            System.out.println("Curso: " + alunoEncontrado.getCurso());
            System.out.println("Telefone: " + alunoEncontrado.getTelefone());
        } else {
            System.out.println("Não foi encontrado nenhum aluno com a matrícula " + matricula);
        }

        // Alterando os dados de um aluno
        alunoEncontrado.setNome("Luis Osorio da Silva");
        alunoEncontrado.setCurso("Engenharia Civil");
        alunoEncontrado.setTelefone("(47) 99999-9999");
        cadastro.alterar(alunoEncontrado);

        // Listando novamente todos os alunos cadastrados, incluindo o aluno que foi alterado
        System.out.println("\n---------------------------");
        System.out.println("Todos os alunos cadastrados (após alteração do aluno " + matricula + "):");
        cadastro.listar();

        // Excluindo um aluno pelo número de matrícula
        matricula = 333;
        cadastro.excluir(matricula);

        // Listando novamente todos os alunos cadastrados, sem o aluno que foi excluído
        System.out.println("Todos os alunos cadastrados (após exclusão do aluno " + matricula + "):");
        cadastro.listar();
    }
}
