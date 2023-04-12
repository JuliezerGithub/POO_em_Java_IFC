package Aula_1;

public class Exemplo_4 {
	public static void main(String [] args)
	{
		/*Operadores Relacionais
		 * == igualdade
		 * != diferente
		 * > maior
		 * < menor
		 */
		
		/*
		 * || ou
		 * && E
		 * ! NOT
		 */
		// Condicionais - Estruturas de Seleção
		
		/*int x = 233 , y = 45;
				
		if (x>10 || x>1000)
		{
			System.out.println("A"); //V
		} else {
			System.out.println("B"); //F
		}
		
		if (x>10 && y>200)
		{
			System.out.println("C");//V
		}
		else if(x>10 && y>100) 
		{
			System.out.println("D");//V
		}
		else 
		{
			System.out.println("E");//F
		}
		//---------------------------------
		/*if (x>10 && y>200)
		{
			if (y>300)
			{
				System.out.println("D");//V
			}
			else 
			{
				System.out.println("E");//F
			}
		}
		else 
		{
			System.out.println("E");//F
		}
		*/
		int op = 0;
		
		switch(op)
		{
		case 0: System.out.print("\n 1");break;
		case 1: System.out.print("\n 2");break;
		case 2: System.out.print("\n 3");break;
		case 3: System.out.print("\n 4");break;
		default: System.out.print("\n Nada");break;
		}
	}
}
