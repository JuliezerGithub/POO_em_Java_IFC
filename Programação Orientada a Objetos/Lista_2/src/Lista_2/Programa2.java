package Lista_2;

import java.util.Scanner;
/* 
 * 2) Crie uma classe “Programa2” que contenha um algoritmo que leia um número do usuário e informe se e o número é positivo ou negativo 
 */

public class Programa2 {
	
	public static void main (String [] arg) {//Recebe o número digitado pelo usuáio
		float num = 0.0f;
		try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Digite um número para saber se ele é positivo ou negativo: ");
		num = sc.nextFloat();
		}
		if (num <= 0) {
			System.out.println("O número é negativo");
			
		}else {
			System.out.println("O número é positivo");
		}
		
		return;
		}
}
