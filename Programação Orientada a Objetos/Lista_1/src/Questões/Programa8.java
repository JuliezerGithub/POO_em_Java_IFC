package Questões;

import java.util.Scanner;

/*8. Crie uma classe java com o nome “Programa8” que receba o nome de uma pessoa, sua
altura e peso. Imprima o IMC da pessoa. (IMC = peso/altura x altura)*/

public class Programa8 {

	public static void main(String[] args) {
		//Saída e Entrada de dados
				String nome = "";
				try (Scanner sc = new Scanner(System.in)) {
					//Entrada
					System.out.println("Digite seu nome: ");
					nome = sc.nextLine();
					int idade = 0;
					System.out.println("\nDigite sua idade: ");
					idade = sc.nextInt();
					float altura = 0;
					System.out.println("\nDigite sua altura: ");
					altura = sc.nextFloat();
					float peso = 0;
					System.out.println("\nDigite seu peso: ");
					peso = sc.nextFloat();
					
					//Calculo IMC
					float imc = 0;
					imc = peso/(altura*altura);
					
					//Saída
					System.out.println("\nSeu nome é "+nome+".");
					System.out.println("\nSua idade é "+idade+".");
					System.out.println("\nSua altura é "+altura+" metros.");
					System.out.println("\nSeu peso é "+peso+"kg.");
					System.out.println("\nSeu IMC é "+imc+".");
				}
				
				return;
	}

}