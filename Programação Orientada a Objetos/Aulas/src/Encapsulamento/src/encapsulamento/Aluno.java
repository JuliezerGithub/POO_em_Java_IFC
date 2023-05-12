package encapsulamento;
public class Aluno {
//Criando os Atributos:
    private int matricula;
    private String nome;
    private String curso;
    private String telefone;
//Criando os Construtores:
    public Aluno() { //Sem passar parametros
        this.matricula = 0;
        this.nome = "";
        this.curso = "";
        this.telefone = "";
    }
    
    public Aluno(int matricula, String nome, String curso, String telefone) { //Passando os parametros
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
        this.telefone = telefone;
    }
//Criando os métodos getters e setters:
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
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

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
