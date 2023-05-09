package Aula1;

public class Exemplo4 {
	public static void main(String[]args)
	{
		//Operadores Relacionais
		// == igualdade
		// != diferente
		// > maior
		// < menor
		// >= maior igual
		// <= menor igual
		
		//Operadores Lógicos
		// || OU
		// && E
		// ! NOT
		
		// Condicionais - Estrutura de Seleção
		
		int x = 233 , y = 45;
		
		if(x>10 ||x > 1000)
		{
			System.out.println("A");//v
		}else {
			System.out.println("B");//f
		}
		
		if(x>10 && y>200)
		{
			System.out.println("\nC");
		}else if(x>10 && y>100)
		{
			System.out.println("\nD");//v
		}else {
			System.out.println("\nE");//f
		}
	
		//---------------------
		
		if(x>10 && y>200)
		{
			if(y>300)
			{
				System.out.println("\nD");//v
			}else {
				System.out.println("\nE");//f
			}
		}
		//--------------------
		
		int op = 0;
		
		switch(op)
		{
		case 0: System.out.print("\n1");break;
		case 1: System.out.print("\n2");break;
		case 2: System.out.print("\n3");break;
		case 3: System.out.print("\n4");break;
		default: System.out.print("\n Nada");break;
		}
		

	}
}