package Aula1;

import java.util.Scanner;

public class Exemplo3 {
	
	public static void main(String[]args)
	{
		//Saída e entrada de dados
		String nome = "";
		Scanner sc = new Scanner(System.in);
		
		//Saída
		System.out.println("Digite seu nome:");
		nome = sc.nextLine();//Leitura de String
		System.out.println("\nSeu nome:"+nome);
		
		//Leitura de numeros
		int idade = 0;
		System.out.println("Digite sua Idade:");
		idade = sc.nextInt();
		System.out.println("\nSua Idade:"+idade);
	
		float salario = 0;
		System.out.println("Digite o salário:");
		salario = sc.nextFloat();
		System.out.println("\nSalário:"+salario);
		
		//conversão de tipo
		System.out.println("\nDigite sua Idade:");
		idade = Integer.parseInt(sc.next());
		
		sc.close();
				
		
	}
}
