package Aula3;

public class Imc {
	
	public double valor;
	
	static final int h_abaixo_normal = 20;// static final não pode mais alterar o valor, é fixo não altera
	
	static final int h_normal_inf = 20;
	
	static final double h_normal_sup = 24.9;
	
	static final double h_ob_inf = 25;
	
	static final double h_ob_sup = 29.9;
	
	static final double h_ob_mod_inf = 30;
	
	static final double h_ob_mod_sup = 39.9;
	
	
	static final int m_abaixo_normal = 19;
	
	static final int m_normal_inf = 19;
	
	static final double m_normal_sup = 23.9;
	
	static final double m_ob_inf = 24;
	
	static final double m_ob_sup = 28.9;
	
	static final double m_ob_mod_inf = 29;
	
	static final double m_ob_mod_sup = 38.9;
	
	public void calcularImc(double peso, double altura)
	{
		//this.valor = peso/(altura*altura);// this para essa classe
		this.valor = peso/Math.pow(altura, 2);
		//System.out.println(this.valor);
	}
	
	
		
	

}
