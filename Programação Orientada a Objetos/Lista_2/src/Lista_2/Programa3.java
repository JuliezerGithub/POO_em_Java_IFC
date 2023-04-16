package Lista_2;

import java.util.Scanner;
/*
 * 3) Crie uma classe “Programa3” que receba do usuário um valor par, e apresente os próximos 10 números pares. 
 */
public class Programa3 {
	public static void main (String [] arg) {//Recebe o número digitado pelo usuáio
		float num = 0.0f;
		try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Digite um número para saber os próximos 10 números pares: ");
		num = sc.nextFloat();
		}
		if (num%2 == 0) {
			System.out.println("\nO numero "+num+" é par!");

			while (num <=  10) {
				System.out.println("\n "+num);
				num = num + 2;
			}
			} else {
			System.out.println("\nO numero "+num+" é impar. Reinicie o programa e insira um valor par!");
			}
	}
}
