package lista_3;

import java.util.Scanner;

/*
Faça um programa que crie um vetor de inteiros com o tamanho escolhido pelo usuário. 
Preencha o vetor com números digitados pelo usuário. Mostre o vetor ordenado. 
*/
public class Programa_3 {

	public static void main(String[] args) {
		try (Scanner entrada_0 = new Scanner (System.in)) {
			System.out.println("Defina o número de posições do vetor: ");
			int tamanho = entrada_0.nextInt();
		try (Scanner entrada = new Scanner (System.in)) {
				
			int numeros[] = new int[tamanho];
				
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
}

