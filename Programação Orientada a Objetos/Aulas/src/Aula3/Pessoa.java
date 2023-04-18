package Aula3;

public class Pessoa {
	public double  altura;
	public double  peso;
	public Imc  imc; //Associou uma classe com a outra
	public  String sexo;

public void diagnosticoH()
	{
		System.out.println("\nO Resultado desse paciente é: ");
		if(this.imc.valor < Imc.h_abaixo_normal) //Acesso direto a variavel de classe (variavel de classe não precisa de objeto)
		{
			System.out.println("\nAbaixo do normal.");
		}
		else if(this.imc.valor >= Imc.h_normal_inf && this.imc.valor <= Imc.h_normal_sup) 	//Normal
		{
			System.out.println("\nNormal.");
		}
		else if(this.imc.valor >= Imc.h_ob_inf && this.imc.valor <= Imc.h_ob_sup)			//Obsidade Leve
		{
			System.out.println("\nObsidade Leve.");
		}
		else if(this.imc.valor >= Imc.h_mod_inf && this.imc.valor <= Imc.h_mod_sup)			//Obsidade
		{
			System.out.println("\nObsidade.");
		}else 																				//Obsidade Morbida
		{
			System.out.println("\nObsidade Morbida.");
		}
		
	}
public void diagnosticoM()
{
	System.out.println("\nO Resultado desse paciente é: ");
	if(this.imc.valor < Imc.m_abaixo_normal) //Acesso direto a variavel de classe (variavel de classe não precisa de objeto)
	{
		System.out.println("\nAbaixo do normal.");
	}
	else if(this.imc.valor >= Imc.m_normal_inf && this.imc.valor <= Imc.m_normal_sup) 	//Normal
	{
		System.out.println("\nNormal.");
	}
	else if(this.imc.valor >= Imc.m_ob_inf && this.imc.valor <= Imc.m_ob_sup)			//Obsidade Leve
	{
		System.out.println("\nObsidade Leve.");
	}
	else if(this.imc.valor >= Imc.m_mod_inf && this.imc.valor <= Imc.m_mod_sup)			//Obsidade
	{
		System.out.println("\nObsidade.");
	}else 																				//Obsidade Morbida
	{
		System.out.println("\nObsidade Morbida.");
	}
	
}
}
