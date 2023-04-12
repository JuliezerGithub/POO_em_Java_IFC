package Aula_1;

import java.util.Scanner;
public class Exemplo_3 {

	public static void main(String[ ] args) {
		
		//Saída e Entrada de dados
		String nome = "";
		Scanner sc = new Scanner(System.in);
		
		//Saída
		System.out.println("Digite seu nome: ");
		nome = sc.nextLine(); //Leitura de String
		System.out.println("\nSeu nome: "+nome);
		
		//Leitura de Número Inteiro
		int idade = 0;
		System.out.println("\nDigite sua idade: ");
		idade = sc.nextInt(); //Leitura de String
		System.out.println("\nSua idade: "+idade);
		
		//Leitura de Número Flutuante
				float salario = 0;
				System.out.println("\nDigite seu salário: ");
				salario = sc.nextFloat(); //Leitura de String
				System.out.println("\nSeu Salário É: R$"+salario);
				sc.close();
	}
}
