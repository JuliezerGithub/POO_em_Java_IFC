package Aula2;

import java.util.Arrays;

public class Exemplo2 {

	public static void main(String[] args) {
		
		
		//Vetores
		//int vetor[]; // null
		//int[] vetor2; // null
		
		int vetor[] = new int[5];
		int[] vetor2 = {1,2,3,4,5};
		String[] vetor3 = {"oi","tudo","bem","boa","noite"};
		String vetor6[] = new String[5];
		
		String palavra = vetor3[4]; //noite
		
		for(int i=0; i<vetor3.length;i++) //ler todo o vetor
		{
			System.out.println(vetor3[i]);
		}
		
		//For EACH
		for(String elemento:vetor3)
		{
			System.out.println(elemento);//mostra todo o vetor
			if(elemento.equalsIgnoreCase("bem"))// percorre o vetor até encontrar a palavra bem, exemplo corta as palavras boa ,e, noite
			{
				break;//sai do laço
			}
		}
		
		//Copia de vetores
		int[] b = vetor2;// Apontamento de memória //não é copia porque ocupa o mesmo espaço da memoria
		int[] z = Arrays.copyOf(vetor2, vetor2.length);
		
		int[] s = {100,5,6,88,123,56,89,6,35,45,0,1,5};
		
		//ordenar vetores
		Arrays.sort(s);
		
		for(int e:s)
		{
			System.out.print(e+" ");
		}
		
		

	}

}
