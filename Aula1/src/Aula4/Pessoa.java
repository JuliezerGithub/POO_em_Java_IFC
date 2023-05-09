package Aula4;

public abstract class Pessoa {
	
	private String nome;
	
	private double altura;

	
	public Pessoa() {
		super();
		this.nome = "";
		this.altura = 0.0;
	}
	
	public Pessoa(String nome, double altura) {
		super();
		this.nome = nome;
		this.altura = altura;
	}

	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", altura=" + altura + "]";
	}

}
