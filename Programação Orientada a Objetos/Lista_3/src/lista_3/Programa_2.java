package lista_3;

import java.util.Scanner;

/*
2. Faça um programa que crie um vetor com 10 inteiros e preencha o vetor 
com números digitados pelo usuário. Mostre o vetor.  
*/
public class Programa_2 {

	public static void main(String[] args) {
		try (Scanner entrada = new Scanner (System.in)) {
			
			int numeros[] = new int[10];
			
			for(int cont = 0; cont < numeros.length; cont++) {
			System.out.println("Digite um valor para o vetor: ");
			numeros[cont] = entrada.nextInt();
			System.out.println("");
			
			}
			System.out.println(" O vetor foi preenchido por:");
			for(int n : numeros) 
			{
			System.out.print(" "+n+",");
			}
		}

	}
}