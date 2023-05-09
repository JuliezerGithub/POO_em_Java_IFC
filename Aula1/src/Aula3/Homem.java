package Aula3;

public class Homem extends Pessoa{
	
public void diagnostico() {
		
		if(getIMC().valor < Imc.h_abaixo_normal)// variavel de classe não precisa de instancia
		{
			System.out.println("\nAbaixo do normal.");
		}
		else if(getIMC().valor >= Imc.h_normal_inf &&
				getIMC().valor <= Imc.h_normal_sup)
		{
			System.out.println("\nNormal.");
		}
		else if(getIMC().valor >= Imc.h_ob_inf &&
				getIMC().valor <= Imc.h_ob_sup)
		{
			System.out.println("\nObesidade Leve.");
		}
		else if(getIMC().valor >= Imc.h_ob_mod_inf &&
				getIMC().valor <= Imc.h_ob_mod_sup)
		{
			System.out.println("\nObesidade.");
		}
		else
		{
			System.out.println("\nObesidade Mórbida.");
		}
	
	}

}
