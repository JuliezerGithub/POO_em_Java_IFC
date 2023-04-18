package Aula3;

public class Imc {
	
	public double valor;
	
	//variaveis para Homens:
	
	static final int h_abaixo_normal = 20;
	
	static final double h_normal_inf = 20.0;
	
	static final double h_normal_sup = 24.9;
	
	static final double h_ob_inf = 25.0;
	
	static final double h_ob_sup = 29.9;
	
	static final double h_mod_inf = 30.0;
	
	static final double h_mod_sup = 39.9;
	
	//variaveis para mulheres
	static final int m_abaixo_normal = 19;
	
	static final double m_normal_inf = 19;
	
	static final double m_normal_sup = 23.9;
	
	static final double m_ob_inf = 24.0;
	
	static final double m_ob_sup = 28.9;
	
	static final double m_mod_inf = 29.0;
	
	static final double m_mod_sup = 38.9;
	
	public void calcularImc(double peso, double altura)
	{
		this.valor = peso/Math.pow(altura, 2);
		System.out.println("\nValor do imc "+(float)this.valor);
	}
}
