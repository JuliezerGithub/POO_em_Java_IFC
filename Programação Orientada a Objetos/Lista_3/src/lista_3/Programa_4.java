package lista_3;
/*
4. Faça um programa que preencha um vetor com 10 números digitados pelo usuário. 
Em seguida crie dois novos vetores, em um deles armazene apenas os números pares digitados 
e no outro apenas os números ímpares. 
Mostre os três vetores. 
*/

import java.util.Scanner;

public class Programa_4 {
	public static void main(String[] args) {
		 
        // declaração de variáveis
        int i = 0, slot = 0;
        try (Scanner entrada_0 = new Scanner (System.in)) {
			System.out.println("Defina o número de posições do vetor: ");
			int tamanho = entrada_0.nextInt();
		try (Scanner entrada = new Scanner (System.in)) {
				
			int numeros[] = new int[tamanho];
			// declaração de vetor
	        int[] vetorimpar = new int[10];
	        int[] vetorpar = new int [10];	
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
				do{
		            // validação números ímpares
		            if(i % 2 == 1){
		                vetorimpar[slot] = i;
		                slot++;
		            }
		            i++;
		            if (i % 2 == 0) 
		            {
						vetorpar [slot] = i;
		            	slot++;
		            }
		        }while(slot < 10);
		        
		        // zerando o valor de i
		        i = 0;
		        
		        // imprimindo os números ímpares
		        System.out.println("Vetor Impar:");
		        for(int n : vetorimpar) 
				{
		        	if(n != 0) {
		        		System.out.print(" "+n+" ");
		        	}
		        }
		        System.out.println("");
		        // imprimindo os números pares
		        System.out.println("Vetor Par:");
		        for(int n : vetorpar) 
				{
		        	if(n != 0) {
		        		System.out.print(" "+n+" ");
		        	}
		        }
		    }
			}
        }
}