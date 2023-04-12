package Questões;

import java.util.Scanner;

/*1. Crie uma classe java com o nome “Programa1” que receba dois números NumA e
NumB, nessa ordem, e imprima em ordem inversa, isto é, se os dados lidos forem
NumA = 5 e NumB = 9, por exemplo, devem ser impressos na ordem NumA = 9 e
NumB = 5. */

public class Programa1 {
	
	public static void main (String[] args) {
		
		int numA = 0, numB = 0, aux = 0;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("\nDigite um valor para o Número A: ");
			numA = sc.nextInt();
			
			System.out.println("\nDigite um valor para o Número B: ");
			numB = sc.nextInt();
		}
		
		System.out.println("\n\nO Número A é "+numA+" antes da inversão");
		System.out.println("\n\nO Número B é "+numB+" antes da inversão");
		
		aux = numA;
		numA = numB;
		numB = aux;
		
		System.out.println("\n\nO Número A é "+numA+" após a inversão");
		System.out.println("\n\nO Número B é "+numB+" após a inversão");
		return;
	}
}

