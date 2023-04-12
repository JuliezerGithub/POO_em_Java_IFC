package Questões;

import java.util.Scanner;

/*7. Crie uma classe java com o nome “Programa7” que leia um número inteiro e imprima
o seu antecessor e seu sucessor que sejam par. 
*/

public class Programa7 {

	public static void main(String[] args) {
		int num1 = 0, antecessor = 0, sucessor = 0;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("\nDigite um número inteiro: ");
			num1 = sc.nextInt();
		}
			antecessor = num1 - 1;
			sucessor = num1 + 1;
			
			if (antecessor %2 == 0) {
			System.out.println("\nO número "+antecessor+" é o antecessor par!");
			}else {
				antecessor = antecessor - 1;
				System.out.println("\nO número "+antecessor+" é o antecessor par!");
			}
			if (sucessor %2 == 0) {
				System.out.println("\nO número "+sucessor+" é o sucessor par!");
				}else {
					sucessor = sucessor + 1;
					System.out.println("\nO número "+sucessor+" é o sucessor par!");
				}
	}
}