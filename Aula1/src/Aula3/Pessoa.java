package Aula3;

public class Pessoa {
	
	// public; private ou protect; frendly;
	// atributos de classe;
	private double altura;//public double altura;
	
	private double peso;//public double peso;
	
	private Imc imc;//public Imc imc;
	
	private String sexo;//public String sexo;
	
	
	//encapsulamento
	
	//Get
	public double getAltura() {
		return this.altura;
	}
	//Set
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	//Get
		public double getPeso() {
			return this.peso;
		}
		//Set
		public void setPeso(double peso) {
			this.peso = peso;
		}
	
	//Get
	public String getSexo() {
		return this.sexo;
	}
	//Set
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Pessoa() {//método construtor mesmo nome da classe
		this.altura = 1.65;
		this.peso = 60;
	}
	
	public Pessoa(double altura, double peso, String sexo)
	{
		this.altura = altura;
		this.peso = peso;
		this.sexo = sexo;
		Imc i = new Imc();
		i.calcularImc(peso, altura);
		this.imc = i;
	}
	
	/*public void diagnostico() {
	
	if(getIMC().valor < Imc.h_abaixo_normal)// variavel de classe não precisa de instancia
	{
		System.out.println("\nAbaixo do normal.");
	}
	else if(getIMC().valor >= Imc.h_normal_inf &&
			this.imc.valor <= Imc.h_normal_sup)
	{
		System.out.println("\nNormal.");
	}
	else if(this.imc.valor >= Imc.h_ob_inf &&
			this.imc.valor <= Imc.h_ob_sup)
	{
		System.out.println("\nObesidade Leve.");
	}
	else if(this.imc.valor >= Imc.h_ob_mod_inf &&
			this.imc.valor <= Imc.h_ob_mod_sup)
	{
		System.out.println("\nObesidade.");
	}
	else
	{
		System.out.println("\nObesidade Mórbida.");
	}
}*/

	
	/*public void diagnosticoM() {
		
		if(this.imc.valor < Imc.m_abaixo_normal)// variavel de classe não precisa de instancia
		{
			System.out.println("\nAbaixo do normal.");
		}
		else if(this.imc.valor >= Imc.m_normal_inf &&
				this.imc.valor <= Imc.m_normal_sup)
		{
			System.out.println("\nNormal.");
		}
		else if(this.imc.valor >= Imc.m_ob_inf &&
				this.imc.valor <= Imc.m_ob_sup)
		{
			System.out.println("\nObesidade Leve.");
		}
		else if(this.imc.valor >= Imc.m_ob_mod_inf &&
				this.imc.valor <= Imc.m_ob_mod_sup)
		{
			System.out.println("\nObesidade.");
		}
		else
		{
			System.out.println("\nObesidade Mórbida.");
		}
	}*/
	
	
	public void setIMC(Imc i)
	{
		this.imc = i;
	}
	
	public double getImc()
	{
		return this.imc.valor;
	}
	public Imc getIMC()
	{
		return this.imc;
	}
	public void setImc()
	{
		Imc i = new Imc();
		i.calcularImc(this.peso, this.altura);
		this.imc = i;
	}
	
}
