package Aula_1;

import java.util.Scanner;

public class Exemplo_5 {
	public static void main(String [] args)
	{
		//Estrutura de repetição
		//for - Sabe até onde ir
		for(int i=0;i<10;i++)
		{
			System.out.print(i+" , ");
		}
		int cont = 0;
		while(cont<5)
		{
			System.out.print(cont+" , ");
			cont++; //cont = cont+1 - Padrão fica no final do while
		}
		Scanner sc = new Scanner(System.in);
		int sair = 1;
		while(sair!=0)
		{
			System.out.print("\nDigite 0 para Sair: ");
			sair= sc.nextInt();
		}
		System.out.print("\nSaiu do laço! ");
	}
}
