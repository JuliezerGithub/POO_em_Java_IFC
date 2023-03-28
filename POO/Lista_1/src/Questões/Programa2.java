package Questões;

import java.util.Scanner;

/*2. Crie uma classe java com o nome “Programa2” que receba dois números e indique se
são iguais ou se são diferentes, caso sejam diferentes imprima qual deles é par e qual
deles é ímpar. */

public class Programa2 {
	
	public static void main(String[] args) {
		
		int numA = 0, numB = 0;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("\nDigite um valor para o 1º Número: ");
			numA = sc.nextInt();
			
			System.out.println("\nDigite um valor para o 2º Número: ");
			numB = sc.nextInt();
		}
		if (numA == numB) { //Verificando se os valores são iguais
			System.out.println("\nOs valores são Iguais");
		} 
		else {
			System.out.println("\nOs valores são diferentes");
			if (numA%2 == 0) { //Verificando se par ou impar pelo resto
				System.out.println("\nO numero "+numA+" é par!");
				
			} else {
			System.out.println("\nO numero "+numA+" é impar!");
			
			}
			if (numB%2 == 0) {
			System.out.println("\nO numero "+numB+" é par!");
			
			} else {
			System.out.println("\nO numero "+numB+" é impar!");
			
			}
		}
		if (numA != numB){
		  if (numB%2 == 0 & numA%2 ==0) {
				System.out.println("\nNão existe número impar!");
		} else {
				System.out.println("\nNão existe número par!");
				
			}
		}
	}
}

