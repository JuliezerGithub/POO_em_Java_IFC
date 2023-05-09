package Aula1;

import java.util.Scanner;

public class Exemplo5 {
	
		public static void main(String[]args)
		{
			
			//Estruturas de Repetição
			//For
			
			for(int i=0;i<10;i++)
			{
				System.out.print(i+" , ");
			}
			
			//While
			int cont = 0;
			while(cont<5)
			{
				System.out.print(cont+" , ");
				cont++; // cont = cont+1
			}
			//Scanner sc = new Scanner(System.in);
			//String sair="N";
			//while(sair.equals("N"))
			//{
				//System.out.print("\nDigite S para Sair:");
				//sair = sc.next();
			//}
			
		//-------------exemplo
			
			Scanner sc = new Scanner(System.in);
			int sair=1;
			while(sair!=0)
			{
				System.out.print("\nDigite 0 para Sair:");
				sair = sc.nextInt();
			}
			
		System.out.print("\nSaiu do laço!");
		
		
		}
		
		

}
