package Aula3;

public class Mulher extends Pessoa{
	
public void diagnosticoM() {
		
		if(getIMC().valor < Imc.m_abaixo_normal)// variavel de classe não precisa de instancia
		{
			System.out.println("\nAbaixo do normal.");
		}
		else if(getIMC().valor >= Imc.m_normal_inf &&
				getIMC().valor <= Imc.m_normal_sup)
		{
			System.out.println("\nNormal.");
		}
		else if(getIMC().valor >= Imc.m_ob_inf &&
				getIMC().valor <= Imc.m_ob_sup)
		{
			System.out.println("\nObesidade Leve.");
		}
		else if(getIMC().valor >= Imc.m_ob_mod_inf &&
				getIMC().valor <= Imc.m_ob_mod_sup)
		{
			System.out.println("\nObesidade.");
		}
		else
		{
			System.out.println("\nObesidade Mórbida.");
		}
	}

}
